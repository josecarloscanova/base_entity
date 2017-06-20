package org.nanotek.base.atlas.locale;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.atlas.country.Country;

@SuppressWarnings("serial")
@Entity
public class CountryLocale extends LongBase{

	@OneToOne 
	protected Locale locale;

	@OneToOne
	protected Country country; 
	
	public CountryLocale() 
	{ 
	}
	
	public CountryLocale(Locale locale, Country country) {
		super();
		this.locale = locale;
		this.country = country;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
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
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryLocale other = (CountryLocale) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (locale == null) {
			if (other.locale != null)
				return false;
		} else if (!locale.equals(other.locale))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountryLocale [locale=" + locale + ", country=" + country + "]";
	} 
	
	
}
