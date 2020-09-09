package Networking;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer {
    public static void main(String args[]) throws Exception{
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        Socket s  = null;
        ServerSocket ss = new ServerSocket(5432);
        while(true){
            try{
                //el serversocket me da el socket, accept se bloqueado en esta linea
                //y espera la conexion del cliente
                s = ss.accept();
                //información en la consola
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
                if(oos != null)oos.close();
                if(ois != null)ois.close();
                if(s != null)s.close();
                System.out.println("Conexion cerrada!");
            }
        }
    }
}
