package org.nanotek.base.music.author.composer;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

import org.nanotek.base.author.Author;

@Entity
@SuppressWarnings("serial")
public class Composer extends Author{

	@Enumerated
	protected ComposerType composerType = ComposerType.Other; 
	
	
	public Composer() 
	{ 
	}

	public ComposerType getComposerType() {
		return composerType;
	}


	public void setComposerType(ComposerType composerType) {
		this.composerType = composerType;
	}
	
}
