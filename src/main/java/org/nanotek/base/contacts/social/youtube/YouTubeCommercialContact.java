package org.nanotek.base.contacts.social.youtube;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contact.CommercialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.YouTubeSocialContact;
import org.nanotek.base.contacts.social.yahoo.company.YahooCompany;
import org.nanotek.base.contacts.social.youtube.company.YouTubeCompany;

@Entity
@SuppressWarnings("serial")
public final class YouTubeCommercialContact extends YouTubeSocialContact implements CommercialContact<YouTubeCompany>{


	@OneToOne
	private YouTubeCompany commercialContact;
	
	
	public YouTubeCommercialContact () 
	{ 
		super();
		this.socialContactType = SocialContactType.Commercial;
	}

	public YouTubeCommercialContact(YouTubeCompany commercialContact) {
		this();
		this.commercialContact = commercialContact;
	}


	public YouTubeCompany getCommercialContact() {
		return commercialContact;
	}


	public void setCommercialContact(YouTubeCompany commercialContact) {
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
		YouTubeCommercialContact other = (YouTubeCommercialContact) obj;
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
