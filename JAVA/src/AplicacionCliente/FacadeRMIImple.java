package AplicacionCliente;

import AplicacionServer.FacadeRemoto;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FacadeRMIImple implements Facade {
    public FacadeRemoto remoto;
    public FacadeRMIImple(){
        //pbtengo el objeto remoto
        remoto = (FacadeRemoto)ServiceLocatorRMI.lookup("FacadeRemoto");
    }
    @Override
    public Collection<DeptDTO> obtenerDepartamentos() {
        try {
            //delego la llamada
            Collection<String> coll = remoto.obtenerDepartamentos();
            //convierto la coleccion
            Vector<DeptDTO> ret = new Vector<DeptDTO>(); 
            for(String s:coll){
                ret.add(UDto.stringToDeptDTO(s));
            }
            return ret;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    @Override
    public Collection<EmpDTO> obtenerEmpleados(int deptno) {
        try {
            //delego la llamada
            Collection<String> coll = remoto.obtenerEmpleados(deptno);
            //convierto la coleccion
            Vector<EmpDTO> ret = new Vector<EmpDTO>(); 
            for(String s:coll){
                ret.add(UDto.stringToEmpDTO(s));
            }
            return ret;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    
}
