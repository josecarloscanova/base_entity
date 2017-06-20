package org.nanotek.base.music.instrument.string;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.music.instrument.InstrumentBase;
import org.nanotek.base.music.instrument.InstrumentType;

@SuppressWarnings("serial")
@Entity
public class StringInstrument extends InstrumentBase {

	@Enumerated (EnumType.ORDINAL)
	protected StringInstrumentType stringType;

	
	public StringInstrument() 
	{ 
		super(InstrumentType.Stringed);
	}
	
	public StringInstrumentType getStringType() {
		return stringType;
	}

	public void setStringType(StringInstrumentType stringType) {
		this.stringType = stringType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((stringType == null) ? 0 : stringType.hashCode());
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
		StringInstrument other = (StringInstrument) obj;
		if (stringType != other.stringType)
			return false;
		return true;
	}

}
