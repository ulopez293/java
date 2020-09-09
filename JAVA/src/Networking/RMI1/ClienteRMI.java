package Networking.RMI1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import Networking.RMI2.ObjetoRemoto;

public class ClienteRMI {
    public static void main(String args[]) throws Exception{
        //optengo referencia a la registry del servidor (IP+PORT)
        Registry reg = LocateRegistry.getRegistry("localhost",1099);
        //ubico el objeto remoto identificado por "OBJRemoto"
        ObjetoRemoto objRemoto;
        objRemoto = (ObjetoRemoto)reg.lookup("OBJRemoto");
        //invocamos sus metodos como lo hago con cualquier otro objeto
        String saludo = objRemoto.obtenerSaludo("Pablo");
        System.out.println(saludo);
    }
}
