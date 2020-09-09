package Excepciones;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aplicacion {
    public Usuario login(String usrname, String password)throws ErrorFisicoException{
        try {
            //leemos el archivo de propiedades
            ResourceBundle rb = ResourceBundle.getBundle("Excepciones.usuario");
            //leemos el valor de la propiedad usrname
            String usr = rb.getString("usrname");
            //leemos el valor de la propiedad password
            String pwd = rb.getString("password");
            //definimos la variable de retorno
            Usuario u = null;
            //si coinciden los datos proporcionados con los leidos
            if (usr.equals(usrname) && pwd.equals(password)) {
                //instancio y seteo todos los datos
                u = new Usuario();
                u.setUsuario(usr);
                u.setPassword(pwd);
                u.setNombre(rb.getString("nombre"));
                u.setCorreo(rb.getString("email"));
            }
            //retorno la instancia o null sino entro al if
            return u;
        }catch(Exception ex){
            //cualquier error "salgo por excepcion"
            throw new ErrorFisicoException(ex);
        }
    }
}
