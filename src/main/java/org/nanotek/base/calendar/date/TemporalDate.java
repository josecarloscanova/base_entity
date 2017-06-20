package org.nanotek.base.calendar.date;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.nanotek.base.LongBase;

/**
 * Something like a date... 
 * Used mainly to specify "kinds of dates, which means, designate that a certain date
 * is on different contexts, for example, DateBirth = DateDeath on 2 different entitites.
 * Uses same record "Date" but points to different kind of records, also 
 * can group records of same type like "persons which born on such date". 
 * The precision of the record is yyyy-mm-dd, 
 * it is not intended to specify hour-minute-second. 
 * 
 * TODO: Change to a gregorian calendar.
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class TemporalDate extends LongBase {
	
	@Temporal(TemporalType.DATE)
	protected Date date;
	
	public TemporalDate() {
		super();
	} 
	
	public TemporalDate(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(@NotNull Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((date == null) ? 0 : date.hashCode());
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
		TemporalDate other = (TemporalDate) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TemporalDate [date=" + date + "]";
	}

}
