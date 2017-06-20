package org.nanotek.base.calendar.date;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class BirthDate extends InitializationDate{

	public BirthDate()
	{ 
		postConstruct(); 
	}

	public BirthDate(Date date) {
		super(date);
		postConstruct(); 
	}
	
	public void postConstruct()
	{ 
		initializationDateType = InitializationDateType.BirthDate;
	}
}
