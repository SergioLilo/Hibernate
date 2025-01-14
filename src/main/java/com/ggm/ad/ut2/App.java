package com.ggm.ad.ut2;

import com.ggm.ad.ut2.model.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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



            Transaction tx = session.beginTransaction();
            // Aquí puedes realizar operaciones con la BD
            /*
            Costume costume = new Costume();
            costume.setName("Disfraz de Magician2");
            costume.setPrice(30.0);
            session.persist(costume);

            */
            /*
            Costume costume=session.find(Costume.class,1);

            Entreteiner entertainer = new Entreteiner();
            entertainer.setFirstName("Pablo");
            entertainer.setLastName("Silas");
            entertainer.setDni("12345345");
            entertainer.setCostume(costume);

             session.persist(entertainer);
        */

            /*
            Presenter presenter=new Presenter();
            presenter.setDni("12345678");
            presenter.setName("Presentador1");
            presenter.setYear(24);
            presenter.setLastName("PResntadin");
            session.persist(presenter);
             tx.commit();
            */
            /*
            Particular particular =new Particular();

            particular.setProvince("Madrid");
            particular.setMunicipality("Madrid");
            particular.setPhone("612345678");
            particular.setStreet("Calle Gran Vía");
            particular.setFirstName("Juan");
            particular.setLastName("Pérez");
            particular.setDni("12345678Z");

            session.persist(particular);*/


            Costume costume =session.find(Costume.class,1);
            tx.commit();
            System.out.println(costume);



            /*
            System.out.println("Adios");
            Presenter presenter=session.find(Presenter.class,1);
            Client client=session.find(Client.class,1);

            List<Client> clients=new ArrayList<>();
            clients.add(client);
            List<Presenter> presenters=new ArrayList<>();
            presenters.add(presenter);
            List<Entreteiner> entreteiners=new ArrayList<>();
            Entreteiner entreteiner=session.find(Entreteiner.class,1);
            entreteiners.add(entreteiner);

            Event event=new Event();
            event.setName("Primer Evento");
            event.setPrice(30);
            event.setClients(clients);
            event.setPresentador(presenter);
            event.setEntreteiners(entreteiners);
            event.setDescription("EVENTAZO");
            event.setSchedule(LocalDateTime.now());

            session.persist(event);
            tx.commit();
*/
        /*
            Event event=session.find(Event.class,3);
            session.remove(event);

            tx.commit();

        */
            /*
            Costume costume = new Costume();
            costume.setName("Disfraz");
            costume.setPrice(100);
            costume.setEntreteiners(entreteiners);

            // Guardar el disfraz en la base de datos
            session.save(costume);
            */
            // Commit de la transacción
            //session.getTransaction().commit();

        }


    }


    }






