package org.nanotek.base;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.nanotek.Base;

/**
 * Can be used as a "default Super class" on case of 
 * a more refine and complex class hierarchy. 
 * 
 * @author josecanovamauger
 *
 * @param <T> Serializable Object that represents the ID (unique identifier) of 
 * any subclass. 
 * 
 */
@MappedSuperclass
@SuppressWarnings("serial")
public abstract class AbstractBase <T extends Serializable> implements Base<T>{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	protected T id; 
	
	public AbstractBase(){ 
		id = null;
	}
	
	public AbstractBase(T id) {
		this.id = id;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
}
