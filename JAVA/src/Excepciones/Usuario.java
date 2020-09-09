package Excepciones;

public class Usuario {
    private String nombre;
    private String usuario;
    private String password;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString(){
        String msj = "Felicidades, login exitoso\n";
        msj += "Nombre: "+nombre+"\n";
        msj += "Email: "+correo;
        return msj;
    }
}
