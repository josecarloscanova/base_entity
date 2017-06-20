package org.nanotek.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

import org.nanotek.base.LongBase;

/**
 * 
 * A non null String sequence that will be unique (case sensitive) on database. 
 * Which means that relies on fact of the representation of the String Abc <> abc <> ABC and so on. 
 * Used strings instead of an array of bytes to focus the logical on Java.
 * 
 * Used for names, and finite vocabularies like small texts.(aka comments).
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class StringBase extends LongBase {

	public static final int MAX_LENGTH = 1000; 
	
	@NotNull
	@Column(nullable=false, length=MAX_LENGTH)
	protected String value; 
	
	public StringBase(){}
	
	public StringBase(String value) {
		super();
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "StringBase [value=" + value + "]";
	}

	public static int getMaxLength() {
		return MAX_LENGTH;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
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
		StringBase other = (StringBase) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	
}
