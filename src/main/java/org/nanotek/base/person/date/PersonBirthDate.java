package org.nanotek.base.person.date;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.nanotek.base.calendar.date.BirthDate;

@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PersonBirthDate extends BirthDate{

	@OneToMany (mappedBy="personDateBirth",orphanRemoval=false,fetch=FetchType.LAZY)
	protected  Set<PersonLifeCycle> personsLifeCycle = new HashSet<PersonLifeCycle>(); 
	
	public PersonBirthDate() 
	{ 
		super();
	}

	
	public PersonBirthDate(Date date) {
		super(date);
	}


	public Set<PersonLifeCycle> getPersonsLifeCycle() {
		return personsLifeCycle;
	}

	public void setPersonsLifeCycle(Set<PersonLifeCycle> personsLifeCycle) {
		this.personsLifeCycle = personsLifeCycle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((personsLifeCycle == null) ? 0 : personsLifeCycle.hashCode());
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
		PersonBirthDate other = (PersonBirthDate) obj;
		if (personsLifeCycle == null) {
			if (other.personsLifeCycle != null)
				return false;
		} else if (!personsLifeCycle.equals(other.personsLifeCycle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonBirthDate [personsLifeCycle=" + personsLifeCycle + "]";
	}

	
}
