package org.nanotek.base.music.company;

import java.util.Set;

import org.nanotek.Base;

/**
 * Set of attributes that describe a record company 
 * (retrieve from external data sources). 
 * 
 * @author josecanovamauger
 *
 */
@SuppressWarnings("serial")
public class RecordCompanyAttributes implements Base<Long>{

	private Long id; 
	private Set<Base<?>> attributes; 
	
	
	public Set<Base<?>> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<Base<?>> attributes) {
		this.attributes = attributes;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
