
package introduccion;

public class CadenaPosicion2 {
     public static void main(String args[]){
        String s = "Un buen libro de Java, un buen material";
        
        int pos1 = s.indexOf("buen");        //retorna 3
        int pos2 = s.lastIndexOf("buen");    //retorna 26
        System.out.println(pos1);
        System.out.println(pos2);
    }  
}
