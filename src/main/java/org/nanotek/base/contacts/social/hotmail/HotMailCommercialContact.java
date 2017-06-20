package org.nanotek.base.contacts.social.hotmail;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contact.CommercialContact;
import org.nanotek.base.contacts.social.HotMailSocialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.hotmail.company.HotMailCompany;

@Entity
@SuppressWarnings("serial")
public final class HotMailCommercialContact extends HotMailSocialContact implements CommercialContact<HotMailCompany>{

	@OneToOne
	private HotMailCompany commercialContact;
	
	public HotMailCommercialContact () 
	{ 
		super();
		this.socialContactType = SocialContactType.Commercial;
	}
	
	public HotMailCommercialContact(HotMailCompany commercialContact) {
		this();
		this.commercialContact = commercialContact;
	}

	public HotMailCompany getCommercialContact() {
		return commercialContact;
	}

	public void setCommercialContact(HotMailCompany commercialContact) {
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


	
}
