package HSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoDelete2 {
      public static void main(String args[]){
        Connection con = null;
        PreparedStatement pstm = null;
        try{
            //establezco la conexion unica
            con = UConnection.getConnection();
            //seteo autocommit en false
            con.setAutoCommit(false);
            
            //defino y ejecuto la sentencia delete
            String sql = "DELETE FROM emp WHERE empno = ?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, 60); 
            int rtdo = pstm.executeUpdate();
            
            //se afecto una sola fila como esperabamos...
            if (rtdo == 1) {
                //todo OK entonces commiteo la operacion
                con.commit();
            }else{
                throw new RuntimeException("Error...");
            }
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }finally {
            try{
                //rollback "por las dudas"
                if(con != null) con.rollback();
                if(pstm != null) pstm.close();
            }catch(Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }  
}