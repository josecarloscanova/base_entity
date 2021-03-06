package org.nanotek.base.music.artist;

import java.util.Set;

import org.nanotek.Base;

/**
 * 
 * @author josecanovamauger
 *
 */
@SuppressWarnings("serial")
public class MusicalArtistAttributes implements Base<Long> {

	private Long id; 
	
	private Set<Base<?>> attributes;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	} 
	
}
