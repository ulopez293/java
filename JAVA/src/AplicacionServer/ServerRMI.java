package AplicacionServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerRMI {
    public static void main(String args[]) throws Exception {
        FacadeRemoteImple f = new FacadeRemoteImple();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("FacadeRemoto", f);
    }
}
