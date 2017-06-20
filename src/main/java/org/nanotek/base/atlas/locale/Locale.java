package org.nanotek.base.atlas.locale;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.StringBase;

@Entity
@SuppressWarnings("serial")
public class Locale extends LongBase{

	@OneToOne(cascade=CascadeType.PERSIST)
	protected StringBase Locale;

	public Locale()
	{ 
	}
	
	public Locale(StringBase locale) {
		super();
		Locale = locale;
	}

	public StringBase getLocale() {
		return Locale;
	}

	public void setLocale(StringBase locale) {
		Locale = locale;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Locale == null) ? 0 : Locale.hashCode());
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
		Locale other = (Locale) obj;
		if (Locale == null) {
			if (other.Locale != null)
				return false;
		} else if (!Locale.equals(other.Locale))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Locale [Locale=" + Locale + "]";
	} 
	
}
