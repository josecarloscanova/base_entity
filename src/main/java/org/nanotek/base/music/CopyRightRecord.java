package org.nanotek.base.music;

import java.util.Set;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * 
 * 
 * 
 * @author josecanovamauger
 *
 */
@SuppressWarnings("serial")
public class CopyRightRecord{

	@OneToMany (mappedBy="record")
	protected Set<CopyRightCode> copyRightCode;
	
//	protected @OneToOne MusicalRecord record;

	public Set<CopyRightCode> getCopyRightCode() {
		return copyRightCode;
	}

	public void setCopyRightCode(Set<CopyRightCode> copyRightCode) {
		this.copyRightCode = copyRightCode;
	}

//	public MusicalRecord getRecord() {
//		return record;
//	}
//
//	public void setRecord(MusicalRecord record) {
//		this.record = record;
//	} 
//	
	
}
