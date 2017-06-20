package org.nanotek.base.contact;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.nanotek.base.LongBase;

@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class Contact extends LongBase {
	
	@Enumerated(EnumType.ORDINAL)
	protected ContactType contactType = ContactType.Other;

	public Contact()
	{ 
	}
	
	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((contactType == null) ? 0 : contactType.hashCode());
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
		Contact other = (Contact) obj;
		if (contactType != other.contactType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [contactType=" + contactType.name() + "]";
	} 

}
