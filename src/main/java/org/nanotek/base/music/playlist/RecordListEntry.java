package org.nanotek.base.music.playlist;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.nanotek.base.LongBase;
import org.nanotek.base.calendar.date.music.MusicalRecordCreation;
import org.nanotek.base.music.record.MusicalRecord;


@Entity
@SuppressWarnings("serial")
@Table(name="RecordListEntry", uniqueConstraints=@UniqueConstraint(columnNames={"entryOrder","musicalRecord"}))
public class RecordListEntry extends LongBase{

	@OneToOne
	protected MusicalRecord musicalRecord;

	protected Integer entryOrder;
	
	@OneToOne
	protected MusicalRecordCreation entryCreationDate;

	public RecordListEntry() {
		super();
	}
	
	public MusicalRecord getMusicalRecord() {
		return musicalRecord;
	}


	public void setMusicalRecord(MusicalRecord musicalRecord) {
		this.musicalRecord = musicalRecord;
	}


	public Integer getEntryOrder() {
		return entryOrder;
	}


	public void setEntryOrder(Integer entryOrder) {
		this.entryOrder = entryOrder;
	}


	public MusicalRecordCreation getEntryCreationDate() {
		return entryCreationDate;
	}

	public void setEntryCreationDate(MusicalRecordCreation entryCreationDate) {
		this.entryCreationDate = entryCreationDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((entryCreationDate == null) ? 0 : entryCreationDate
						.hashCode());
		result = prime * result
				+ ((entryOrder == null) ? 0 : entryOrder.hashCode());
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
		RecordListEntry other = (RecordListEntry) obj;
		if (entryCreationDate == null) {
			if (other.entryCreationDate != null)
				return false;
		} else if (!entryCreationDate.equals(other.entryCreationDate))
			return false;
		if (entryOrder == null) {
			if (other.entryOrder != null)
				return false;
		} else if (!entryOrder.equals(other.entryOrder))
			return false;
		if (musicalRecord == null) {
			if (other.musicalRecord != null)
				return false;
		} else if (!musicalRecord.equals(other.musicalRecord))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecordListEntry [musicalRecord=" + musicalRecord
				+ ", entryOrder=" + entryOrder + ", entryCreationDate="
				+ entryCreationDate + "]";
	}
}
