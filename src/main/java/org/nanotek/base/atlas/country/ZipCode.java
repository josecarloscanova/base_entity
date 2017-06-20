package org.nanotek.base.atlas.country;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.ShortStringBase;

@Entity
@SuppressWarnings("serial")
public class ZipCode extends LongBase{

	@OneToOne(cascade=CascadeType.PERSIST)
	protected ShortStringBase zipCode;

	public ZipCode(){} 
	
	
	public ZipCode(ShortStringBase zipCode) {
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
		ZipCode other = (ZipCode) obj;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ZipCode [zipCode=" + zipCode + "]";
	} 
	
}
