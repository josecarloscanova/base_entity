package org.nanotek.base.atlas.city.address;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.nanotek.base.atlas.city.City;
import org.nanotek.base.atlas.city.CityGuide;
import org.nanotek.base.atlas.country.ZipCode;
import org.nanotek.base.atlas.city.AddressBase;

/*
 * TODO: Remove the optional when city persistence works.
 */

@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class Address extends AddressBase {

	@ManyToOne(optional=true,targetEntity=CityGuide.class)
	protected City city;
	
	@OneToMany (orphanRemoval=false)
	protected Set<ZipCode> zipCodes;

	@Enumerated 
	protected AddressType addressType = AddressType.Other;
	
	public Address() {
		super();
	}
	
	public Address(Set<ZipCode> zipCodes) {
		super();
		this.zipCodes = zipCodes;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Set<ZipCode> getZipCodes() {
		return zipCodes;
	}

	public void setZipCodes(Set<ZipCode> zipCodes) {
		this.zipCodes = zipCodes;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((addressType == null) ? 0 : addressType.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((zipCodes == null) ? 0 : zipCodes.hashCode());
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
		Address other = (Address) obj;
		if (addressType != other.addressType)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (zipCodes == null) {
			if (other.zipCodes != null)
				return false;
		} else if (!zipCodes.equals(other.zipCodes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zipCodes=" + zipCodes
				+ ", addressType=" + addressType + "]";
	}

}
