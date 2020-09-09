package Streams;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo9 {
    public static void main(String args[]) throws Exception{
        String archivo = "src/Streams/personas.dat";
        BufferedInputStream entradaDatos = new BufferedInputStream(new FileInputStream(archivo));
        ObjectInputStream entradaObjetoDatos = new ObjectInputStream(entradaDatos);
        try {
            Persona p = (Persona)entradaObjetoDatos.readObject();
            while(true){
                System.out.println(p);
                p = (Persona)entradaObjetoDatos.readObject();
            }
        } catch (EOFException e) {
            System.out.println("-- EOF --");
        }
        
        entradaObjetoDatos.close();
        entradaDatos.close();
    }
}
