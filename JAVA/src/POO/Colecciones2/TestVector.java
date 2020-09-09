package POO.Colecciones2;

import java.util.Collection;
import java.util.Vector;

public class TestVector {
    public static void main(String args[]){
        //el metodo obtenerLista retorna una Collection
        Collection<String> coll = UNombres.obtenerLista();

        //itero la coleccion de nombres y muestro cada elemento
        for (String i: coll) {
            System.out.println(i);
        }
    }
}
