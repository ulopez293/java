package Aplicacion1;

import java.util.Collection;

public class Facade {
    public Collection<DeptDTO> obtenerDepartamentos(){
        DeptDAO deptDao = (DeptDAO) UFactory.getInstancia("DEPT");
        return deptDao.buscarTodos();
    }
    
    public Collection<EmpDTO> obtenerUltimosEmpleados(int n){
        EmpDAO empDao = (EmpDAO) UFactory.getInstancia("EMP");
        return empDao.buscarUltimosEmpleados(n);
    }
    
    public Collection<EmpDTO> obtenerEmpleados(int deptno){
        EmpDAO empDao = (EmpDAO) UFactory.getInstancia("EMP");
        return empDao.buscarXDept(deptno);
    }
}
