/*NOTA:
    LOS ARGUMENTOS SE DEBEN INTRODUCIR 
    POR LINEA DE COMANDOS
*/
package introduccion;

public class Argumentos {
    public static void main (String argumentos[]){
        for (int i = 0; i < argumentos.length; i++) {
            System.out.println(argumentos[i]);
        }
        System.out.println("Total: "+argumentos.length+" argumentos");
    }
}
