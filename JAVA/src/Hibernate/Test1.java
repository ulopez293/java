package Hibernate;

import org.hibernate.Session;

public class Test1 {
    public static void main(String[] args){
        //obtengo la session a traves del sessionFactory
        Session session = HibernateSessionFactory.getSession();
        //busco por primary key
        Dept d = (Dept)session.get(Dept.class,1);
        //si lo encontre entonces muestro los datos
        if (d!=null) {
            System.out.print(d.getDeptno()+", ");
            System.out.print(d.getDname()+", ");
            System.out.print(d.getLoc());
        }
        //cierro la session
        session.close();
    }
}
