package org.nanotek.base.contacts.social.yahoo;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contact.CommercialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.YahooSocialContact;
import org.nanotek.base.contacts.social.yahoo.company.YahooCompany;

@Entity
@SuppressWarnings("serial")
public final class YahooCommercialContact extends YahooSocialContact implements CommercialContact<YahooCompany>{


	@OneToOne
	private YahooCompany commercialContact;
	
	
	public YahooCommercialContact () 
	{ 
		super();
		this.socialContactType = SocialContactType.Commercial;
	}

	public YahooCommercialContact(YahooCompany commercialContact) {
		this();
		this.commercialContact = commercialContact;
	}


	public YahooCompany getCommercialContact() {
		return commercialContact;
	}


	public void setCommercialContact(YahooCompany commercialContact) {
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
		YahooCommercialContact other = (YahooCommercialContact) obj;
		if (commercialContact == null) {
			if (other.commercialContact != null)
				return false;
		} else if (!commercialContact.equals(other.commercialContact))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "YahooCommercialContact [commercialContact=" + commercialContact
				+ "]";
	}
}
