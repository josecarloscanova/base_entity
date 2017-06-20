package org.nanotek.base.music.instrument.wind.brass;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.music.instrument.wind.WindInstrument;

@Entity
@SuppressWarnings("serial")
public class BrassInstrument extends WindInstrument {

	@Enumerated(EnumType.ORDINAL)
	protected BrassInstrumentType brassType;

	public BrassInstrument() { 
		super();
	}

	public BrassInstrumentType getBrassType() {
		return brassType;
	}

	public void setBrassType(BrassInstrumentType brassType) {
		this.brassType = brassType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((brassType == null) ? 0 : brassType.hashCode());
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
		BrassInstrument other = (BrassInstrument) obj;
		if (brassType != other.brassType)
			return false;
		return true;
	}
	
}
