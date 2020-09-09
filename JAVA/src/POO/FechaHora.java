package POO;

public class FechaHora extends FechaDetallada {
    private int hora;
    private int minuto;
    private int segundo;

    public FechaHora(String f, int hora, int minuto, int segundo) {
        super(f);
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public String toString(){
        //invocamos al metodo toString de nuestro padre
        return super.toString()+" ("+hora+":"+minuto+":"+segundo+")";
    }
    
}
