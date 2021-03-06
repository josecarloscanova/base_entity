package org.nanotek.base.calendar;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
//@EntityListeners(org.nanotek.base.date.jpa.DayBaseEventListener.class)
@SuppressWarnings("serial")
public class DayBase extends Datable {

	private Integer hour; 
	
	private Integer minute; 

	private Integer bitWise;
	
	@OneToMany  (orphanRemoval=false,fetch=FetchType.EAGER)
	private Set<MinuteBase> setMinuteBase = new HashSet<MinuteBase>(); ; 
	
	public DayBase(){
//		setMinuteBase = new HashSet<MinuteBase>(); 
	} 
	
	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public Set<MinuteBase> getSetMinuteBase() {
		return setMinuteBase;
	}

	public void setSetMinuteBase(Set<MinuteBase> setMinuteBase) {
		this.setMinuteBase = setMinuteBase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hour == null) ? 0 : hour.hashCode());
		result = prime * result + ((minute == null) ? 0 : minute.hashCode());
		result = prime * result
				+ ((setMinuteBase == null) ? 0 : setMinuteBase.hashCode());
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
		DayBase other = (DayBase) obj;
		if (hour == null) {
			if (other.hour != null)
				return false;
		} else if (!hour.equals(other.hour))
			return false;
		if (minute == null) {
			if (other.minute != null)
				return false;
		} else if (!minute.equals(other.minute))
			return false;
		if (setMinuteBase == null) {
			if (other.setMinuteBase != null)
				return false;
		} else if (!setMinuteBase.equals(other.setMinuteBase))
			return false;
		return true;
	}

	public Integer getBitWise() {
		return bitWise;
	}

	public void setBitWise(Integer bitWise) {
		this.bitWise = bitWise;
	}

}
