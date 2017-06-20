package org.nanotek.base.calendar.date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@SuppressWarnings("serial")
public class DeathDate extends TerminationDate {

	public DeathDate() 
	{ 
		super();
		terminationDateType = TerminationDateType.Death;
	}
	
}
