package org.nanotek.base.music.instrument.wind;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.music.instrument.InstrumentBase;
import org.nanotek.base.music.instrument.InstrumentType;


@Entity
@SuppressWarnings("serial")
public class WindInstrument extends InstrumentBase{

	@Enumerated (EnumType.ORDINAL)
	protected WindInstrumentType windType;

	public WindInstrument(){ 
		super(InstrumentType.Wind);
	} 
	
	public WindInstrumentType getWindType() {
		return windType;
	}

	public void setWindType(WindInstrumentType windType) {
		this.windType = windType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((windType == null) ? 0 : windType.hashCode());
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
		WindInstrument other = (WindInstrument) obj;
		if (windType != other.windType)
			return false;
		return true;
	}
	
	
}
