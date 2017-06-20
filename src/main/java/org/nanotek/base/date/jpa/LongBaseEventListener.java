package org.nanotek.base.date.jpa;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.persistence.PrePersist;

import org.nanotek.base.LongBase;
import org.nanotek.base.jpa.PrePersistEventListener;

/**
 * Generates a DateStamp using an event listener of Insert
 * 
 * @author josecanova
 *
 */
public class LongBaseEventListener implements  PrePersistEventListener<LongBase> {
	
	@Override
	@PrePersist
	public void prePersist(LongBase e) {
		e.setRecordCreationDate(new Timestamp(Calendar.getInstance().getTimeInMillis()));
	}

}
