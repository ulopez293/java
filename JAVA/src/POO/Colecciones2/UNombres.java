package POO.Colecciones2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class UNombres {
    public static Collection<String> obtenerLista(){
       //Vector<String> v  = new Vector<String>();
       ArrayList<String> v = new ArrayList<String>();
       v.add("Pablo");
       v.add("Juan");
       v.add("Carlos");
       return v;
    }
}
