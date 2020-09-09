package POO.Interfaces;

public class TelefonoCelular implements Comunicador {
    public void enviarMensaje(String Mensaje){
        System.out.println("Mensaje mas rapido[celular]: "+ Mensaje);
    }
}
