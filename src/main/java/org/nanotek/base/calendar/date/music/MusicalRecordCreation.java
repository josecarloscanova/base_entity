package org.nanotek.base.calendar.date.music;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.nanotek.base.calendar.date.RecordCreation;
import org.nanotek.base.music.record.MusicalRecord;

@Entity
@SuppressWarnings("serial")
public class MusicalRecordCreation extends RecordCreation {

	@ManyToOne
	protected MusicalRecord musicalRecord;

	public MusicalRecord getMusicalRecord() {
		return musicalRecord;
	}

	public void setMusicalRecord(MusicalRecord musicalRecord) {
		this.musicalRecord = musicalRecord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((musicalRecord == null) ? 0 : musicalRecord.hashCode());
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
		MusicalRecordCreation other = (MusicalRecordCreation) obj;
		if (musicalRecord == null) {
			if (other.musicalRecord != null)
				return false;
		} else if (!musicalRecord.equals(other.musicalRecord))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MusicalRecordCreation [musicalRecord=" + musicalRecord + "]";
	}
	
	
}
