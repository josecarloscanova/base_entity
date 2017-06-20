package org.nanotek.base.atlas.country.postalcode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.nanotek.base.atlas.country.Country;

@Entity
@SuppressWarnings("serial")
public class CountryPostalCode extends PostalCode{

	//TODO:fix optional to false in future.
	@ManyToOne(optional=true)
	protected Country country;
	
	public CountryPostalCode() {
		super();
	}
	
	
	public CountryPostalCode(Country country) {
		super();
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		CountryPostalCode other = (CountryPostalCode) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CountryPostalCode [country=" + country + "]";
	}
	
}
