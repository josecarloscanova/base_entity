package org.nanotek.base.contacts.social.google;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contact.CommercialContact;
import org.nanotek.base.contacts.social.GoogleSocialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.google.company.GoogleCompany;

@Entity
@SuppressWarnings("serial")
public final class GoogleCommercialContact extends GoogleSocialContact implements CommercialContact<GoogleCompany>{

	@OneToOne
	private GoogleCompany commercialContact;
	
	public GoogleCommercialContact () 
	{ 
		super();
		this.socialContactType = SocialContactType.Commercial;
	}
	
	public GoogleCommercialContact(GoogleCompany commercialContact) {
		this();
		this.commercialContact = commercialContact;
	}

	public GoogleCompany getCommercialContact() {
		return commercialContact;
	}

	public void setCommercialContact(GoogleCompany commercialContact) {
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
		GoogleCommercialContact other = (GoogleCommercialContact) obj;
		if (commercialContact == null) {
			if (other.commercialContact != null)
				return false;
		} else if (!commercialContact.equals(other.commercialContact))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GoogleCommercialContact [commercialContact="
				+ commercialContact + "]";
	}
	
}
