package org.nanotek.base;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * TODO: Fix constructors for String ?
 * 
 * refer: http://docs.oracle.com/javase/7/docs/api/java/util/Locale.html#ROOT
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class LocalizedString extends LongBase {

	@OneToOne (cascade=CascadeType.REFRESH)
	protected StringBase value; 
	
	protected String locale;

	public LocalizedString(){} 
	
	public LocalizedString(StringBase value, String locale) {
		super();
		this.value = value;
		this.locale = locale;
	}

	public StringBase getValue() {
		return value;
	}

	public void setValue(StringBase value) {
		this.value = value;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		LocalizedString other = (LocalizedString) obj;
		if (locale == null) {
			if (other.locale != null)
				return false;
		} else if (!locale.equals(other.locale))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LocalizedString [value=" + value + ", locale=" + locale + "]";
	} 
	
}
