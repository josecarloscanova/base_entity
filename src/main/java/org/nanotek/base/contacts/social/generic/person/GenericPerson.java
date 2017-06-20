package org.nanotek.base.contacts.social.generic.person;

import javax.persistence.Entity;

import org.nanotek.base.contact.SocialPerson;
import org.nanotek.base.contact.SocialPersonType;

@Entity
@SuppressWarnings("serial")
public class GenericPerson extends SocialPerson{

	public GenericPerson() 
	{ 
		this.socialPersonType = SocialPersonType.Other;
	}
	
}
