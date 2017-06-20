package org.nanotek.base.music.record;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.nanotek.base.duration.DurationType;
import org.nanotek.base.record.RecordDuration;


@Entity
@SuppressWarnings("serial")
public class MusicalRecordDuration extends RecordDuration{

//	@OneToMany
//	protected Set<MusicalRecord> musicalRecord; 
	
	public MusicalRecordDuration()
	{ 
		super();
		this.durationType = DurationType.Music;
	}

	@Override
	public String toString() {
		return "MusicalRecordDuration [durationType=" + durationType
				+ ", duration=" + duration + ", id=" + id
				+ ", recordCreationDate=" + recordCreationDate +"]";
	}

//	public Set<MusicalRecord> getMusicalRecord() {
//		return musicalRecord;
//	}
//
//	public void setMusicalRecord(Set<MusicalRecord> musicalRecord) {
//		this.musicalRecord = musicalRecord;
//	}

	
}
