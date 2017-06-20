package org.nanotek.base.atlas.country.isocode;

/**
 * Entity to hold 3 Algarisms IsoAlphaCode 
 * 
 * 
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.nanotek.base.atlas.country.CountryCode;
import org.nanotek.base.atlas.country.CountryCodeType;

@Entity
@SuppressWarnings("serial")
public class IsoAlpha3Code extends CountryCode{

	@Column(length=3)
	protected String alphaCode;

	public IsoAlpha3Code(){
		super(CountryCodeType.Iso3663);
	} 
	
	public String getAlphaCode() {
		return alphaCode;
	}

	public void setAlphaCode(@NotNull @Length (max=3)  String alphaCode) {
		this.alphaCode = alphaCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((alphaCode == null) ? 0 : alphaCode.hashCode());
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
		IsoAlpha3Code other = (IsoAlpha3Code) obj;
		if (alphaCode == null) {
			if (other.alphaCode != null)
				return false;
		} else if (!alphaCode.equals(other.alphaCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IsoAlpha3Code [alphaCode=" + alphaCode + "]";
	}
	
}
