package POO;

public class FechaDetallada extends Fecha {
    private static String meses[]={"Enero"
            ,"Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
            "Septiembre","Octubre","Noviembre","Diciembre"};
    public String toString(){
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    }

    public FechaDetallada(String f) {
        //invocamos al constructor del padre
        super(f);
    }

    public FechaDetallada() {
        //invocamos al constructor del padre
        super();
    }

    public FechaDetallada(int dia, int mes, int anio) {
        //invocamos al constructor del padre
        super(dia, mes, anio);
    }
    
}
