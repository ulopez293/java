package HSQL;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoSelect {
    public static void main(String args[]){
        //parametros para la conexion
        String usr = "sa";
        String pwd = "";
        String driver = "org.hsqldb.jdbcDriver";
        String url = "jdbc:hsqldb:hsql://localhost/xdb";
        try{
            //Definimos objetos como nulos hasta su asignacion
            Connection con = null;
            PreparedStatement pstm = null;
            ResultSet rs = null;
            //levanto el driver
            Class.forName(driver);
            //establezco la conexion
            con = DriverManager.getConnection(url,usr,pwd);
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
