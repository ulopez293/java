package Framework_VERY_HARD;

import AplicacionCliente.DeptDTO;
import AplicacionCliente.EmpDTO;

public class TestDB1 {
    public static void main(String[] args){
        //leo el archivo de configuracion
        XFactory.load("src/Framework/configuracion.xml");
        //obtengo una session
        XSession session = XFactory.getInstancia().getSession();
        /*
        //busco el departamento cuyo deptno es 1
        DeptDTO dept;
        dept = (DeptDTO)session.findByPrimaryKey(DeptDTO.class,1);
        System.out.println(dept);
        //busco el empleado cuyo deptno es 10
        EmpDTO emp = (EmpDTO)session.findByPrimaryKey(EmpDTO.class,10);
        System.out.println(emp);

        */
    }
}
