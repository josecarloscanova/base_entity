package org.nanotek.base.contacts.social.facebook;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contacts.social.FaceBookSocialContact;
import org.nanotek.base.contacts.social.SocialContactType;
import org.nanotek.base.contacts.social.facebook.person.FaceBookPerson;
import org.nanotek.base.person.contact.PersonalContact;

@Entity
@SuppressWarnings("serial")
public final class FaceBookPersonalContact extends FaceBookSocialContact implements PersonalContact<FaceBookPerson>{

	@OneToOne
	private FaceBookPerson person; 
	
	public FaceBookPersonalContact()
	{ 
		this.socialContactType = SocialContactType.Personal;
	}

	@Override
	public FaceBookPerson getPerson() {
		return person;
	}

	public void setPerson(FaceBookPerson person) {
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
		FaceBookPersonalContact other = (FaceBookPersonalContact) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FaceBookPersonalContact [person=" + person + "]";
	}
	
}
