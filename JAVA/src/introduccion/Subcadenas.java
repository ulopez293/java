package introduccion;

public class Subcadenas {
    public static void main (String jajaja[]){
        String s = "Esto Es Una Cadena de caracteres";
        
        String s1 = s.substring(0,7);
        String s2 = s.substring(8,11);
        
        //toma desde el caracter 8 hasta el final
        String s3 = s.substring(8);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
