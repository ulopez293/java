
package introduccion;

public class pruebarara {
    public static void main(String args[]){
        //creo un string buffer donde agrego una cadena de 1 y una de 2
        StringBuffer sb = new StringBuffer();
        sb.append("1");
        sb.append("2");
        System.out.println(sb + " : este es de tipo StringBuffer");
        //transformo el stringbuffer a string normal de nombre s
        String s = sb.toString();
        //tranformos de string a int o entero
        int b = Integer.parseInt(s);
        int a = 6;
        //sumo los 2 enteros
        int suma = a + b;
        //imprimo resultado de suma
        System.out.println(suma + " : ahora es un entero");
        //convierto int suma a string
        String sint = Integer.toString(suma);
        //agrego otra caden a suma
        sint = sint + " : ahora es una cadena o string";
        System.out.println(sint);
    }
}
