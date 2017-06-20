package org.nanotek.base.music.record;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.nanotek.base.music.gender.MusicalGender;
import org.nanotek.base.music.release.MusicalRelease;
import org.nanotek.base.record.Record;

/**
 * refer to http://musicbrainz.org/doc/Work; 
 * 
 * @author josecanova
 *
 */
@Entity
@SuppressWarnings("serial")
public class MusicalRecord extends Record{

	
//	@ManyToMany
//	protected Set<Composer> composers;
//	
	@OneToMany
	protected Set<MusicalRecordPerformance> musicalRecordPerformance;
	
	@OneToMany
	protected Set<MusicalGender> genders;
	
	@ManyToOne
	protected MusicalRecordDuration recordDuration; 
	
	@OneToMany(mappedBy="musicalRecord")
	protected Set<MusicalRelease> musicalReleases;
	
	public MusicalRecord() 
	{}
	
	public Set<MusicalGender> getGenders() {
		return genders;
	}

	public void setGenders(Set<MusicalGender> genders) {
		this.genders = genders;
	}

	public MusicalRecordDuration getRecordDuration() {
		return recordDuration;
	}

	public void setRecordDuration(MusicalRecordDuration recordDuration) {
		this.recordDuration = recordDuration;
	}

	public Set<MusicalRecordPerformance> getMusicalRecordPerformance() {
		return musicalRecordPerformance;
	}

	public void setMusicalRecordPerformance(
			Set<MusicalRecordPerformance> musicalRecordPerformance) {
		this.musicalRecordPerformance = musicalRecordPerformance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genders == null) ? 0 : genders.hashCode());
		result = prime
				* result
				+ ((musicalRecordPerformance == null) ? 0
						: musicalRecordPerformance.hashCode());
		result = prime * result
				+ ((musicalReleases == null) ? 0 : musicalReleases.hashCode());
		result = prime * result
				+ ((recordDuration == null) ? 0 : recordDuration.hashCode());
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
		MusicalRecord other = (MusicalRecord) obj;
		if (genders == null) {
			if (other.genders != null)
				return false;
		} else if (!genders.equals(other.genders))
			return false;
		if (musicalRecordPerformance == null) {
			if (other.musicalRecordPerformance != null)
				return false;
		} else if (!musicalRecordPerformance
				.equals(other.musicalRecordPerformance))
			return false;
		if (musicalReleases == null) {
			if (other.musicalReleases != null)
				return false;
		} else if (!musicalReleases.equals(other.musicalReleases))
			return false;
		if (recordDuration == null) {
			if (other.recordDuration != null)
				return false;
		} else if (!recordDuration.equals(other.recordDuration))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MusicalRecord [musicalRecordPerformance="
				+ musicalRecordPerformance + ", genders=" + genders
				+ ", recordDuration=" + recordDuration + ", musicalReleases="
				+ musicalReleases + "]";
	}


}
