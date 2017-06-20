package org.nanotek.base.artist.group;

import org.nanotek.Groupable;

/**
 * Some domain definitions for "artist related groups". 
 * 
 * @author josecanovamauger.
 *
 */
public enum GroupType implements Groupable<GroupType>{

	Musical, 
	Band, 
	Performance, 
	Stunt, 
	Cinema, 
	Theater, 
	Television,
	Other;

	/**
	 * Returns the Current Instance of the Enumerated Type. 
	 * Useful (maybe) on identifying "types of groups"  on 
	 * large sets.
	 * 
	 */
	@Override
	public GroupType getGroup() {
		return this;
	}

}
