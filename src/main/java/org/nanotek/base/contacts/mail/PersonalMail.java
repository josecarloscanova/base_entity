package org.nanotek.base.contacts.mail;

import javax.persistence.OneToOne;

import org.nanotek.base.contact.Contact;
import org.nanotek.base.contact.ContactType;
import org.nanotek.base.person.Person;
import org.nanotek.base.person.contact.PersonalContact;

@SuppressWarnings("serial")
public class PersonalMail extends Contact implements PersonalContact<Person>{

	@OneToOne 
	protected Person person; 
	
	public PersonalMail() 
	{ 
		this.contactType = ContactType.MailContact;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
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
		PersonalMail other = (PersonalMail) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "PersonalMail [person=" + person + "]";
	}
	
	
	
}
