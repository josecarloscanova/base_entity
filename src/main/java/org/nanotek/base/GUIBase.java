package org.nanotek.base;

import java.rmi.server.UID;

import org.nanotek.Base;

@SuppressWarnings("serial")
public class GUIBase implements Base<UID> {
	
	protected UID id;

	public UID getId() {
		return id;
	}

	public void setId(UID id) {
		this.id = id;
	} 
	
}
