package org.nanotek.base.contacts.social.generic;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contact.CommercialContact;
import org.nanotek.base.contacts.social.FaceBookSocialContact;
import org.nanotek.base.contacts.social.GenericSocialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.facebook.company.FaceBookCompany;
import org.nanotek.base.contacts.social.generic.company.GenericCompany;

@Entity
@SuppressWarnings("serial")
public final class GenericCommercialContact extends GenericSocialContact implements CommercialContact<GenericCompany>{

	@OneToOne
	private GenericCompany commercialContact;
	
	public GenericCommercialContact() 
	{ 
		this.socialContactType = SocialContactType.Commercial;
	}

	
	public GenericCommercialContact(GenericCompany commercialContact) {
		super();
		this.commercialContact = commercialContact;
	}

	public GenericCompany getCommercialContact() {
		return commercialContact;
	}

	public void setCommercialContact(GenericCompany commercialContact) {
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
		GenericCommercialContact other = (GenericCommercialContact) obj;
		if (commercialContact == null) {
			if (other.commercialContact != null)
				return false;
		} else if (!commercialContact.equals(other.commercialContact))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "FaceBookCommercialContact [commercialContact="
				+ commercialContact + "]";
	}

}
