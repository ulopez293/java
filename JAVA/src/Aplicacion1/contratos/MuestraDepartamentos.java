package Aplicacion1.contratos;

import java.util.Collection;
import Aplicacion1.DeptDTO;
import Aplicacion1.UFactory;

public class MuestraDepartamentos {
    public static void main(String args[]){
        Dept d = (Dept) UFactory.getInstancia("DEPTINTER");
        Collection<DeptDTO> coll = d.buscarTodos();
        for (DeptDTO dto: coll) {
            System.out.println(dto);
        }
    }
}
