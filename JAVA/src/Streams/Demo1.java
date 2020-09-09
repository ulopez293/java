package Streams;

import java.io.FileInputStream;
import java.util.Scanner;

public class Demo1 {
    public static void main(String args[]) throws Exception {
        //abro el archivo
        FileInputStream fis = new FileInputStream("src/Streams/demo.txt");
        //instancio a scanner pasandole el FileInputStream
        Scanner sc = new Scanner(fis);
        int i = sc.nextInt();
        String n = sc.next();
        while(!n.equals("FIN")){
            System.out.println(i+", "+n);
            i = sc.nextInt();
            n = sc.next();
        }
        //cierro el archivo
        fis.close();
    }
}
