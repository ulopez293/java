
package introduccion;
import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana (numero): ");
        int v = leer.nextInt();
        String dia;
        switch(v){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia incorrecto... El valor debe ser entre 1 y 7.";
        }
        System.out.println("Es "+dia);
    }
}
