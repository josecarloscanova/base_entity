package org.nanotek.base;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.nanotek.base.atlas.locale.Locale;
/**
 * A class defining a relation on the set of String Collections
 * and the origin locale, not yet finished. 
 * TODO: Finish the implementation and "1st persit class". 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class StringLocale extends LongBase {

	@OneToMany
	protected StringBase stringBase; 
	
	@OneToOne 
	protected Locale locale;

	public StringBase getStringBase() {
		return stringBase;
	}

	public void setStringBase(StringBase stringBase) {
		this.stringBase = stringBase;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		result = prime * result
				+ ((stringBase == null) ? 0 : stringBase.hashCode());
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
		StringLocale other = (StringLocale) obj;
		if (locale == null) {
			if (other.locale != null)
				return false;
		} else if (!locale.equals(other.locale))
			return false;
		if (stringBase == null) {
			if (other.stringBase != null)
				return false;
		} else if (!stringBase.equals(other.stringBase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StringLocale [stringBase=" + stringBase + ", locale=" + locale
				+ ", id=" + id + "]";
	} 
	
}
