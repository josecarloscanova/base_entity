package org.nanotek.base.person.contact;
/**
 * Super Class for Contacts class types, 
 * which can be phone, email, webpages, social locations (e.g. social networks). 
 * And adress where to find the person (in case that some address was registered). 
 * 
 * @author josecanovamauver
 * 
 */
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.person.Person;

@MappedSuperclass
@SuppressWarnings("serial")
public abstract class PersonContacts extends LongBase implements PersonalContact<Person>{

	@OneToOne
	protected Person person; 
	

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
		PersonContacts other = (PersonContacts) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonContacts [person=" + person + "]";
	}
	
}
