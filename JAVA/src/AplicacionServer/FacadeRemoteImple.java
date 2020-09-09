package AplicacionServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.Vector;

public class FacadeRemoteImple extends UnicastRemoteObject implements FacadeRemoto{
    public FacadeRemoteImple() throws RemoteException {
        super();
    }
    @Override
    public Collection<String> obtenerDepartamentos() throws RemoteException {
        DeptDAO dao = (DeptDAO)UFactory.getInstancia("DEPT");
        Collection<DeptDTO> coll = dao.buscarTodos();
        Vector<String> ret = new Vector<String>();
        for(DeptDTO dto:coll){
            ret.add(dto.toString());
        }
        return ret;
    }
    @Override
    public Collection<String> obtenerEmpleados(int deptno) throws RemoteException {
        EmpDAO dao = (EmpDAO)UFactory.getInstancia("EMP");
        Collection<EmpDTO> coll = dao.buscarXDept(deptno);
        Vector<String> ret = new Vector<String>();
        for(EmpDTO dto:coll){
            ret.add(dto.toString());
        }
        return ret;
    }
}
