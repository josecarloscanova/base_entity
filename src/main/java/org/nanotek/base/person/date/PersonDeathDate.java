package org.nanotek.base.person.date;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.nanotek.base.calendar.date.TerminationDate;
import org.nanotek.base.calendar.date.TerminationDateType;

@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PersonDeathDate extends TerminationDate {

	@OneToMany (mappedBy="personDateDeath")
	protected Set<PersonLifeCycle> personsLifeCycle;
	
	public PersonDeathDate()
	{ 
		this.terminationDateType = TerminationDateType.Death;
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
		PersonDeathDate other = (PersonDeathDate) obj;
		if (personsLifeCycle == null) {
			if (other.personsLifeCycle != null)
				return false;
		} else if (!personsLifeCycle.equals(other.personsLifeCycle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonDeathDate [personsLifeCycle=" + personsLifeCycle + "]";
	}

}
