package org.nanotek.base.name;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import org.nanotek.base.LongBase;
/**
 * Abstract Class to be derived for String that are used to desiante 
 * names like (animals, persons and other living things) to avoid clash 
 * with designation for objects (kinds like chair, table) even that occurs that
 * a given word designates both (a person or an object) which means that 
 * the disambiguation occurs before persistence.
 * 
 * refer -> http://www.ietf.org/rfc/rfc4287.txt
 * 
 * @author josecanovamauger
 *
 */
/**
 * @author josecanova
 *
 */
@MappedSuperclass
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Name extends LongBase{

	@Enumerated(EnumType.STRING)
	protected NameType nameType = NameType.Other;

	public Name () 
	{ 
	}
	
	public NameType getNameType() {
		return nameType;
	}

	public void setNameType(NameType nameType) {
		this.nameType = nameType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((nameType == null) ? 0 : nameType.hashCode());
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
		Name other = (Name) obj;
		if (nameType != other.nameType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Name [nameType=" + nameType + "]";
	}
	
}
