package org.nanotek.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@SuppressWarnings("serial")
public class ShortStringBase extends LongBase {

public static final int MAX_LENGTH = 31; 
	
	@NotNull
	@Column(nullable=false, length=MAX_LENGTH)
	protected String value; 
	
	public ShortStringBase(){}
	
	public ShortStringBase(String value) {
		super();
		this.value = value;
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
		ShortStringBase other = (ShortStringBase) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShortStringBase [value=" + value + "]";
	}
	
	
	
}
