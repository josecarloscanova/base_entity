package org.nanotek.base.person;

import javax.enterprise.inject.Default;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.person.date.PersonLifeCycle;
import org.nanotek.base.person.name.NamePerson;

/**
 * Joined since Person relate to "identified by a given name 
 * accordingly with a convention estabilished by who defined it".
 *
 * 
 * 
 * @author josecanovamauger
 *
 */
@Default
@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person extends LongBase implements Human<Gender>{

	@OneToOne(optional=false,cascade=CascadeType.PERSIST)
//	@JoinColumn (columnDefinition="NAME_PERSON_ID")
	protected NamePerson namePerson = new NamePerson();
	
	@OneToOne(cascade=CascadeType.PERSIST)
	protected PersonLifeCycle lifeCycle;
	
	@Enumerated(EnumType.STRING)
	private Gender gender = Gender.Other; 
	
	public Person () 
	{ 
	}

	public Person(NamePerson namePerson) {
		super();
		this.namePerson = namePerson;
	}

	public NamePerson getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(NamePerson namePerson) {
		this.namePerson = namePerson;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public Human<?> get() {
		return this;
	}

	public PersonLifeCycle getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(PersonLifeCycle lifeCycle) {
		this.lifeCycle = lifeCycle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result
				+ ((lifeCycle == null) ? 0 : lifeCycle.hashCode());
		result = prime * result
				+ ((namePerson == null) ? 0 : namePerson.hashCode());
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
		Person other = (Person) obj;
		if (gender != other.gender)
			return false;
		if (lifeCycle == null) {
			if (other.lifeCycle != null)
				return false;
		} else if (!lifeCycle.equals(other.lifeCycle))
			return false;
		if (namePerson == null) {
			if (other.namePerson != null)
				return false;
		} else if (!namePerson.equals(other.namePerson))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [namePerson=" + namePerson + ", lifeCycle=" + lifeCycle
				+ ", gender=" + gender + "]";
	}

}



