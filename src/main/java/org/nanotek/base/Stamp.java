package org.nanotek.base;

import org.nanotek.Stampable;

public class Stamp implements Stampable<Long> {

	protected Long stamp; 
	
	public Stamp() {
		postConstruct();
	}

	public void postConstruct()
	{ 
		this.stamp = System.currentTimeMillis();
	}
	@Override
	public Long getStamp() {
		return stamp;
	}

	public void setStamp(Long stamp) {
		this.stamp = stamp;
	}

}
