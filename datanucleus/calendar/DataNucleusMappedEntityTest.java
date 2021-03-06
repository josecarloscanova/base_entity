package test.org.nanotek.datanucleus.calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.nanotek.base.date.CalendarBase;
import org.nanotek.base.date.CalendarGroupType;
import org.nanotek.base.date.Datable;
import org.nanotek.base.date.DateBase;
import org.nanotek.base.date.DayBase;

public class DataNucleusMappedEntityTest {

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
		
		try { 
			EntityTransaction transaction = em.getTransaction();
			transaction.begin(); 
//			CalendarBase calBase = new CalendarBase();
//			calBase.setGroupType(CalendarGroupType.DATE);
			DateBase date = new DateBase(); 
			date.setDay(10);
			date.setMonth(10);
			date.setYear(2011);
//			date.setCalendarBase(calBase);
//			calBase.setReferenceDate(date);
			DayBase dayBase = new DayBase();
//			CalendarBase dayBaseRef = new CalendarBase();
//			dayBaseRef.setGroupType(CalendarGroupType.DAY);
			dayBase.setHour(16);
			dayBase.setMinute(40);
//			date.setCalendarBase(calBase);
//			dayBaseRef.setReferenceDate(dayBase);
//			
//			em.persist(calBase);
			
			em.persist(date);
			em.persist(dayBase);
			date.getSetDayBase().add(dayBase);
//			em.persist(dayBaseRef);
//			
//			
			transaction.commit();
		} catch (Exception ex) 
		{ 
			ex.printStackTrace();
			throw (ex);
		}
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
