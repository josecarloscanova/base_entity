package org.nanotek.base.atlas;

import javax.persistence.MappedSuperclass;

import org.nanotek.base.LongBase;
/**
 * Just a tag supperclass, 
 * using to determine the best cadinality for subclasses.
 * 
 * @author josecanovamauger
 *
 */
@MappedSuperclass
@SuppressWarnings("serial")
public abstract class Area extends LongBase{

	public Area getArea()
	{ 
		return this;
	}
	
}
