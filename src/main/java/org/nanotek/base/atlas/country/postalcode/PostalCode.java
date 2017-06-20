package org.nanotek.base.atlas.country.postalcode;

import javax.persistence.CascadeType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.ShortStringBase;

@MappedSuperclass
@SuppressWarnings("serial")
public class PostalCode extends LongBase {

	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.REFRESH})
	protected ShortStringBase zipCode;

	
	public PostalCode() {
		super();
	}
	
	public PostalCode(ShortStringBase zipCode) {
		super();
		this.zipCode = zipCode;
	}

	public ShortStringBase getZipCode() {
		return zipCode;
	}

	public void setZipCode(ShortStringBase zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		PostalCode other = (PostalCode) obj;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PostalCode [zipCode=" + zipCode + "]";
	}
	

	
	
}
