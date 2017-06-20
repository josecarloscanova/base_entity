package org.nanotek.base.music.release;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.music.company.RecordCompany;
import org.nanotek.base.music.group.MusicalGroup;
import org.nanotek.base.music.record.MusicalRecord;

@Entity
//@Table(uniqueConstraints=@UniqueConstraint(name="u_record_release", columnNames={"recordCompany", "musicalRecord","musicalGroup"}))
@SuppressWarnings("serial")
public class MusicalRelease extends LongBase{

	@ManyToOne (optional=false)
	protected RecordCompany recordCompany;
	
	@ManyToOne (optional=false)
	protected MusicalRecord musicalRecord;

	@ManyToOne (optional=false)
	protected MusicalGroup musicalGroup;

	@ManyToMany 
	protected Set<MusicalReleaseCountry> musicalReleaseCountry;
	
	
	public RecordCompany getRecordCompany() {
		return recordCompany;
	}

	public void setRecordCompany(RecordCompany recordCompany) {
		this.recordCompany = recordCompany;
	}

	public MusicalRecord getMusicalRecord() {
		return musicalRecord;
	}

	public void setMusicalRecord(MusicalRecord musicalRecord) {
		this.musicalRecord = musicalRecord;
	}

	public MusicalGroup getMusicalGroup() {
		return musicalGroup;
	}

	public void setMusicalGroup(MusicalGroup musicalGroup) {
		this.musicalGroup = musicalGroup;
	}

	public Set<MusicalReleaseCountry> getMusicalReleaseCountry() {
		return musicalReleaseCountry;
	}

	public void setMusicalReleaseCountry(
			Set<MusicalReleaseCountry> musicalReleaseCountry) {
		this.musicalReleaseCountry = musicalReleaseCountry;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((musicalGroup == null) ? 0 : musicalGroup.hashCode());
		result = prime * result
				+ ((musicalRecord == null) ? 0 : musicalRecord.hashCode());
		result = prime
				* result
				+ ((musicalReleaseCountry == null) ? 0 : musicalReleaseCountry
						.hashCode());
		result = prime * result
				+ ((recordCompany == null) ? 0 : recordCompany.hashCode());
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
		MusicalRelease other = (MusicalRelease) obj;
		if (musicalGroup == null) {
			if (other.musicalGroup != null)
				return false;
		} else if (!musicalGroup.equals(other.musicalGroup))
			return false;
		if (musicalRecord == null) {
			if (other.musicalRecord != null)
				return false;
		} else if (!musicalRecord.equals(other.musicalRecord))
			return false;
		if (musicalReleaseCountry == null) {
			if (other.musicalReleaseCountry != null)
				return false;
		} else if (!musicalReleaseCountry.equals(other.musicalReleaseCountry))
			return false;
		if (recordCompany == null) {
			if (other.recordCompany != null)
				return false;
		} else if (!recordCompany.equals(other.recordCompany))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MusicalRelease [recordCompany=" + recordCompany
				+ ", musicalRecord=" + musicalRecord + ", musicalGroup="
				+ musicalGroup + ", musicalReleaseCountry="
				+ musicalReleaseCountry + "]";
	}
	
}
