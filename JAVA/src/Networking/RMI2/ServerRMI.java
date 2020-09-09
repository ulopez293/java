package Networking.RMI2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerRMI {
    public static void main(String args[]) throws Exception{
        ObjetoRemotoImple obj = new ObjetoRemotoImple();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.list();
        registry.rebind("OBJRemoto", obj);
    }
}
