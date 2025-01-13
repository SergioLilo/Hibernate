package com.ggm.ad.ut2;

import com.ggm.ad.ut2.model.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();

            // Aquí puedes realizar operaciones con la BD
            Event evento = new Event();


            session.persist(evento); // Persistir el evento
            session.getTransaction().commit(); // Confirmar los cambios
        }

        // Cerrar Hibernate al final
        // HibernateUtil.shutdown();
    }


    }






