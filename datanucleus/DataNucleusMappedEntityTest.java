package test.org.nanotek.datanucleus;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.nanotek.StringBase;
import org.nanotek.base.music.gender.MusicalGender;

public class DataNucleusMappedEntityTest {

	EntityManagerFactory emf;
	EntityManager em;
	
	@Before
	public void start()
	{ 
		emf = Persistence.createEntityManagerFactory("MusicBrainzImport");
		em = emf.createEntityManager();
	}
	
	@Test
	public void test() {
		MusicalGender gender = new MusicalGender (); 
		StringBase genderBase = new StringBase("New Gender");
		gender.setGender(genderBase);
		gender.setId(10L);
		EntityTransaction transaction = em.getTransaction();
		transaction.begin(); 
		em.persist(genderBase);
		em.persist(gender);
		transaction.commit();
	}

	@After
	public void shutDown()
	{ 
		if (em !=null && em.isOpen()) 
			em.close();
		if (emf !=null && emf.isOpen()) 
			emf.close();
	}
}
