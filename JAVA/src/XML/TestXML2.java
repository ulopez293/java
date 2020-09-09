package XML;

public class TestXML2 {
    public static void main(String args[]){
        ConnectionPoolTag cp = ConnectionPoolTag.getInstancia();
        //obtengo y muestro los datos de la conexion HSQLDB
        ConnectionTag c1 = cp.getJdbc().getConnectionTag("HSQLDB");
        System.out.println(c1.getDriver());
        System.out.println(c1.getUrl());
        System.out.println(c1.getUsr());
        System.out.println(c1.getPwd());
        System.out.println("-----------------------------");
        //obtengo y muestro los datos de la conexion ORACLE
        ConnectionTag c2 = cp.getJdbc().getConnectionTag("ORACLE");
        System.out.println(c2.getDriver());
        System.out.println(c2.getUrl());
        System.out.println(c2.getUsr());
        System.out.println(c2.getPwd());
        System.out.println("-----------------------------");
        //obtengo y muestro los datos del pool P1
        PoolTag t1 = cp.getPools().getPoolTag("P1");
        System.out.println(t1.getName());
        System.out.println(t1.getMaxsize());
        System.out.println(t1.getMinsize());
        System.out.println(t1.getSteep());
        System.out.println("-----------------------------");
        //obtengo y muestro los datos del pool P2
        PoolTag t2 = cp.getPools().getPoolTag("P2");
        System.out.println(t2.getName());
        System.out.println(t2.getMaxsize());
        System.out.println(t2.getMinsize());
        System.out.println(t2.getSteep());
    }
}
