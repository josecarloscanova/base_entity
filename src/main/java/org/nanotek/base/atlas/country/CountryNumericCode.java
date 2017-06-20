package org.nanotek.base.atlas.country;

import javax.persistence.Entity;

@Entity
@SuppressWarnings("serial")
public class CountryNumericCode extends CountryCode {

	protected Integer  numericCountryCode;

	public CountryNumericCode(){} 
	
	public Integer getNumericCountryCode() {
		return numericCountryCode;
	}

	public void setNumericCountryCode(Integer numericCountryCode) {
		this.numericCountryCode = numericCountryCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((numericCountryCode == null) ? 0 : numericCountryCode
						.hashCode());
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
		CountryNumericCode other = (CountryNumericCode) obj;
		if (numericCountryCode == null) {
			if (other.numericCountryCode != null)
				return false;
		} else if (!numericCountryCode.equals(other.numericCountryCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountryNumericCode [numericCountryCode=" + numericCountryCode
				+ "]";
	}
	
}
