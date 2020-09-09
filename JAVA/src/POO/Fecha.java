package POO;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public int getDia() {
        //retorna valor de la variable Día
        return dia;
    }

    public void setDia(int dia) {
        //asigna el valor del parametro a la variable dia
        this.dia = dia;
    }

    public int getMes() {
        //retorna valor de la variable Mes
        return mes;
    }

    public void setMes(int mes) {
        //rasigna el valor del parametro a la variable Mes
        this.mes = mes;
    }

    public int getAnio() {
        //retorna valor de la variable Anio
        return anio;
    }

    public void setAnio(int anio) {
        //asigna el valor del parametro a la variable Anio
        this.anio = anio;
    }
    
    public String toString(){
        return getDia()+"/"+getMes()+"/"+getAnio();  //pude sustituir los get por los datos del objeto dia,mes,anio
    }
      
    //sobreescribimos el metodo equals que heredamos de object
    public boolean equals(Object objeto){   //introducimos un valor tipo object, pero puede ser de tipo Fecha
        Fecha otra = (Fecha)objeto;         //si arriba hubieramos utilizado fecha, no tendriamos que castear
        return (getDia() == otra.getDia()) && (getMes() == otra.getMes()) && (getAnio() == otra.getAnio()); //se pueden sustituir los gets por los datos del objeto
    }
    
    //constructor recibe dia, mes y año
    public Fecha(int dia, int mes, int anio) {
        //utilizamos metodos setters para ingresar los datos
        setDia(dia);
        setMes(mes);
        setAnio(anio);
        /* o podria ser:
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        */
    }
    
    //constructor sobrecargado, sin argumentos nulo
    public Fecha(){
    }
    
    //constructor sobrecargado, recibe string
    public Fecha(String s){
        //busco la primera ocurrencia de '/'
        int pos1=s.indexOf('/');
        //busco la ultima ocurrencia de '/'
        int pos2=s.lastIndexOf('/');
        //proceso el dia
        String sDia = s.substring(0,pos1);
        setDia(Integer.parseInt(sDia));
        //proceso el mes
        String sMes = s.substring(pos1+1,pos2);
        setMes(Integer.parseInt(sMes));
        //proceso el año
        String sAnio = s.substring(pos2+1);
        setAnio(Integer.parseInt(sAnio));
    }
    
    //retorna la fecha expresada en dias
    private int fechaToDias(){
        return (getAnio()*360)+(getMes()*30)+(getDia());
    }
    
    //asigna la fecha expresada en dias a los atributos
    private void diasToFecha(int i){
        //dividimos por 360 y obtenemos el año
        setAnio((int)i/360);
        //del resto de la division anterior
        //podremos obtener el mes y dia
        int resto = i % 360;
        //el mes es el resto dividido 30
        setMes((int) resto/30);
        //el resto de la division anterior son los dias
        setDia(resto % 30);
        //ajuste por si dia quedo en cero
        if (getDia() == 0) {
            setDia(30);
            setMes(getMes()-1);
        }
        //ajuste por si el mes quedo en cero
        if (getMes() == 0) {
            setMes(12);
            setAnio(getAnio()-1);
        }
    }
    
    //suma dias a fecha
    public void addDias(int d){
        //convierto la fecha a dias y le sumo d
        int sum = fechaToDias()+d;
        //la fecha resultante (sum) la separo en dia mes y año
        diasToFecha(sum);
    }
}
