package org.nanotek.base.music.instrument.wind.wood;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.music.instrument.InstrumentBase;

@Entity
@SuppressWarnings("serial")
public class WoodWindInstrument  extends InstrumentBase{

	@Enumerated(EnumType.ORDINAL)
	protected WoodWindInstrumentType woodWindType;

	public WoodWindInstrument()
	{ 
		super();
	}


	public WoodWindInstrumentType getWoodWindType() {
		return woodWindType;
	}


	public void setWoodWindType(WoodWindInstrumentType woodWindType) {
		this.woodWindType = woodWindType;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((woodWindType == null) ? 0 : woodWindType.hashCode());
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
		WoodWindInstrument other = (WoodWindInstrument) obj;
		if (woodWindType != other.woodWindType)
			return false;
		return true;
	}
	
	
	
}
