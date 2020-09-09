package Aplicacion1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;

public class DeptDAOHsqlDBImple extends DeptDAO{
    
    @Override
    public Collection<DeptDTO> buscarTodos(){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            con = UConnection.getConnection();
            String sql = "SELECT deptno, dname, loc FROM dept";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            Vector <DeptDTO> ret = new Vector <DeptDTO> ();
            DeptDTO dto = null;
            
            while( rs.next() ){
                dto = new DeptDTO();
                dto.setDeptno(rs.getInt("deptno"));
                dto.setDname(rs.getString("dname"));
                dto.setLoc(rs.getString("loc"));
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
