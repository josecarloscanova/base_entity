package org.nanotek.base.person;

import org.nanotek.base.animal.Animal;

public interface Human<G> extends Animal<Human<?>>{

	public G getGender();
	
}
