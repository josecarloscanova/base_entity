package test.org.nanotek.datanucleus.calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.nanotek.Builder;
import org.nanotek.base.date.CalendarBase;
import org.nanotek.base.date.CalendarGroupType;
import org.nanotek.base.date.DateBase;

public class CalendarGenerationTest {

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
		
		CalendarBaseBuilder calBuilder = new CalendarBaseBuilder(); 
		calBuilder.prepare(CalendarGroupType.DATE);
		DateBase dateBase = new DateBase(); 
		CalendarBase base = calBuilder.build(); 
		base.setReferenceDate(dateBase);
		
	}

	@After
	public void shutDown()
	{ 
		if (em !=null && em.isOpen()) 
			em.close();
		if (emf !=null && emf.isOpen()) 
			emf.close();
	}
	
	class CalendarBaseBuilder implements Builder<CalendarBase>{

		private CalendarGroupType calendarGroupType;

		public void prepare (CalendarGroupType calType)
		{ 
			this.calendarGroupType = calType;
		}
		
		@Override
		public CalendarBase build() {
			CalendarBase calBase = new CalendarBase(); 
			calBase.setGroupType(calendarGroupType);
			return calBase;
		} 
		
	}
}
