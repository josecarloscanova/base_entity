package org.nanotek.base.music.instrument.percurssion;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.music.instrument.InstrumentBase;
import org.nanotek.base.music.instrument.InstrumentType;

@SuppressWarnings("serial")
@Entity
public class PercussionInstrument extends InstrumentBase{

	@Enumerated(EnumType.ORDINAL)
	protected PercurssionInstrumentType percussionInstrument;

	public PercussionInstrument()
	{ 
		super(InstrumentType.Percussion);
	}

	public PercurssionInstrumentType getPercussionInstrument() {
		return percussionInstrument;
	}

	public void setPercussionInstrument(
			PercurssionInstrumentType percussionInstrument) {
		this.percussionInstrument = percussionInstrument;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((percussionInstrument == null) ? 0 : percussionInstrument
						.hashCode());
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
		PercussionInstrument other = (PercussionInstrument) obj;
		if (percussionInstrument != other.percussionInstrument)
			return false;
		return true;
	}
	
}
