package org.nanotek.base;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity 
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@SuppressWarnings("serial")
public class Work extends LongBase{
	
	@Enumerated (EnumType.ORDINAL)
	private WorkType workType;

	public WorkType getWorkType() {
		return workType;
	}

	public void setWorkType(WorkType workType) {
		this.workType = workType;
	} 

}
