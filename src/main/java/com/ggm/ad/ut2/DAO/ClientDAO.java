package com.ggm.ad.ut2.DAO;

import com.ggm.ad.ut2.HibernateUtil;
import com.ggm.ad.ut2.model.Client;

import com.ggm.ad.ut2.model.Company;
import com.ggm.ad.ut2.model.Particular;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDAO {

    public Particular create(Particular clientCreate) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            Transaction tx = session.beginTransaction();
            session.persist(clientCreate);

            return clientCreate;
        }
    }
    public Company create(Company clientCreate) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            Transaction tx = session.beginTransaction();
            session.persist(clientCreate);

            return clientCreate;
        }
    }

    public Client findClientById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

         return session.find(Client.class, id);

        }
    }
    /*
    public Particular findClientByUniqueField(String dni) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

           return (Particular) session.createQuery("SELECT c FROM clientes_particulares c WHERE dni="+dni, Particular.class);
        }
    }

    public Company findClientByUniqueField(String dni) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return (Company) session.createQuery("SELECT c FROM clientes_empresas c WHERE cif="+dni, Company.class);
        }
    }

     */
}

