package test.org.nanotek.datanucleus.calendar.builder;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.nanotek.base.date.DateBase;
import org.nanotek.base.date.MinuteBase;

public class CalendarMinuteBuilderBaseTest {

	EntityManagerFactory emf;
	EntityManager em;
	
	@Before
	public void start()
	{ 
		emf = Persistence.createEntityManagerFactory("CalendarEvents");
		em = emf.createEntityManager();
	}
	
	@Test
	public void test() {
		Calendar calendar = Calendar.getInstance();
		MinuteBaseBuilder minuteBaseBuilder = new MinuteBaseBuilder(calendar);
		MinuteBase dateBase = minuteBaseBuilder.build();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin(); 
		for (int i = 0 ; i < 24 ; i++) 
		{ 
			for (int j = 0 ; j < 60; j++) { 
				em.persist(dateBase);
				calendar.add(Calendar.MINUTE, 1);
				minuteBaseBuilder = new MinuteBaseBuilder(calendar);
				dateBase = minuteBaseBuilder.build();
			} 
			calendar.add(Calendar.HOUR, 1);
		}
		transaction.commit();
	}
	
	@After
	public void end()
	{ 
		if (em !=null && em.isOpen()) 
			em.close();
		if (emf !=null && emf.isOpen()) 
			emf.close();
	}
	
}
