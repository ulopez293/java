package HSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DemoMetaData {
    public static void main(String args[]){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            con = UConnection.getConnection();
            
            String sql = "";
            sql += "SELECT e.empno AS empno\n";
            sql += "       ,e.ename AS ename\n";
            sql += "       ,e.hiredate AS fecha\n";
            sql += "       ,e.deptno AS deptno\n";
            sql += "       ,d.dname AS dname\n";
            sql += "       ,d.loc AS loc\n";
            sql += "FROM emp e, dept d\n";
            sql += "WHERE e.deptno = d.deptno";
            
            pstm = con.prepareStatement(sql);
            /*fetch size
            int n = 100;
            pstm.setFetchSize(n);
            */
            rs = pstm.executeQuery();
            
            
            ResultSetMetaData md = rs.getMetaData();
            //Muestro la metadata
            _mostrarMetadata(md);
            //Muestro las filas del resultado set
            _mostrarData(rs);
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);            
        }
    }

    private static void _mostrarMetadata(ResultSetMetaData md) throws Exception {
        //cantidad de columnas del resultset
        int cantCols = md.getColumnCount();
        System.out.println(cantCols+" columnas obtenidas");
        System.out.println();
        for (int i = 1; i <= cantCols; i++) {
            System.out.print("Columna Nro."+i+", ");
            //label (alias o nombre) de la i-esima columna
            System.out.print("Label: "+md.getColumnLabel(i)+", ");
            //codigo de tipo de dato de la i-esima columna
            System.out.println("Type: "+md.getColumnType(i)+" (");
            //nombre del tipo de datos de la i-esima columna
            System.out.println(md.getColumnTypeName(i)+"), ");
            //precision del tipo de datos de la i-esima columna
            System.out.println("Precision: "+md.getPrecision(i));
        }
        System.out.println();
    }

    private static void _mostrarData(ResultSet rs) throws Exception {
        int cantCols = rs.getMetaData().getColumnCount();
        while(rs.next()){
            for (int i = 1; i <= cantCols; i++) {
                System.out.print(rs.getString(i));
                System.out.print(i<cantCols ? " ,":" ");
            }
            System.out.println();
        }
    }  

}
