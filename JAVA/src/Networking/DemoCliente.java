package Networking;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class DemoCliente {
    public static void main(String args[]) throws Exception {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Socket s = null;
        try{
            //instancio el server con la ip y el port
            s = new Socket("127.0.0.1",5432);
            oos = new ObjectOutputStream(s.getOutputStream());
            ois = new ObjectInputStream(s.getInputStream());
            //envio un nombre
            oos.writeObject("Pablo");
            //recibo la respuesta (el saludo personalizado)
            String ret = (String)ois.readObject();
            //muestro la respuesta que envio el server
            System.out.println(ret);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(oos != null)oos.close();
            if(ois != null)ois.close();
            if(s != null)s.close();  
        }
    }
}
