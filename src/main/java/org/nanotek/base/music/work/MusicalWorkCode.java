package org.nanotek.base.music.work;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.LongBase;

@Entity
@SuppressWarnings("serial")
public class MusicalWorkCode extends LongBase{
	
	@Enumerated (EnumType.STRING)
	protected MusicalWorkCodeType musicaWorkType;

	public MusicalWorkCode (){} 
	
	public MusicalWorkCodeType getMusicaWorkType() {
		return musicaWorkType;
	}

	public void setMusicaWorkType(MusicalWorkCodeType musicaWorkType) {
		this.musicaWorkType = musicaWorkType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((musicaWorkType == null) ? 0 : musicaWorkType.hashCode());
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
		MusicalWorkCode other = (MusicalWorkCode) obj;
		if (musicaWorkType != other.musicaWorkType)
			return false;
		return true;
	} 

	
	
}
