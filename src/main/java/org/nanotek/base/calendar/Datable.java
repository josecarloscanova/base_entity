package org.nanotek.base.calendar;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
/**
 * Date like registry. Can be used to be combined with other registries to maintain
 * historical events. 
 * 
 * Date registries that can be combined on specific resolutions from 
 * Year-Month-Day to Second-MiliSecond. 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@SuppressWarnings("serial")
public class Datable extends LongBase{
	
	@OneToOne
	protected CalendarBase calendarBase;
	
	public CalendarBase getCalendarBase() {
		return calendarBase;
	}

	public void setCalendarBase(CalendarBase calendarBase) {
		this.calendarBase = calendarBase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((calendarBase == null) ? 0 : calendarBase.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datable other = (Datable) obj;
		if (calendarBase == null) {
			if (other.calendarBase != null)
				return false;
		} else if (!calendarBase.equals(other.calendarBase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Datable [calendarBase=" + calendarBase + ", id=" + id
				+ ", recordCreationDate=" + recordCreationDate + "]";
	} 
	
}
