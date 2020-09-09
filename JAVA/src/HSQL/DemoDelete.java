package HSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoDelete {
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
            //defino una sentencia sql
            String sql = "DELETE FROM emp WHERE empno = ?";
            pstm = con.prepareStatement(sql);
            //quiero borrar al empleado cuyo empno es 20
            pstm.setInt(1, 20);
            int rtdo = pstm.executeUpdate();
            if (rtdo>1) {
                String mssg = "Error: "+rtdo+" filas eliminadas...";
                throw new RuntimeException(mssg);
            }
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }  
}
