package Hibernate;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateSessionFactory {
    //nombre y ubicacion del archivo de configuracion
    public static String CONFIG_FILE = "src/hibernate.cfg.xml";
    private static SessionFactory sessionFactory = null;
    private static Session session = null;
    
    public static Session getSession() {
        if (sessionFactory == null) {
            File f = new File(CONFIG_FILE);
            sessionFactory = new AnnotationConfiguration().configure(f).buildSessionFactory();
            session = sessionFactory.openSession();
        }
        return session;
    }

}
