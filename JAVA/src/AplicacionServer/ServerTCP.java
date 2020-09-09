package AplicacionServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;

public class ServerTCP extends Thread{
    public static final int OBTENER_DEPARTAMENTOS = 1;
    public static final int OBTENER_EMPLEADOS = 2;
    private Socket socket = null;
    private DataInputStream dis = null;
    private DataOutputStream dos = null;
    public ServerTCP(Socket s) throws IOException{
        this.socket = s;
    }
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(5432);
        Socket s;
        while(true){
            s = ss.accept();
            new ServerTCP(s).start();
        }
    }
    @Override
    public void run(){
        try{
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            int codSvr = dis.readInt();
            switch(codSvr){
                case OBTENER_DEPARTAMENTOS:
                    _obtenerDepartamentos(dis,dos);
                    break;
                case OBTENER_EMPLEADOS:
                    _obtenerEmpleados(dis,dos);
                    break;
            }
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }finally{
            try{
                if(dos != null) dos.close();
                if(dis != null) dis.close();
                if(socket != null) socket.close();
            }catch(Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
    private void _obtenerDepartamentos(DataInputStream dis, DataOutputStream dos) {
        try{
            DeptDAO dao = (DeptDAO)UFactory.getInstancia("DEPT");
            //obtengo la coleccion de departamentos
            Collection<DeptDTO> coll = dao.buscarTodos();
            //envio el size al cliente
            int size = coll.size();
            dos.writeInt(size);
            //envio la coleccion de departamentos
            for(DeptDTO dto:coll){
                dos.writeUTF(dto.toString());
            }
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    private void _obtenerEmpleados(DataInputStream dis, DataOutputStream dos) {
        try{
            EmpDAO dao = (EmpDAO)UFactory.getInstancia("EMP");
            //leo el deptno
            int deptno = dis.readInt();
            //obtengo la coleccion de empleados
            Collection<EmpDTO> coll = dao.buscarXDept(deptno);
            //envio el size al cliente
            int size = coll.size();
            dos.writeInt(size);
            //envio la coleccion de empleados
            for(EmpDTO dto: coll){
                dos.writeUTF(dto.toString());
            }
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
