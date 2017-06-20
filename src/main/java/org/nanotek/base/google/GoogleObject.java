package org.nanotek.base.google;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.nanotek.Base;

@MappedSuperclass
@SuppressWarnings("serial")
public class GoogleObject<T extends Serializable> implements Base<T>{

	@Id
	protected T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	} 
	
	
}
