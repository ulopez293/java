package AplicacionCliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServiceLocatorRMI {
    public static final String SERVER_IP = "localhost";
    public static final int SERVER_PORT = 1099;
    public static Object lookup(String objRemotoName){
        try{
            Registry registry = LocateRegistry.getRegistry(SERVER_IP,SERVER_PORT);
            return registry.lookup(objRemotoName);
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
