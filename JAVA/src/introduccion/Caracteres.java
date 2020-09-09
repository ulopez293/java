
package introduccion;

public class Caracteres {
    public static void main (String principal[]){
        char c;
        for (int i = 'A'; i <= 'Z'; i++) {
            //para asignar un int a un char debemos "castear"
            c = (char) i;
            System.out.println(c);
        }
    }
}
