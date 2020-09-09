package POO.Interfaces;

public class ComunicadorGerente {
    //en esta clase el retorno es de tipo comunicador, recordar no es void
    public static Comunicador crearComunicador(){
        //una paloma mensaje es un comunicador
        //return new PalomaMensajera();
        //ahora retorno un telefono celular
        //cuya clase tambien implementa comunicador
        return new TelefonoCelular();
    }
}
