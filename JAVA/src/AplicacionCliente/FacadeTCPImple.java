package AplicacionCliente;

import java.util.Collection;

public class FacadeTCPImple implements Facade {
    @Override
    public Collection<DeptDTO> obtenerDepartamentos() {
        return ServiceLocatorTCP.obtenerDepartamentos();
    }
    @Override
    public Collection<EmpDTO> obtenerEmpleados(int deptno) {
        return ServiceLocatorTCP.obtenerEmpleados(deptno);
    }    
}
