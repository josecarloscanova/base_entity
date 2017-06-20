package org.nanotek.base.atlas.country;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.nanotek.base.LongBase;

@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CountryCode extends LongBase{

	@Enumerated
    protected CountryCodeType countryCodeType;

	public CountryCode()
	{
		this.countryCodeType = CountryCodeType.Other;
	}
	
	public CountryCode(CountryCodeType countryCodeType) {
		super();
		this.countryCodeType = countryCodeType;
	}

	public CountryCodeType getCountryCodeType() {
		return countryCodeType;
	}

	public void setCountryCodeType(CountryCodeType countryCodeType) {
		this.countryCodeType = countryCodeType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((countryCodeType == null) ? 0 : countryCodeType.hashCode());
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
		CountryCode other = (CountryCode) obj;
		if (countryCodeType != other.countryCodeType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountryCode [countryCodeType=" + countryCodeType + "]";
	}
     
}
