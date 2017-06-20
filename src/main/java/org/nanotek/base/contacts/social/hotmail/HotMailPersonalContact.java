package org.nanotek.base.contacts.social.hotmail;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contacts.social.HotMailSocialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.hotmail.company.person.HotMailPerson;
import org.nanotek.base.person.contact.PersonalContact;

@Entity
@SuppressWarnings("serial")
public final class HotMailPersonalContact extends HotMailSocialContact implements PersonalContact<HotMailPerson> {


	@OneToOne
	private HotMailPerson person; 
	
	public HotMailPersonalContact() 
	{ 
		super();
		this.socialContactType = SocialContactType.Personal;
	}


	public HotMailPersonalContact(HotMailPerson person) {
		this();
		this.person = person;
	}
	
	public HotMailPerson getPerson() {
		return person;
	}

	public void setPerson(HotMailPerson person) {
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
		HotMailPersonalContact other = (HotMailPersonalContact) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "HotMailPersonalContact [person=" + person + "]";
	}

	

}
