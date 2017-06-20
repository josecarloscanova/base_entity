package org.nanotek.base.contacts.social.linkedin;

import javax.persistence.OneToOne;

import org.nanotek.base.contacts.social.LinkedInSocialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.linkedin.person.LinkedInPerson;
import org.nanotek.base.person.contact.PersonalContact;

@SuppressWarnings("serial")
public class LinkedInPersonalContact extends LinkedInSocialContact implements PersonalContact<LinkedInPerson> {

	@OneToOne
	private LinkedInPerson person; 
	
	public LinkedInPersonalContact() 
	{ 
		super();
		this.socialContactType = SocialContactType.Personal;
	}

	public LinkedInPersonalContact(LinkedInPerson person) {
		this();
		this.person = person;
	}
	
	public LinkedInPerson getPerson() {
		return person;
	}

	public void setPerson(LinkedInPerson person) {
		this.person = person;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((person == null) ? 0 : person.hashCode());
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
		LinkedInPersonalContact other = (LinkedInPersonalContact) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LinkedInPersonalContact [person=" + person + "]";
	}
	
}
