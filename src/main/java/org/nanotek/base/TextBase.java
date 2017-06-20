package org.nanotek.base;

import javax.persistence.Entity;

@Entity
@SuppressWarnings("serial")
public class TextBase extends LongBase{

//	public static final int MAX_LENGTH = ; 
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	} 
	
}
