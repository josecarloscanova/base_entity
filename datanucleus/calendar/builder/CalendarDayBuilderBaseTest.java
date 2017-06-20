package test.org.nanotek.datanucleus.calendar.builder;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.nanotek.base.date.DateBase;
import org.nanotek.base.date.DayBase;
import org.nanotek.base.date.MinuteBase;

public class CalendarDayBuilderBaseTest {

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
		calendar.set(0, 0, 0, 0, 0);
		DayBaseBuilder dayBaseBuilder = new DayBaseBuilder(calendar);
		DayBase dayBase = dayBaseBuilder.build();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin(); 
		for (int i = 0 ; i < 24 ; i++) 
		{ 
			calendar.set(Calendar.HOUR_OF_DAY, i);
			for (int j = 0 ; j < 60;j++) { 
				calendar.set(Calendar.MINUTE, j);
				dayBase = dayBaseBuilder.build(); 
				em.persist(dayBase);
			} 
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
