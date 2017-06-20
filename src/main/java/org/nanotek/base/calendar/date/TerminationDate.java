package org.nanotek.base.calendar.date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@SuppressWarnings("serial")
@Inheritance (strategy=InheritanceType.JOINED)
public class TerminationDate extends TemporalDate{

	@Enumerated (EnumType.STRING)
	protected TerminationDateType terminationDateType;

	public TerminationDate()
	{ 
		terminationDateType = TerminationDateType.Other;
	}
	
	
	public TerminationDateType getInitializationDateType() {
		return terminationDateType;
	}

	public void setInitializationDateType(TerminationDateType terminationDateType) {
		this.terminationDateType = terminationDateType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((terminationDateType == null) ? 0 : terminationDateType
						.hashCode());
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
		TerminationDate other = (TerminationDate) obj;
		if (terminationDateType != other.terminationDateType)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TerminationDate [terminationDateType=" + terminationDateType
				+ "]";
	} 
	
}
