package org.nanotek.base.music.instrument.keyboard;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.music.instrument.InstrumentBase;
import org.nanotek.base.music.instrument.InstrumentType;

@SuppressWarnings("serial")
@Entity 
public class KeyboardInstrument extends InstrumentBase{

	@Enumerated(EnumType.ORDINAL)
	protected KeyboardInstrumentType keyboardType = KeyboardInstrumentType.Other;

	KeyboardInstrument() 
	{ 
		super(InstrumentType.Keyboard);
	}
	
	public KeyboardInstrumentType getKeyboardType() {
		return keyboardType;
	}

	public void setKeyboardType(KeyboardInstrumentType keyboardType) {
		this.keyboardType = keyboardType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((keyboardType == null) ? 0 : keyboardType.hashCode());
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
		KeyboardInstrument other = (KeyboardInstrument) obj;
		if (keyboardType != other.keyboardType)
			return false;
		return true;
	}

}
