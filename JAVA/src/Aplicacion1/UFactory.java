package Aplicacion1;

import java.util.Hashtable;
import java.util.ResourceBundle;

public class UFactory {
    private static Hashtable <String,Object> instancias = new Hashtable <String,Object>();
    
    public static Object getInstancia(String objName){
        try{
            //verifico si existe un objeto relacionado a objName
            //en la hashtable
            Object obj = instancias.get(objName);
                    
            //si no existe entonces lo instancio y lo agrego
            if (obj == null) {
                ResourceBundle rb =  ResourceBundle.getBundle("Aplicacion1.factory");
                String NombreClase = rb.getString(objName);
                
                obj = Class.forName(NombreClase).newInstance();
                
                //agrego el objeto a la hashtable
                instancias.put(objName, obj);
            }           
            return obj;
            
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
