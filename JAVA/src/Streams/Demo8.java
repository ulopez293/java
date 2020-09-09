package Streams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo8 {
    public static void main(String args[]) throws Exception{
        String archivo = "src/Streams/personas.dat";
        BufferedOutputStream salidaDatos = new BufferedOutputStream(new FileOutputStream(archivo));
        ObjectOutputStream salidaObjetoDatos = new ObjectOutputStream(salidaDatos);
        salidaObjetoDatos.writeObject(new Persona(10,"Pablo","23.112.223"));
        salidaObjetoDatos.writeObject(new Persona(20,"Pedro","35.213.321"));
        salidaObjetoDatos.writeObject(new Persona(30,"Juan","17.554.843"));
        salidaObjetoDatos.close();
        salidaDatos.close();
    }
}
