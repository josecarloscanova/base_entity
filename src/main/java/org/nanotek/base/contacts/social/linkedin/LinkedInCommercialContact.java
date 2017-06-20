package org.nanotek.base.contacts.social.linkedin;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contact.CommercialContact;
import org.nanotek.base.contacts.social.LinkedInSocialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.linkedin.company.LinkedInCompany;

@Entity
@SuppressWarnings("serial")
public class LinkedInCommercialContact extends LinkedInSocialContact implements CommercialContact<LinkedInCompany>{

	
	@OneToOne
	private LinkedInCompany commercialContact;
	
	public LinkedInCommercialContact () 
	{ 
		super();
		this.socialContactType = SocialContactType.Commercial;
	}

	public LinkedInCommercialContact(LinkedInCompany commercialContact) {
		this();
		this.commercialContact = commercialContact;
	}
	
	public LinkedInCompany getCommercialContact() {
		return commercialContact;
	}

	public void setCommercialContact(LinkedInCompany commercialContact) {
		this.commercialContact = commercialContact;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((commercialContact == null) ? 0 : commercialContact
						.hashCode());
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
		LinkedInCommercialContact other = (LinkedInCommercialContact) obj;
		if (commercialContact == null) {
			if (other.commercialContact != null)
				return false;
		} else if (!commercialContact.equals(other.commercialContact))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LinkedInCommercialContact [commercialContact="
				+ commercialContact + "]";
	}
}
