package org.nanotek.base.atlas.country;

import javax.persistence.Entity;

@Entity
@SuppressWarnings("serial")
public class CountryAreaCode extends CountryCode {

	protected Integer areaCode;

	public CountryAreaCode(){} 
	
	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((areaCode == null) ? 0 : areaCode.hashCode());
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
		CountryAreaCode other = (CountryAreaCode) obj;
		if (areaCode == null) {
			if (other.areaCode != null)
				return false;
		} else if (!areaCode.equals(other.areaCode))
			return false;
		return true;
	}
	
}
