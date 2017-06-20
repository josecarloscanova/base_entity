package org.nanotek.base.person.name;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.StringBase;

@Entity
@SuppressWarnings("serial")
public class NamePart extends StringBase{

	@Enumerated(EnumType.ORDINAL) 
	protected NamePersonType namePersonType = NamePersonType.Other; 
	
	public NamePart()
	{ 
	}
	
	public NamePart(String value) {
		super(value);
	}

	public NamePart(NamePersonType namePersonType,String value) {
		this(value);
		this.namePersonType = namePersonType;
	}
	
	public NamePersonType getNamePersonType() {
		return namePersonType;
	}

	public void setNamePersonType(NamePersonType namePersonType) {
		this.namePersonType = namePersonType;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((namePersonType == null) ? 0 : namePersonType.hashCode());
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
		NamePart other = (NamePart) obj;
		if (namePersonType != other.namePersonType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NamePerson [namePersonType=" + namePersonType + "]";
	}


}
