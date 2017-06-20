
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
public class Title <T extends Serializable> implements Base<T> {

	protected T id;

	public Title(){}
	
	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	} 
	
}
