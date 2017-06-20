package org.nanotek.base.music.playlist;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.calendar.date.TemporalDate;
import org.nanotek.base.calendar.date.music.PlayListRecordCreation;

@Entity
@Inheritance (strategy=InheritanceType.JOINED)
@SuppressWarnings("serial")
public class PlayList extends LongBase{

	@OneToMany
	protected Set<RecordListEntry> recordListEntries;
	
	@OneToOne
	protected PlayListRecordCreation recordCreationDate;
	
	public PlayList() {
	}

	public Set<RecordListEntry> getRecordListEntries() {
		return recordListEntries;
	}

	public void setRecordListEntries(Set<RecordListEntry> recordListEntries) {
		this.recordListEntries = recordListEntries;
	}

}
