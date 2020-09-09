package AplicacionCliente;

import java.util.Collection;

public class TestSrv3 {
    public static void main(String args[]){
        Collection<DeptDTO> coll;
        coll = ServiceLocatorTCP.obtenerDepartamentos();
        for(DeptDTO dto: coll){
            System.out.println(dto);
        }
    }
}
