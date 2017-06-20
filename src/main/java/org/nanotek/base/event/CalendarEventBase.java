package org.nanotek.base.event;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.calendar.CalendarBase;

@Entity
@SuppressWarnings("serial")
public class CalendarEventBase extends EventBase {
	
	@OneToOne
	private CalendarBase eventDate;

	public CalendarEventBase ()
	{ 
		
	}
	
	public CalendarBase getEventDate() {
		return eventDate;
	}

	public void setEventDate(CalendarBase eventDate) {
		this.eventDate = eventDate;
	} 
	
	
}
