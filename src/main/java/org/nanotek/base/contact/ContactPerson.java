package org.nanotek.base.contact;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.nanotek.base.person.Person;

@MappedSuperclass
@SuppressWarnings("serial")
public class ContactPerson extends Contact{

	@OneToOne
	protected Person person;

	public ContactPerson()
	{ 
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
