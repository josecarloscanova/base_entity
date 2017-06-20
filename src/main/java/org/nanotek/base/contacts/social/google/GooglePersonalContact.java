package org.nanotek.base.contacts.social.google;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contacts.social.GoogleSocialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.google.person.GooglePerson;
import org.nanotek.base.person.contact.PersonalContact;

@Entity
@SuppressWarnings("serial")
public final class GooglePersonalContact extends GoogleSocialContact implements PersonalContact<GooglePerson> {


	@OneToOne
	private GooglePerson person; 
	
	public GooglePersonalContact() 
	{ 
		super();
		this.socialContactType = SocialContactType.Personal;
	}


	public GooglePersonalContact(GooglePerson person) {
		this();
		this.person = person;
	}
	
	public GooglePerson getPerson() {
		return person;
	}

	public void setPerson(GooglePerson person) {
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
		GooglePersonalContact other = (GooglePersonalContact) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GooglePersonalContact [person=" + person + "]";
	}
	
}
