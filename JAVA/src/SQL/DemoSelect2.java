package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoSelect2 {
    public static void main(String args[]){
        Connection con = null;          //conexion
        PreparedStatement pstm = null;  //sentencia
        ResultSet rs = null;            //resultados
        try {
            //establezco la conexion unica
            con = ConnectionPool.getPool().getConnection();
            // :
            //   Realizo lo que tenga que hacer con la conexion
            // :
            //defino un query
            String sql = "SELECT empno,ename,hiredate,deptno FROM emp";
            //preparo la sentencia que voy a ejecutar
            pstm = con.prepareStatement(sql);
            //ejecuto la sentencia y obtengo los resultados en rs
            rs = pstm.executeQuery();
            //itero los resultados(registros)
            while( rs.next() ){
                //muestro los campos del registro actual
                System.out.print(rs.getInt("empno")+", ");
                System.out.print(rs.getString("ename")+", ");
                System.out.print(rs.getDate("hiredate")+", ");
                System.out.println(rs.getInt("deptno"));
            }
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);            
        }
    }
}
