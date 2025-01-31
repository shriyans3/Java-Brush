package org.example;


import org.example.Config.Appconfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //same object is being used created once in line 16 - singleton
        //prototype
//        ApplicationContext a = new ClassPathXmlApplicationContext("settings.xml");
//        Edho e = (Edho) a.getBean("Edho");
//        e.run();
//
//        Copper e1 = a.getBean("b1",Copper.class);
//
//        Bottle b = a.getBean(Bottle.class);

        ApplicationContext c = new AnnotationConfigApplicationContext(Appconfig.class);
        Office o = new Office();
        o.setName("AMAZON");
        o.setLocation("HYD");
        o.setFloors(1000);
        o.setSize(256666);

        //only for adding
        Office o2 = new Office();
//        SessionFactory sf = new Configuration().
//                configure("hibernate.cfg.xml").
//                buildSessionFactory();
//        Session session = sf.openSession();
//        Transaction t = session.beginTransaction();
//        session.persist(o);
//        t.commit();
//        session.close();
//        sf.close();
//        System.out.println(o);

        //for fetching
//        SessionFactory sf = new Configuration().
//                configure("hibernate.cfg.xml").
//                buildSessionFactory();
//        Session session = sf.openSession();
//        o2 = session.get(Office.class , "AMD");
//        System.out.println(o2);

        //for creating if not there and updating
        SessionFactory sf = new Configuration().
                configure("hibernate.cfg.xml").
                buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.merge(o);
        t.commit();
        session.close();
        sf.close();
        System.out.println(o);

        //remove
    }
}
