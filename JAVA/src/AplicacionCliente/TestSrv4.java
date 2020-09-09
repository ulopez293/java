package AplicacionCliente;

import java.util.Collection;

public class TestSrv4 {
    public static void main(String args[]){
        Collection<EmpDTO> coll = ServiceLocatorTCP.obtenerEmpleados(1);
        for(EmpDTO dto:coll){
            System.out.println(dto);
        }
    }
}
