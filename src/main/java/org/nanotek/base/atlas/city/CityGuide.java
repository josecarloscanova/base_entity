package org.nanotek.base.atlas.city;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.nanotek.base.atlas.city.City;
import org.nanotek.base.atlas.city.address.Address;


@Entity
@SuppressWarnings("serial")
public class CityGuide extends City{

	@OneToMany(mappedBy="city")
	protected Collection<Address> addresses = new ArrayList<Address>();
	
	public CityGuide() {
		super();
	}
	
	public CityGuide(Collection<Address> addresses) {
		super();
		this.addresses = addresses;
	}
	
	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((addresses == null) ? 0 : addresses.hashCode());
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
		CityGuide other = (CityGuide) obj;
		if (addresses == null) {
			if (other.addresses != null)
				return false;
		} else if (!addresses.equals(other.addresses))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CityGuide [addresses=" + addresses + ", country=" + country
				+ ", cityName=" + cityName + ", id=" + id
				+ ", recordCreationDate=" + recordCreationDate + "]";
	} 
	
}
