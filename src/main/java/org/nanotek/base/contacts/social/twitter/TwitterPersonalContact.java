package org.nanotek.base.contacts.social.twitter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.TwitterSocialContact;
import org.nanotek.base.contacts.social.twitter.person.TwitterPerson;
import org.nanotek.base.person.contact.PersonalContact;

@Entity
@SuppressWarnings("serial")
public final class TwitterPersonalContact extends TwitterSocialContact implements PersonalContact<TwitterPerson>  {


	@OneToOne
	private TwitterPerson person; 
	
	public TwitterPersonalContact()
	{ 
		super();
		this.socialContactType = SocialContactType.Personal;
	}

	public TwitterPersonalContact(TwitterPerson person) {
		this();
		this.person = person;
	}
	
	public TwitterPerson getPerson() {
		return person;
	}

	public void setPerson(TwitterPerson person) {
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
		TwitterPersonalContact other = (TwitterPersonalContact) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TwitterPersonalContact [person=" + person + "]";
	}
}
