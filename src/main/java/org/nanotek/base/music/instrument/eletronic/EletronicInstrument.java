package org.nanotek.base.music.instrument.eletronic;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.music.instrument.InstrumentBase;

@Entity
@SuppressWarnings("serial")
public class EletronicInstrument extends InstrumentBase {

	@Enumerated(EnumType.ORDINAL)
	protected EletronicInstrumentType eletronicType;

	public EletronicInstrumentType getEletronicType() {
		return eletronicType;
	}

	public void setEletronicType(EletronicInstrumentType eletronicType) {
		this.eletronicType = eletronicType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((eletronicType == null) ? 0 : eletronicType.hashCode());
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
		EletronicInstrument other = (EletronicInstrument) obj;
		if (eletronicType != other.eletronicType)
			return false;
		return true;
	}

	
	
}
