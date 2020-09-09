package POO;

public class TestFecha3 {
    public static void main(String []argumentos){
        Fecha f = new Fecha(2,10,1970);
        //imprimo el dia
        System.out.println("Dia = "+f.getDia());
        //imprimo el mes
        System.out.println("Mes = "+f.getMes());
        //imprimo el anio
        System.out.println("Año = "+f.getAnio());
        //imprimo la fecha
        System.out.println(f.toString());
        
        System.out.println("------------------");
        //Dos fechas son iguales
        Fecha f2 = new Fecha(13,3,1995);
        //imprimo el dia
        System.out.println("Dia = "+f2.getDia());
        //imprimo el mes
        System.out.println("Mes = "+f2.getMes());
        //imprimo el anio
        System.out.println("Año = "+f2.getAnio());
        //imprimo la fecha
        System.out.println(f2.toString());
        System.out.println("-------------------");
        if (f.equals(f2)) {
            System.out.println("Son iguales");
        }
        else{System.out.println("Son diferentes");}
    }
}

