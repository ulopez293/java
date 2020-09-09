package HSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoUpdate2 {
      public static void main(String args[]){
        Connection con = null;
        Statement stm = null;
        try{
            //establezco la conexion unica
            con = UConnection.getConnection();
            //seteo autocommit en false: autocomit representa exito de la transaccion
            con.setAutoCommit(false);
            //creo el statement y agrego updates bach
            stm = con.createStatement();
            stm.addBatch("UPDATE emp SET empno = 5 "
                         +"WHERE ename = 'Juan'");
            stm.addBatch("DELETE FROM dept"+" "
                         +"WHERE deptno = 5");
            //ejecuto y obtengo los resultados
            int[] rtdos = stm.executeBatch();
            System.out.println(rtdos+" No se ejecuto por la transaccion");
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }finally {
            try{
                //rollback "por las dudas"
                if(con != null) con.rollback();
                if(stm != null) stm.close();
            }catch(Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }     
}
