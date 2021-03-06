package org.nanotek.base.date.jpa;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

import org.nanotek.base.calendar.Datable;
import org.nanotek.base.jpa.EntityPersistenceEventListener;

public class DatableEventListener<K extends Datable> implements EntityPersistenceEventListener<K>{

	@Override
	@PrePersist
	public void prePersist(K pertistentEntity) {
//		pertistentEntity.setId(System.currentTimeMillis());
	}

	@Override
	@PostPersist
	public void postPersist(K pertistentEntity) {
		//Do nothing for now.
	}
	
}
