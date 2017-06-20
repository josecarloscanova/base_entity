package org.nanotek.base.music.record;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;

@Entity
@SuppressWarnings("serial")
public class MusicalRecordPerformance extends LongBase{

	@OneToOne(cascade=CascadeType.PERSIST)
	protected MusicalRecordParticipation recordParticipation;
	
	protected Boolean vocal = false;
	
	public MusicalRecordPerformance ()
	{ 
	}

	public MusicalRecordParticipation getRecordParticipation() {
		return recordParticipation;
	}

	public void setRecordParticipation(
			MusicalRecordParticipation recordParticipation) {
		this.recordParticipation = recordParticipation;
	}

	public Boolean getVocal() {
		return vocal;
	}

	public void setVocal(Boolean vocal) {
		this.vocal = vocal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((recordParticipation == null) ? 0 : recordParticipation
						.hashCode());
		result = prime * result + ((vocal == null) ? 0 : vocal.hashCode());
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
		MusicalRecordPerformance other = (MusicalRecordPerformance) obj;
		if (recordParticipation == null) {
			if (other.recordParticipation != null)
				return false;
		} else if (!recordParticipation.equals(other.recordParticipation))
			return false;
		if (vocal == null) {
			if (other.vocal != null)
				return false;
		} else if (!vocal.equals(other.vocal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MusicalRecordPerformance [recordParticipation="
				+ recordParticipation + ", vocal=" + vocal + "]";
	}

}
