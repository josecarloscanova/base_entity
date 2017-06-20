package org.nanotek.base.atlas.city;

import javax.persistence.CascadeType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.nanotek.base.StringBase;
import org.nanotek.base.atlas.Area;

@MappedSuperclass
@SuppressWarnings("serial")
public class CityBase extends Area {

	@OneToOne (cascade=CascadeType.PERSIST)
	protected StringBase cityName;
	
	public CityBase() {
		super();
	}

	public CityBase(StringBase cityName) {
		super();
		this.cityName = cityName;
	}

	public StringBase getCityName() {
		return cityName;
	}

	public void setCityName(StringBase cityName) {
		this.cityName = cityName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((cityName == null) ? 0 : cityName.hashCode());
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
		CityBase other = (CityBase) obj;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + "]";
	} 
	
}
