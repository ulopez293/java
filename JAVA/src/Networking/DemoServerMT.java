package Networking;
import java.io.*;
import java.net.*;
public class DemoServerMT {
    public static void main(String args[]) throws Exception{
        Socket s  = null;
        ServerSocket ss = new ServerSocket(5432);
        while(true){
            try{
                //Serversocket me da el socket
                s = ss.accept();
                //instancio un Thread
                (new Tarea(s)).start();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }

    private static class Tarea extends Thread{
        private Socket s = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        public Tarea(Socket s) {
            this.s = s;
        }
        public void run(){
            try{
                //informacion de la consola
                System.out.println("Se conectaron desde la IP: "+s.getInetAddress());
                //enmascaro la entrada y salida en bytes
                ois = new ObjectInputStream(s.getInputStream());
                oos = new ObjectOutputStream(s.getOutputStream());
                //leo el nombre que envia el cliente
                String nom = (String)ois.readObject();
                //armo un saludo personalziado que le quiero enviar
                String saludo = "Hola Mundo ("+nom+") _ "+System.currentTimeMillis();
                //envio el saludo al cliente
                oos.writeObject(saludo);
                System.out.println("Saludo enviado...");
            }catch(Exception ex){
                ex.printStackTrace();
            }finally{
                try{
                    if(oos != null)oos.close();
                    if(ois != null)ois.close();
                    if(s != null)s.close();
                    System.out.println("Conexion cerrada!");
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
