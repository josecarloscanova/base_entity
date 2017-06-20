package org.nanotek.base.atlas.country;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.nanotek.base.StringBase;
import org.nanotek.base.atlas.Area;
import org.nanotek.base.atlas.country.isocode.IsoAlpha2Code;
import org.nanotek.base.atlas.country.isocode.IsoAlpha3Code;
import org.nanotek.base.atlas.country.postalcode.CountryPostalCode;

/**
 * 
 * @see http://en.wikipedia.org/wiki/ISO_3166-1
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class Country extends Area{

	@OneToOne(cascade=CascadeType.ALL, optional=false)
	protected StringBase countryName; 
	
	@OneToOne(cascade=CascadeType.ALL , optional=true)
	protected IsoAlpha2Code isoCodeAlpha2; 
	
	@OneToOne(cascade=CascadeType.ALL , optional=true)
	protected IsoAlpha3Code isoCodeAlpha3;
	
	@OneToOne(cascade=CascadeType.ALL , optional=true)
	protected CountryNumericCode  numericCountryCode;
	
	@OneToMany(cascade={CascadeType.REFRESH,CascadeType.PERSIST},mappedBy="country")
	protected Set<CountryPostalCode> countryPostalCode;
	
	private Integer areaCode;

	public Country(){}
	
	public Country(StringBase countryName) {
		super();
		this.countryName = countryName;
	}

	public Country(Integer areaCode) {
		super();
		this.areaCode = areaCode;
	}

	
	public Country(StringBase countryName, Integer areaCode) {
		super();
		this.countryName = countryName;
		this.areaCode = areaCode;
	}

	public StringBase getCountryName() {
		return countryName;
	}

	public void setCountryName(StringBase countryName) {
		this.countryName = countryName;
	}

	public IsoAlpha2Code getIsoCodeAlpha2() {
		return isoCodeAlpha2;
	}

	public void setIsoCodeAlpha2(IsoAlpha2Code isoCodeAlpha2) {
		this.isoCodeAlpha2 = isoCodeAlpha2;
	}

	public IsoAlpha3Code getIsoCodeAlpha3() {
		return isoCodeAlpha3;
	}

	public void setIsoCodeAlpha3(IsoAlpha3Code isoCodeAlpha3) {
		this.isoCodeAlpha3 = isoCodeAlpha3;
	}

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	public CountryNumericCode getNumericCountryCode() {
		return numericCountryCode;
	}

	public void setNumericCountryCode(CountryNumericCode numericCountryCode) {
		this.numericCountryCode = numericCountryCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((areaCode == null) ? 0 : areaCode.hashCode());
		result = prime * result
				+ ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result
				+ ((isoCodeAlpha2 == null) ? 0 : isoCodeAlpha2.hashCode());
		result = prime * result
				+ ((isoCodeAlpha3 == null) ? 0 : isoCodeAlpha3.hashCode());
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
		Country other = (Country) obj;
		if (areaCode == null) {
			if (other.areaCode != null)
				return false;
		} else if (!areaCode.equals(other.areaCode))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (isoCodeAlpha2 == null) {
			if (other.isoCodeAlpha2 != null)
				return false;
		} else if (!isoCodeAlpha2.equals(other.isoCodeAlpha2))
			return false;
		if (isoCodeAlpha3 == null) {
			if (other.isoCodeAlpha3 != null)
				return false;
		} else if (!isoCodeAlpha3.equals(other.isoCodeAlpha3))
			return false;
		if (numericCountryCode == null) {
			if (other.numericCountryCode != null)
				return false;
		} else if (!numericCountryCode.equals(other.numericCountryCode))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", isoCodeAlpha2="
				+ isoCodeAlpha2 + ", isoCodeAlpha3=" + isoCodeAlpha3
				+ ", numericCountryCode=" + numericCountryCode
				+ ", countryPostalCode=" + countryPostalCode + ", areaCode="
				+ areaCode + "]";
	}

}
