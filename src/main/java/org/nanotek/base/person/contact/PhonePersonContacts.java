package org.nanotek.base.person.contact;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.nanotek.base.contacts.phone.PhoneContact;

@Entity
@SuppressWarnings("serial")
public class PhonePersonContacts extends PersonContacts{

	@OneToMany
	protected Collection <PhoneContact> phoneContacts;

	public Collection<PhoneContact> getPhoneContacts() {
		return phoneContacts;
	}

	public void setPhoneContacts(Collection<PhoneContact> phoneContacts) {
		this.phoneContacts = phoneContacts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((phoneContacts == null) ? 0 : phoneContacts.hashCode());
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
		PhonePersonContacts other = (PhonePersonContacts) obj;
		if (phoneContacts == null) {
			if (other.phoneContacts != null)
				return false;
		} else if (!phoneContacts.equals(other.phoneContacts))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhonePersonContacts [phoneContacts=" + phoneContacts
				+ ", person=" + person + ", id=" + id + ", recordCreationDate="
				+ recordCreationDate + "]";
	} 
	
}
