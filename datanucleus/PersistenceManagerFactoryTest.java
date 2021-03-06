package test.org.nanotek.datanucleus;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.nanotek.StringBase;

public class PersistenceManagerFactoryTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MusicBrainzImport");
		StringBase base = new StringBase(); 
		base.setValue("BaseId");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();	
		entityManager.persist(base);
		trans.commit();
	}

}
