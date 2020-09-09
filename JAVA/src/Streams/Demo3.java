package Streams;

import java.io.FileInputStream;

public class Demo3 {
    public static void main(String args[]) throws Exception{
        FileInputStream fis = new FileInputStream("src/Streams/demo.txt");
        int c = fis.read();
        while(c!=-1){
            System.out.print((char)c);
            c = fis.read();
        }
        fis.close();
    }
}
