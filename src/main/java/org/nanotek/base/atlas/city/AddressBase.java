package org.nanotek.base.atlas.city;

import java.util.Set;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import org.nanotek.base.StringBase;
import org.nanotek.base.atlas.Area;


/**
 * 
* @author josecanovamauger
 *
 */
@MappedSuperclass
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class AddressBase extends Area{
	
	@ManyToMany
	protected Set<City> addressCities;

	protected StringBase addressDesignation;
	
	public AddressBase() {
		super();
	}

	public AddressBase(Set<City> addressCities) {
		super();
		this.addressCities = addressCities;
	}

	public Set<City> getAddressCities() {
		return addressCities;
	}

	public void setAddressCities(Set<City> addressCities) {
		this.addressCities = addressCities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((addressCities == null) ? 0 : addressCities.hashCode());
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
		AddressBase other = (AddressBase) obj;
		if (addressCities == null) {
			if (other.addressCities != null)
				return false;
		} else if (!addressCities.equals(other.addressCities))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AddressBase [addressCities=" + addressCities + "]";
	} 
	
}
