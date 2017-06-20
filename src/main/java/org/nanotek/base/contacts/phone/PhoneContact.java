package org.nanotek.base.contacts.phone;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.nanotek.base.atlas.country.CountryAreaCode;
import org.nanotek.base.contact.Contact;
import org.nanotek.base.contact.ContactType;

@Entity
@SuppressWarnings("serial")
public class PhoneContact extends Contact{

	@OneToMany(cascade=CascadeType.PERSIST, orphanRemoval=false)
	protected Set<PhoneNumberBase> phoneNumber;
	
	@OneToOne
	protected CountryAreaCode countryCode; 
	
	public PhoneContact() 
	{ 
		this.contactType = ContactType.PhoneContact;
	}

	public Set<PhoneNumberBase> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Set<PhoneNumberBase> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public CountryAreaCode getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(CountryAreaCode countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		PhoneContact other = (PhoneContact) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhoneContact [phoneNumber=" + phoneNumber + ", countryCode="
				+ countryCode + "]";
	}

}
