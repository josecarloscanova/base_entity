package org.nanotek.base.calendar.date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

import org.nanotek.base.LongBase;

/**
 * LifeCycle object need a refactoring, generic classes... 
 * Subclasses like person life shall use a subclass. 
 * TODO:Change for mapped superclass. or an abstract class.
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class LifeCycle extends LongBase {

	private TemporalDate startDate; 
	
	private TemporalDate terminationDate; 
	
	public LifeCycle() {
		super();
	}


	public TemporalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(@NotNull InitializationDate startDate) {
		this.startDate = startDate;
	}


	public TemporalDate getTerminationDate() {
		return terminationDate;
	}


	public void setTerminationDate(TemporalDate terminationDate) {
		this.terminationDate = terminationDate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result
				+ ((terminationDate == null) ? 0 : terminationDate.hashCode());
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
		LifeCycle other = (LifeCycle) obj;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (terminationDate == null) {
			if (other.terminationDate != null)
				return false;
		} else if (!terminationDate.equals(other.terminationDate))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "LifeCycle [startDate=" + startDate + ", teminationDate="
				+ terminationDate + "]";
	}
}
