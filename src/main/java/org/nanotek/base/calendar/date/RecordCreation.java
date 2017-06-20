package org.nanotek.base.calendar.date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@SuppressWarnings("serial")
public class RecordCreation extends InitializationDate {

	protected TemporalDateType temporalDateType = TemporalDateType.Record_Creation;

	public TemporalDateType getTemporalDateType() {
		return temporalDateType;
	}

	public void setTemporalDateType(TemporalDateType temporalDateType) {
		this.temporalDateType = temporalDateType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((temporalDateType == null) ? 0 : temporalDateType.hashCode());
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
		RecordCreation other = (RecordCreation) obj;
		if (temporalDateType != other.temporalDateType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecordCreation [temporalDateType=" + temporalDateType + "]";
	}
	
}
