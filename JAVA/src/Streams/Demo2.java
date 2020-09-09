package Streams;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo2 {
    public static void main(String args[])throws Exception {
        FileOutputStream fos = null;
        PrintStream stdErr = null;
        try {
            //abro el archivo
            fos = new FileOutputStream("src/Streams/errores.txt");
            //instancio un printstream basado en el input stream
            stdErr = new PrintStream(fos);
            //seteo la standar error
            System.setErr(stdErr);
            //error cuando i sea mayor que 4
            int[] arr = new int[5];
            for (int i = 0; i < 10; i++) {
                arr[i]=0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //cierro todo
                if(stdErr != null) stdErr.close();
                if(fos != null) fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
