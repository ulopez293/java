package Streams;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class Demo7 {
    public static void main(String args[]) throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/Streams/writer.txt"));
        DataInputStream dis = new DataInputStream(bis);
        try {
            int i = dis.readInt();
            while(true){
                System.out.println(i);
                i = dis.readInt();
            }
        } catch (EOFException e) {
            System.out.println("--EOF--");
        }
        dis.close();
        bis.close();
    }
}
