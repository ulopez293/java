package POO;

public class TestPolimorfismo {
    public static void main(String args[]){
        //a fec (de tipo Fecha) le asigno un objeto FechaDetallada
        Fecha fec = new FechaDetallada("25/02/2009");
        //a obj (de tipo object) le asigno un objeto FechaDetallada
        Object obj = new FechaDetallada("3/12/2008");
        //Imprimo los dos objetos
        System.out.println("fec = "+fec);
        System.out.println("obj = "+obj);
    }
}
