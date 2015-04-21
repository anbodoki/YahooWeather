package com.example.sandboxy.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

/**
 * Created by anano.bodokia on 4/21/2015.
 */
public class DBManager implements Serializable{

	private static EntityManagerFactory emf = null;
	public DBManager(){
	}
	public EntityManagerFactory getFactory(){
		if(emf !=null)
			emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
		return emf;
	}
	public static void insertRow(String s) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Weather w = new Weather();
		w.setChill("asd");
		w.setCity("sda");
		w.setCond("asdasd");
		w.setCountry("asdasd");
		w.setHumidity("asd");
		w.setRegion("asdasddas");
		w.setTemp("asdasd");
		em.persist(w);
		em.getTransaction().commit();
	}
}
