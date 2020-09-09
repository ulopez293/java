package Aplicacion1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;

public abstract class DeptDAO {
    //metodo abstracto, debe ser resuelto en las subclases
    public abstract Collection<DeptDTO> buscarTodos();

}
