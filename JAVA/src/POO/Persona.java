package POO;

public class Persona {
    private String nombre;          //atributo
    private String dni;             //atributo
    private Fecha fechaNacimiento;  //atributo
    private int cont = 0;           //variable de estado
    public Persona(String nombre, String dni, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString() {
        cont++;
        return nombre + ", DNI: " + dni
                      + ", nacido el: " + fechaNacimiento
                      + " (" + cont + ")";
    }

}
