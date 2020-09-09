package POO.Interfaces;

public class MiAplicacionDeMensajes {
    public static void main(String args[]){
        //aqui defino el objeto del mismo tipo de la clase
        //puedo acceder a todos los metodos de la clase
        PalomaMensajera m = new PalomaMensajera();
        m.hola();
        m.enviarMensaje("hola este es un msj");
        //aqui basicamente defino el tipo absolutamente como Comunicador
        //solo puedo acceder a los metodos definidos en el comunicador
        Comunicador c = ComunicadorGerente.crearComunicador();
        c.enviarMensaje("Hola, este es mi msj");   
    }
}
