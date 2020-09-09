package introduccion;

import java.util.Scanner;

public class Array2 {
    public static void main (String []args){
        String dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un dia de la semana (numero): ");
        int v = leer.nextInt();
        if ( v <= dias.length){
            //recordemos que los arrays se numeran desde cero
            System.out.println(dias[v-1]);
        }else{
            System.out.println("Dia incorrecto");
        }
    }
}
