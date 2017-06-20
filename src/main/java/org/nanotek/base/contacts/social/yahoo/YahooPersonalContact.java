package org.nanotek.base.contacts.social.yahoo;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.YahooSocialContact;
import org.nanotek.base.contacts.social.yahoo.person.YahooPerson;
import org.nanotek.base.person.contact.PersonalContact;

@Entity
@SuppressWarnings("serial")
public final class YahooPersonalContact extends YahooSocialContact implements PersonalContact<YahooPerson>{

	@OneToOne
	private YahooPerson person; 
	
	public YahooPersonalContact() 
	{ 
		this.socialContactType = SocialContactType.Personal;
	}
	
	
	public YahooPersonalContact(YahooPerson person) {
		super();
		this.person = person;
	}

	public YahooPerson getPerson() {
		return person;
	}

	public void setPerson(YahooPerson person) {
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
		YahooPersonalContact other = (YahooPersonalContact) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "YahooPersonalContact [person=" + person + "]";
	}
	
	
}
