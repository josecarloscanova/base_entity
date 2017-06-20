package org.nanotek.base.record;

/**
 * From defines. 
 * "a thing constituting a piece of evidence about the past, especially an account of an act or occurrence kept in writing or some other permanent form." 
 * 
 * @author josecanovamauger
 */
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.nanotek.base.LocalizedString;
import org.nanotek.base.LongBase;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@SuppressWarnings("serial")
public class Record extends LongBase{

	/**
	 * Title a localizaed String, 
	 * TODO: Change to a StringBase...
	 */
	@OneToOne
	protected LocalizedString title; 
	
	@Enumerated
	protected RecordType recordType = RecordType.Other; 
	
	public Record() 
	{ 
	}

	public Record(RecordType recordType) {
		super();
		this.recordType = recordType;
	}
	

	public LocalizedString getTitle() {
		return title;
	}

	public void setTitle(LocalizedString title) {
		this.title = title;
	}

	
	public RecordType getRecordType() {
		return recordType;
	}

	public void setRecordType(RecordType recordType) {
		this.recordType = recordType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((recordType == null) ? 0 : recordType.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Record other = (Record) obj;
		if (recordType != other.recordType)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Record [title=" + title + ", recordType=" + recordType + "]";
	}

}
