package org.nanotek.base.jpa;

import org.nanotek.Base;

public interface PrePersistEventListener <K extends Base<?>>{

	public void prePersist(K pertistentEntity);
	
}
