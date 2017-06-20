package org.nanotek.base.person.date;

/**
 * Something like that, usually designate of life duration, but can be imagined as a lifecycle 
 * since on common terms it is not used for any purpose except the registry of life and death. 
 * 
 * @author josecanovamauger.
 * 
 */
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.person.Person;

@Entity
@SuppressWarnings("serial")
public class PersonLifeCycle extends LongBase {

	@OneToOne(mappedBy="lifeCycle") 
	private Person person;
	
	@ManyToOne (cascade=CascadeType.PERSIST,optional=true)
	protected PersonBirthDate personDateBirth;
	
	@ManyToOne(cascade=CascadeType.PERSIST,optional=true)
	protected PersonDeathDate personDateDeath;

	public PersonLifeCycle() {
		super();
	}

	public PersonLifeCycle(PersonBirthDate personDateBirth) {
		super();
		this.personDateBirth = personDateBirth;
	}

	public PersonLifeCycle(PersonBirthDate personDateBirth,
			PersonDeathDate personDateDeath) {
		super();
		this.personDateBirth = personDateBirth;
		this.personDateDeath = personDateDeath;
	}

	public PersonBirthDate getPersonDateBirth() {
		return personDateBirth;
	}

	public void setPersonDateBirth(PersonBirthDate personDateBirth) {
		this.personDateBirth = personDateBirth;
	}

	public PersonDeathDate getPersonDateDeath() {
		return personDateDeath;
	}

	public void setPersonDateDeath(PersonDeathDate personDateDeath) {
		this.personDateDeath = personDateDeath;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((personDateBirth == null) ? 0 : personDateBirth.hashCode());
		result = prime * result
				+ ((personDateDeath == null) ? 0 : personDateDeath.hashCode());
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
		PersonLifeCycle other = (PersonLifeCycle) obj;
		if (personDateBirth == null) {
			if (other.personDateBirth != null)
				return false;
		} else if (!personDateBirth.equals(other.personDateBirth))
			return false;
		if (personDateDeath == null) {
			if (other.personDateDeath != null)
				return false;
		} else if (!personDateDeath.equals(other.personDateDeath))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonLifeCycle [personDateBirth=" + personDateBirth
				+ ", personDateDeath=" + personDateDeath + "]";
	}

}
