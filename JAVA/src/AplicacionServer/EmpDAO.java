package AplicacionServer;

import SQL.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;

public abstract class EmpDAO {
    //cada implementacion debe sobreescribir este metodo
    //y retornar el sql propietario
    protected abstract String queryBuscarUltimosEmpleados();
    
    
    
    //Este Metodo ya no necesita ser abstracto porque puede obtener el query
    //invocando al metodo abstracto queryBuscarUltimosEmpleados
    public Collection<EmpDTO> buscarUltimosEmpleados(int n) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            con = ConnectionPool.getPool().getConnection();
            //el metodo abstracto me da el query a ejecutar
            String sql = queryBuscarUltimosEmpleados();
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, n);
            rs = pstm.executeQuery();
            
            Vector <EmpDTO> ret = new Vector <EmpDTO> ();
            EmpDTO dto = null;
            
            while( rs.next() ){
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setHiredate(rs.getDate("hiredate"));
                dto.setDeptno(rs.getInt("deptno"));
                ret.add(dto);
            }          
            return ret;
            
        }catch(Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (con != null){
                    ConnectionPool.getPool().releaseConnection(con);
                }
            }catch(Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
    
    public Collection<EmpDTO> buscarXDept(int deptno){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            con = UConnection.getConnection();
            String sql = "SELECT empno, ename, hiredate, deptno ";
            sql += "FROM emp ";
            sql += "WHERE deptno = ? ";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, deptno);
            rs = pstm.executeQuery();
            
            Vector <EmpDTO> ret = new Vector <EmpDTO> ();
            EmpDTO dto = null;
            
            while( rs.next() ){
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setHiredate(rs.getDate("hiredate"));
                dto.setDeptno(rs.getInt("deptno"));
                ret.add(dto);
            }          
            return ret;
            
        }catch(Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
            }catch(Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
}
