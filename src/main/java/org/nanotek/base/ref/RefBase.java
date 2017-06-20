package org.nanotek.base.ref;

import org.nanotek.Base;

@SuppressWarnings("serial")
public class RefBase implements Base<Long>{
	
	private Long id; 
	
	private String ref; 
	
	private RefType type; 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public RefType getType() {
		return type;
	}

	public void setType(RefType type) {
		this.type = type;
	}

}
