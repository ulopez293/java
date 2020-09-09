package POO;
import java.util.Scanner;
public class SumaDiasFecha {
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        //el usuario ingresa los datos de fecha
        System.out.print("Ingrese fecha (dd/mm/aaaa): ");
        //leo la fecha (cadena de caracteres) ingresada
        String sFecha = leer.next();
        //creo objeto de la clase fecha
        Fecha f = new Fecha(sFecha);
        //lo muestro
        System.out.println("La fecha ingresada es: "+f);
        //el usuario ingresa una cantidad de dias a sumar
        System.out.print("Ingrese dias a sumar (puede ser negativo): ");
        int diaSum = leer.nextInt();
        //le sumo esos dias a la fecha
        f.addDias(diaSum);
        //muestro la nueva fecha  (con los dias sumados)
        System.out.println("sumando "+diaSum+" dias,queda: "+f);
    }
}
