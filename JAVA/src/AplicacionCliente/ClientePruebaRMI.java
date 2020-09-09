package AplicacionCliente;

import java.util.Collection;
import AplicacionServer.FacadeRemoto;

public class ClientePruebaRMI {
    public static void main(String[] args) throws Exception{
        //obtengo una referencia al objeto Remoto
        FacadeRemoto f = (FacadeRemoto)ServiceLocatorRMI.lookup("FacadeRemoto");
        //invoco un metodo
        Collection<String> sDepts = f.obtenerDepartamentos();
        for(String s:sDepts){
            System.out.println(s);
        }
        System.out.println("");
        //invoco otro metodo
        Collection<String> sEmps = f.obtenerEmpleados(1);
        for(String s:sEmps){
            System.out.println(s);
        }
    }
}
