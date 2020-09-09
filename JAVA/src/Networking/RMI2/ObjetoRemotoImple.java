package Networking.RMI2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetoRemotoImple extends UnicastRemoteObject implements ObjetoRemoto{
    public ObjetoRemotoImple() throws RemoteException {
        super();
    }   
    @Override
    public String obtenerSaludo(String nombre) throws RemoteException {
        return "Hola Mundo RMI - "+nombre;
    }
    
}