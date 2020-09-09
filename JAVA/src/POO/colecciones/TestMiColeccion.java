package POO.colecciones;

import java.util.Scanner;

public class TestMiColeccion {
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        //leo el primer nombre
        System.out.println("Ingrese Nombre: ");
        String nom = leer.next();

        //instancio MiColeccion "especializada" en String
        MiColeccion<String> mc = new MiColeccion<String>(5);
        
        while(!nom.equals("FIN")){
            //inserto siempre en la posicion 0
            mc.insertar(nom, 0);
            //leo el siguiente nombre
            nom = leer.next();
        }
        String aux;
        
        //recorro la coleccion y tomo cada uno de sus elementos
        for (int i = 0; i < mc.cantidad(); i++) {
            //no es necesario castear porque el metodo obtener
            //retorna un string
            aux = mc.obtener(i);
            System.out.println(aux+" - "+aux.length()+" caracteres");
        }
    }           
}
