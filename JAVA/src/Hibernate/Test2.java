package Hibernate;

import org.hibernate.Session;

public class Test2 {
    public static void main(String args[]){
        Session session = HibernateSessionFactory.getSession();
        //busco el empleado 1
        Emp e = (Emp) session.get(Emp.class, 1);  //me esta dando nulo e
        //muestro sus datos
        System.out.print(e.getEname()+", ");
        System.out.print(e.getHiredate()+", ");
        //accedo a la relacion many-to-one
        System.out.println(e.getDept().getDname());
        session.close();
    }
}
