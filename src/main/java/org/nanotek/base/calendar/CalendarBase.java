package org.nanotek.base.calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;

/**
 * TODO: Check problems if Generator and Class Hierarchy.
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class CalendarBase extends LongBase{


	@Enumerated (EnumType.STRING)
	private CalendarGroupType groupType; 
	
	@OneToOne
	private Datable referenceDate;
	
	public CalendarBase(){}
	
	public CalendarGroupType getGroupType() {
		return groupType;
	}

	public void setGroupType(CalendarGroupType groupType) {
		this.groupType = groupType;
	}


	public Datable getReferenceDate() {
		return referenceDate;
	}

	public void setReferenceDate(Datable referenceDate) {
		this.referenceDate = referenceDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((groupType == null) ? 0 : groupType.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CalendarBase other = (CalendarBase) obj;
		if (groupType != other.groupType)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
