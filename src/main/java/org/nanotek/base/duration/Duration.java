package org.nanotek.base.duration;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.nanotek.base.LongBase;

/**
 * Used to mark a duration on milliseconds (as default precision) 
 * of some durable event (something that occurs among a timeline) 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class Duration extends LongBase{

	@Enumerated
	protected DurationType durationType; 
	
	protected Long duration; 
	
	public Duration () 
	{ 
		durationType = DurationType.Other;
	}

	public DurationType getDurationType() {
		return durationType;
	}

	public void setDurationType(DurationType durationType) {
		this.durationType = durationType;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((duration == null) ? 0 : duration.hashCode());
		result = prime * result
				+ ((durationType == null) ? 0 : durationType.hashCode());
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
		Duration other = (Duration) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (durationType != other.durationType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Duration [durationType=" + durationType + ", duration="
				+ duration + "]";
	}
	
	
}
