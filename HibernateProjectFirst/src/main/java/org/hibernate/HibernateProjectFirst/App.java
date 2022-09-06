package org.hibernate.HibernateProjectFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Project
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf = new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	conf.addAnnotatedClass(File.class);
    	
    	SessionFactory sf = conf.buildSessionFactory(); //standolone heavyweight object
    	Session session = sf.openSession();
        File file = new File(11,"10","0");
        session.beginTransaction();
        session.save(file);
        System.out.println(session.find(File.class,11));
        session.delete(file);
        session.getTransaction().commit();
        System.out.println(session.find(File.class,11));
        session.close();
    }
}
