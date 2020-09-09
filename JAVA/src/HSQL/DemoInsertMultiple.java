package HSQL;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoInsertMultiple {
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
            String sql = "";
            sql += "INSERT INTO dept (deptno, dname, loc) ";
            sql += "VALUES(?,?,?) ";
            //preparo la sentencia que voy a ejecutar
            pstm = con.prepareStatement(sql);
            //seteamos los valores en los parametros
            for (int i = 100; i < 150; i++) {
                pstm.setInt(1, i);
                pstm.setString(2, "NombreDept "+i);
                pstm.setString(3, "LocDept "+i);
                System.out.println(pstm);
                int rtdo = pstm.executeUpdate();               
                if (rtdo >= 1) {
                    System.out.println("1 fila correctamente insertada");
                }else{
                    throw new RuntimeException("Error...");
                }
            }

        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }   
}
