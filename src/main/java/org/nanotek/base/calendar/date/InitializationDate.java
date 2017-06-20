package org.nanotek.base.calendar.date;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Simple DateBirth date joins a specific temporal date with Person Entity.
 * Need to alter to PersonBirthDate.
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
@Inheritance (strategy=InheritanceType.JOINED)
public class InitializationDate extends TemporalDate{ 
	
	@Enumerated (EnumType.STRING)
	protected InitializationDateType initializationDateType = InitializationDateType.Other; 
	
	public InitializationDate()
	{ 
		super();
	}
	
	
	public InitializationDate(Date date) {
		super(date);
	}

	public InitializationDateType getInitializationDateType() {
		return initializationDateType;
	}


	public void setInitializationDateType(
			InitializationDateType initializationDateType) {
		this.initializationDateType = initializationDateType;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((initializationDateType == null) ? 0
						: initializationDateType.hashCode());
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
		InitializationDate other = (InitializationDate) obj;
		if (initializationDateType != other.initializationDateType)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "InitializationDate [initializationDateType="
				+ initializationDateType + "]";
	}

	
	
}
