package com.company.jpaDemo2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
        
    	Alien b = em.find(Alien.class, 4);
    	
    	System.out.println(b);
    	
    	Alien a = new Alien();
    	a.setAid(9);
    	a.setAname("Martin");
    	a.setTech("Oracle");
    	em.getTransaction().begin();
    	
    	em.persist(a);
    	
    	em.getTransaction().commit();
    	
    	
    }
}
