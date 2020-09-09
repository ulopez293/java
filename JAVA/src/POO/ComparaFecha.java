package POO;
import java.util.Scanner;
public class ComparaFecha {
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        //Fecha f3 = new Fecha("13/03/1995");
        System.out.println("Ingrese Fecha3 dia/mes/año: ");
        String cadena = leer.nextLine();
        Fecha f3 = new Fecha(cadena);
        //el usario ingresa los datos de la fecha 1
        System.out.println("Ingrese Fecha1 (dia,mes,año): ");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        //creo objeto de la clase fecha
        Fecha f1 = new Fecha(dia,mes,anio);
        //el usuario ingresa los datos de la fecha 2
        System.out.println("Ingrese Fecha2 (dia,mes,año): ");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        //creo objeto de la clase fecha, sobrecargado
        Fecha f2 = new Fecha();
        f2.setAnio(anio);
        f2.setDia(dia);
        f2.setMes(mes);
        //creo objeto de la clase fecha, sobrecargada 3
        //muestro las fechas
        System.out.println("---------------------");
        System.out.println("Fecha 1 = "+f1);  //el system.out.println(obj.tostring) llama a
        System.out.println("Fecha 2 = "+f2);  //tostring de manera automatica, por lo tanto no hace falta poner obj.toString();
        System.out.println("Fecha 3 = "+cadena);
        //digo si son iguales o diferentes
        System.out.println("-------- comparacion fecha 1 y 3 ---------");
        String salida = (f1.equals(f3)) ? "Son fechas iguales" : "Son fechas distintas";  //if in-line, y utilizacion del equals de Fecha
        System.out.println(salida);
    }
}
