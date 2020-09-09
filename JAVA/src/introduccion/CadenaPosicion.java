package introduccion;

public class CadenaPosicion {
    public static void main(String args[]){
        String s = "Esto es una Cadena de caracteres";
        
        int pos1 = s.indexOf('C');
        int pos2 = s.lastIndexOf('C');
        int pos3 = s.indexOf('x');
        
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
    }
}
