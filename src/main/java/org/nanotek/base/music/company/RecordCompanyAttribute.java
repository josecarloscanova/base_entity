package org.nanotek.base.music.company;

import org.nanotek.base.music.AttributeBase;

@SuppressWarnings("serial")
public class RecordCompanyAttribute extends AttributeBase {
	
	private AttributeBase attribute;

	public RecordCompanyAttribute() {
		super();
		this.attribute = null;
	}
	
	public RecordCompanyAttribute(AttributeBase attribute) {
		super();
		this.attribute = attribute;
	}

	public AttributeBase getAttribute() {
		return attribute;
	}

	public void setAttribute(AttributeBase attribute) {
		this.attribute = attribute;
	} 
	
}
