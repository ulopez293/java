package Streams;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo4 {
    public static void main(String args[]) throws Exception{
        FileReader fr = new FileReader("src/Streams/demo.txt");
        FileWriter fw = new FileWriter("src/Streams/writer.txt");
        int c = fr.read();
        while(c!=-1){
            fw.write(c);
            c = fr.read();
        }
        fw.close();
        fr.close();
    }
}
