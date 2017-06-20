package org.nanotek.base.atlas.country.isocode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.nanotek.base.atlas.country.CountryCode;
import org.nanotek.base.atlas.country.CountryCodeType;

/**
 * 3166 Iso Alpha Code; 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class IsoAlpha2Code  extends CountryCode {
	
	@Column(length=2)
	protected String alphaCode;

	public IsoAlpha2Code(){
		super(CountryCodeType.Iso3662);
	}
	
	public String getAlphaCode() {
		return alphaCode;
	}

	
	public void setAlphaCode(@NotNull @Length (max=2) String alphaCode) {
		this.alphaCode = alphaCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((alphaCode == null) ? 0 : alphaCode.hashCode());
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
		IsoAlpha2Code other = (IsoAlpha2Code) obj;
		if (alphaCode == null) {
			if (other.alphaCode != null)
				return false;
		} else if (!alphaCode.equals(other.alphaCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IsoAlpha2Base [alphaCode=" + alphaCode + "]";
	} 
	
	
}
