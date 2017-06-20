package org.nanotek.base.person.location;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.nanotek.base.atlas.city.address.Address;
import org.nanotek.base.person.Person;

@Entity
@SuppressWarnings("serial")
public class PersonAddress extends Person {

	
	@OneToMany()
	private Set<Address> address; 
	
}
