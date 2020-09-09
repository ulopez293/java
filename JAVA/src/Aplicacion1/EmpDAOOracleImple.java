package Aplicacion1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;

public class EmpDAOOracleImple extends EmpDAO{

    @Override
    protected String queryBuscarUltimosEmpleados() {
        //Sentencias SQL propiedad de Oracle
        String sql = "";
        sql += "SELECT empno, ename, hiredate, deptno, ROWNUM AS rn ";
        sql += "FROM (SELECT empno, ename, hiredate, deptno ";
        sql += "       FROM emp ";
        sql += "       ORDER BY hiredate DESC) ";
        sql += "WHERE rm <= ? ";
        return sql;
    }
    
}
