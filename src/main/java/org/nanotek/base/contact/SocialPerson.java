package org.nanotek.base.contact;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.nanotek.base.person.Person;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@SuppressWarnings("serial")
public class SocialPerson extends Person{

	@Enumerated
	protected SocialPersonType socialPersonType;
	
	public SocialPerson() 
	{ 
		
	}

	public SocialPersonType getSocialPersonType() {
		return socialPersonType;
	}

	public void setSocialPersonType(SocialPersonType socialPersonType) {
		this.socialPersonType = socialPersonType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((socialPersonType == null) ? 0 : socialPersonType.hashCode());
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
		SocialPerson other = (SocialPerson) obj;
		if (socialPersonType != other.socialPersonType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SocialPerson [socialPersonType=" + socialPersonType
				+ ", recordCreationDate=" + recordCreationDate + "]";
	}
	
}
