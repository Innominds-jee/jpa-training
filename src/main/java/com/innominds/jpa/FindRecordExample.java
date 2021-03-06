package com.innominds.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.innominds.model.EmployeeEntity;

public class FindRecordExample {

    public static void main(String[] args) {

        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("DERBYPU");
        final EntityManager em = emf.createEntityManager();
        final EmployeeEntity entity1 = em.find(EmployeeEntity.class, 1l);
        System.out.println(entity1);

        System.out.println(em.createNamedQuery("getEmployeeDTO").getResultList());

        em.close();
        emf.close();

    }
}
