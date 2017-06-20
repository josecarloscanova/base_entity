package org.nanotek.base.music.release;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.nanotek.base.atlas.country.Country;
import org.nanotek.base.calendar.DateBase;

@Entity
@SuppressWarnings("serial")
public class MusicalReleaseCountry extends Country{

	//TODO:Check consistency on Calendar Tables.
	@OneToOne protected DateBase baseDate;

	@ManyToMany protected Set<MusicalRelease> musicalRelease; 
	
	public MusicalReleaseCountry() {
		super();
	}
	
	public DateBase getBaseDate() {
		return baseDate;
	}

	public Set<MusicalRelease> getMusicalRelease() {
		return musicalRelease;
	}

	public void setMusicalRelease(Set<MusicalRelease> musicalRelease) {
		this.musicalRelease = musicalRelease;
	}

	public void setBaseDate(DateBase baseDate) {
		this.baseDate = baseDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((baseDate == null) ? 0 : baseDate.hashCode());
		result = prime * result
				+ ((musicalRelease == null) ? 0 : musicalRelease.hashCode());
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
		MusicalReleaseCountry other = (MusicalReleaseCountry) obj;
		if (baseDate == null) {
			if (other.baseDate != null)
				return false;
		} else if (!baseDate.equals(other.baseDate))
			return false;
		if (musicalRelease == null) {
			if (other.musicalRelease != null)
				return false;
		} else if (!musicalRelease.equals(other.musicalRelease))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MusicalReleaseCountry [baseDate=" + baseDate
				+ ", musicalRelease=" + musicalRelease + "]";
	}

}
