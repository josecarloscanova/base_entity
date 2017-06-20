package org.nanotek.base;

import java.io.Serializable;

import org.nanotek.Base;

/**
 * 
 * @author josecanovamauger
 *
 * @param <T> 
 */
@SuppressWarnings("serial")
public class MimeType <T extends Serializable>implements Base<T> {

	protected T id; 
	
	protected String    primaryType;
	protected String    subType;
    
	public MimeType(){}
	
	@Override
	public T getId() {
		return id;
	}
	@Override
	public void setId(T id) {
		this.id = id;
	}
	
	public String getPrimaryType() {
		return primaryType;
	}
	
	public void setPrimaryType(String primaryType) {
		this.primaryType = primaryType;
	}
	
	public String getSubType() {
		return subType;
	}
	
	public void setSubType(String subType) {
		this.subType = subType;
	}

}
