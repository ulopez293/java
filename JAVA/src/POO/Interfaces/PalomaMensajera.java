package POO.Interfaces;

public class PalomaMensajera implements Comunicador {    
    public void enviarMensaje(String Mensaje){
        System.out.println("Mensaje[Paloma]: "+Mensaje);
    }
    public void hola(){
        System.out.println("Hola Mundo");
    }
}
