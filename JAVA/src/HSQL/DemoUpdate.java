package HSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoUpdate {
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
            //levanto el driver
            Class.forName(driver);
            //establezco la conexion
            con = DriverManager.getConnection(url,usr,pwd);
            //defino una sentencia sql
            String sql = "UPDATE dept SET loc = ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, "Buenos Aires");
            int rtdo = pstm.executeUpdate();
            System.out.println(rtdo+" filas Updateadas");
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }     
}
