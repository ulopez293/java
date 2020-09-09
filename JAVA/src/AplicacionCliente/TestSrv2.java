package AplicacionCliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TestSrv2 {
    public static void main(String args[])throws Exception{
        Socket s = new Socket("localhost",5432);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        //solicito servicio codigo 1
        dos.writeInt(2);
        //envio el deptno
        dos.writeInt(1);
        //el server me indica cuantos departamentos va a enviar
        int n = dis.readInt();
        for(int i=0;i<n;i++){
            System.out.println(dis.readUTF());
        }
        dis.close();
        dos.close();
        s.close();
    }
}
