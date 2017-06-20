package org.nanotek.base.contacts.social.youtube;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.YouTubeSocialContact;
import org.nanotek.base.contacts.social.youtube.person.YouTubePerson;
import org.nanotek.base.person.contact.PersonalContact;

@Entity
@SuppressWarnings("serial")
public final class YouTubePersonalContact extends YouTubeSocialContact implements PersonalContact<YouTubePerson>{

	@OneToOne
	private YouTubePerson person; 
	
	public YouTubePersonalContact() 
	{ 
		this.socialContactType = SocialContactType.Personal;
	}
	
	
	public YouTubePersonalContact(YouTubePerson person) {
		super();
		this.person = person;
	}

	public YouTubePerson getPerson() {
		return person;
	}

	public void setPerson(YouTubePerson person) {
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
		YouTubePersonalContact other = (YouTubePersonalContact) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "YouTubePersonalContact [person=" + person + "]";
	}
	
	
}
