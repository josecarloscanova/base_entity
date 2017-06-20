package org.nanotek.base;

import org.nanotek.Base;

@SuppressWarnings("serial")
public class Realm implements Base<Long> {

	private Long id;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	} 
	
}
