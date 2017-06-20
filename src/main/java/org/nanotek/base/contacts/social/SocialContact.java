package org.nanotek.base.contacts.social;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.contact.Contact;
import org.nanotek.base.contact.ContactType;

@Entity
@SuppressWarnings("serial")
public class SocialContact extends Contact {

	@Enumerated(EnumType.STRING)
	protected SocialContactType socialContactType = SocialContactType.Other; 
	
	public SocialContact() 
	{ 
		this.contactType = ContactType.SocialContact;
	}

	public SocialContactType getSocialContactType() {
		return socialContactType;
	}

	public void setSocialContactType(SocialContactType socialContactType) {
		this.socialContactType = socialContactType;
	}
}
