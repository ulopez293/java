package Excepciones;

public class Testlogin {
    public static void main(String args[]){
        try{
            Aplicacion app = new Aplicacion();
            //intento el login
            Usuario u = app.login("juan", "juan123sito");
            //muestro el resultado
            if (u == null) {
                System.out.println("usuario y/o password incorrecto");
            }else{
                System.out.println(u);
            }
        }catch(ErrorFisicoException ex){
            //ocurrio un error
            System.out.println("Servicio temporalmente interrumpido: ");
            System.out.println(ex.getMessage());
        }
    }
}
