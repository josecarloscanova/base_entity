package org.nanotek.base.person.name;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.nanotek.base.name.Name;
import org.nanotek.base.name.NameType;
import org.nanotek.base.person.Person;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@SuppressWarnings("serial")
public class NamePerson extends Name {

//BiDirectional relation nameperson name 
//	@ManyToMany (cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
//	@JoinTable(name="PERSON_NAMES",
//			joinColumns={@JoinColumn(name="NAME_PERSON_ID")},
//            inverseJoinColumns={@JoinColumn(name="NAME_PERSON_ID")}
//			)
//	@JoinColumn (columnDefinition="NAME_ID")
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	protected Set<NamePart> name = new HashSet<NamePart>(); 

	/**
	 * TODO:Rewrite name package... 
	 */
//    @OneToMany(mappedBy="namePerson")
//    protected Set<Person> persons = new HashSet<Person>();
	
	public NamePerson() 
	{ 
		this.nameType = NameType.Person;
	}

	public Set<NamePart> getName() {
		return name;
	}

	public void setName(Set<NamePart> name) {
		this.name = name;
	}
//
//	public Set<Person> getPersons() {
//		return persons;
//	}
//
//	public void setPersons(Set<Person> persons) {
//		this.persons = persons;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		NamePerson other = (NamePerson) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NamePerson [name=" + name + "]";
	}

}
