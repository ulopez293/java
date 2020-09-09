package POO;

public abstract class FiguraGeometrica { // las clases abstractas no pueden ser instanciadas
    private String nombre;
    //constructor
    public FiguraGeometrica(String nom) {
        nombre = nom;
    }  
    //metodo abstracto
    public abstract double area();
    //metodo estatico
    public static double areaPromedio(FiguraGeometrica arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].area();
        }
        return sum/arr.length;
    }
    //metodo tostring sobreescrito de object
    public String toString(){
        return nombre+" area = "+area();
    }
    //setters and getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
