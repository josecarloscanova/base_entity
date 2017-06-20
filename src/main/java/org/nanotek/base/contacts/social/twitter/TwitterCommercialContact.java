package org.nanotek.base.contacts.social.twitter;

import javax.persistence.OneToOne;

import org.nanotek.base.contact.CommercialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.TwitterSocialContact;
import org.nanotek.base.contacts.social.twitter.company.TwitterCompany;

@SuppressWarnings("serial")
public final class TwitterCommercialContact extends TwitterSocialContact implements CommercialContact<TwitterCompany>{

	@OneToOne
	private TwitterCompany commercialContact;
	
	public TwitterCommercialContact() 
	{ 
		super();
		this.socialContactType = SocialContactType.Commercial;
	}

	public TwitterCommercialContact(TwitterCompany commercialContact) {
		this();
		this.commercialContact = commercialContact;
	}
	
	public TwitterCompany getCommercialContact() {
		return commercialContact;
	}

	public void setCommercialContact(TwitterCompany commercialContact) {
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
		TwitterCommercialContact other = (TwitterCommercialContact) obj;
		if (commercialContact == null) {
			if (other.commercialContact != null)
				return false;
		} else if (!commercialContact.equals(other.commercialContact))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TwitterCommercialContact [commercialContact="
				+ commercialContact + "]";
	}
	
}
