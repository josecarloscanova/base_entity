package org.nanotek.base.calendar;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
//@EntityListeners(org.nanotek.base.date.jpa.DateBaseEventListener.class)
@SuppressWarnings("serial")
public class DateBase extends Datable {

	private Integer day; 
	
	private Integer month; 
	
	private Integer year;

	@OneToMany (orphanRemoval=false,fetch=FetchType.EAGER)
	private Set<DayBase> setDayBase = new HashSet<DayBase> ();
	
	public DateBase(){
	} 
	
	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Set<DayBase> getSetDayBase() {
		return setDayBase;
	}

	public void setSetDayBase(Set<DayBase> setDayBase) {
		this.setDayBase = setDayBase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateBase other = (DateBase) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

}
