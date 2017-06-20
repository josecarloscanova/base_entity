package org.nanotek.base.record;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.nanotek.base.duration.Duration;
import org.nanotek.base.duration.DurationType;



@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@SuppressWarnings("serial")
public class RecordDuration extends Duration{

	@OneToMany
	private Set<Record> record; 
	
	public RecordDuration() 
	{ 
		this.durationType = DurationType.Other;
	}
	
	public RecordDuration(Set<Record> record) {
		super();
		this.record = record;
	}

	public Set<Record> getRecord() {
		return record;
	}

	public void setRecord(Set<Record> record) {
		this.record = record;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((record == null) ? 0 : record.hashCode());
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
		RecordDuration other = (RecordDuration) obj;
		if (record == null) {
			if (other.record != null)
				return false;
		} else if (!record.equals(other.record))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecordDuration [record=" + record + "]";
	}

}
