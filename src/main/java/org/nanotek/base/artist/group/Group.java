package org.nanotek.base.artist.group;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.nanotek.base.LongBase;

/**
 * A Group - Under the Artistic performances, a group is the set of artist reunited
 * to execute some performance.
 * 
 * @author josecanovamauger
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@SuppressWarnings("serial")
public class Group extends LongBase{

	@Enumerated
	protected GroupType groupType = GroupType.Other;
	
	public Group(){ 
	}
	
	public Group(GroupType groupType) {
		super();
		this.groupType = groupType;
	}
 

	public GroupType getGroupType() {
		return groupType;
	}

	public void setGroupType(GroupType groupType) {
		this.groupType = groupType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((groupType == null) ? 0 : groupType.hashCode());
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
		Group other = (Group) obj;
		if (groupType != other.groupType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Group [groupType=" + groupType + "]";
	}
 
	
}
