package org.nanotek.base;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import org.nanotek.Base;

@MappedSuperclass
@SuppressWarnings("serial")
public class Link<T extends Serializable> implements Base<T>{

	protected T id;
	protected Base<?> origin;
	protected Base<?> target;
	
	
	public Link(){
	}
	
	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public Base<?> getOrigin() {
		return origin;
	}

	public void setOrigin(Base<?> origin) {
		this.origin = origin;
	}

	public Base<?> getTarget() {
		return target;
	}

	public void setTarget(Base<?> target) {
		this.target = target;
	} 

}
