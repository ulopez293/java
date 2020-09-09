package HSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DemoInsert2 {
    public static void main(String[] principal){
        Connection con = null;
        PreparedStatement pstm = null;
        try{
            //obtenemos la conexion
            con = UConnection.getConnection();
            //Transaccion
            con.setAutoCommit(false);
            String sql = "";
            sql+="INSERT INTO dept(deptno, dname, loc)";
            sql+="VALUES(?,?,?)";
            pstm = con.prepareStatement(sql);
            for (int i = 100; i < 150; i++) {
                pstm.setInt(1, i);
                pstm.setString(2, "NombreDept "+i);
                pstm.setString(3, "LocDept"+i);
                pstm.addBatch();
            }
            int rtdo[] = pstm.executeBatch();
            //Valido Transaccion
            if (rtdo.length >= 1) {
                con.commit();
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
