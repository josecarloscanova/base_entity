package org.nanotek.base.music.instrument;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.nanotek.base.LongBase;
import org.nanotek.base.StringPositionBase;

/**
 * 
 * refer -> http://www.music.vt.edu/MUSICDICTIONARY/appendix/instruments/Instrumentmain.html
 * 
 * @author josecanova
 *
 */
@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class InstrumentBase extends LongBase{

	@Enumerated (EnumType.ORDINAL)
	protected InstrumentType instrumentType = InstrumentType.Other;
	
	@OneToMany
	protected Set<StringPositionBase> instrumentName; 
	
	protected String instrumentCharacteristics; 
	
	public InstrumentBase()
	{ 
		super();
		
	}
	
	public InstrumentBase(InstrumentType instrumentType) {
		super();
		this.instrumentType = instrumentType;
	}

	public InstrumentType getInstrumentType() {
		return instrumentType;
	}

	public void setInstrumentType(InstrumentType instrumentType) {
		this.instrumentType = instrumentType;
	}

	public String getInstrumentCharacteristics() {
		return instrumentCharacteristics;
	}

	public void setInstrumentCharacteristics(String instrumentCharacteristics) {
		this.instrumentCharacteristics = instrumentCharacteristics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((instrumentCharacteristics == null) ? 0
						: instrumentCharacteristics.hashCode());
		result = prime * result
				+ ((instrumentType == null) ? 0 : instrumentType.hashCode());
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
		InstrumentBase other = (InstrumentBase) obj;
		if (instrumentCharacteristics == null) {
			if (other.instrumentCharacteristics != null)
				return false;
		} else if (!instrumentCharacteristics
				.equals(other.instrumentCharacteristics))
			return false;
		if (instrumentType != other.instrumentType)
			return false;
		return true;
	}
	
}
