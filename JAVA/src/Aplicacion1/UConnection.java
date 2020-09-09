package Aplicacion1;

import HSQL.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class UConnection {
    
    private static Connection con = null;
    public static Connection getConnection(){
        try{
            if (con == null) {
                //con esto determinamos cuando finalize el programa
                Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
                //aqui utilizamos un archivo de propiedades
                ResourceBundle rb = ResourceBundle.getBundle("HSQL.jdbc");
                //leemos el archivo de propiedades y lo asignamos en los Strings
                String driver = rb.getString("driver");
                String url = rb.getString("url");
                String pwd = rb.getString("pwd");
                String usr = rb.getString("usr");
                //levanto el driver
                Class.forName(driver);
                //establezco la conexion
                con = DriverManager.getConnection(url, usr, pwd);
            }
            //retorno la conexion
            return con;
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("Error al crear la conexion",ex);
        }
    }
    //Cerramos la conexión antes de que termine la aplicación
    private static class MiShDwnHook extends Thread {
        //justo antes de finalizar el programa la JVM invocara
        //a este metodo donde podemos cerrar la conexion
        @Override
        public void run() {
            try{
                Connection con = UConnection.getConnection();
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
    
}
