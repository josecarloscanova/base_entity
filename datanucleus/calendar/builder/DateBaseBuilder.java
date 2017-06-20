package test.org.nanotek.datanucleus.calendar.builder;

import java.util.Calendar;

import org.nanotek.Builder;
import org.nanotek.base.date.DateBase;

public class DateBaseBuilder implements Builder <DateBase>{

	private Calendar calendar;

	public DateBaseBuilder () 
	{ 
		calendar = Calendar.getInstance();
	}
	
	public DateBaseBuilder (Calendar calendar) 
	{ 
		this.calendar = calendar; 
		
	}

	@Override
	public DateBase build() {
		
		DateBase dateBase = new DateBase(); 
		dateBase.setYear(this.calendar.get(Calendar.YEAR));
		dateBase.setMonth(this.calendar.get(Calendar.MONTH)); 
		dateBase.setDay(this.calendar.get(Calendar.DAY_OF_MONTH));
		
		return dateBase;
		
	}
	
}
