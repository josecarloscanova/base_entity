package org.nanotek.base.copyright;

import java.util.Set;

import org.nanotek.Base;
import org.nanotek.base.LongBase;
import org.nanotek.base.author.Author;

/**
 * 
 * 
 * @author josecanovamauger
 *
 */
@SuppressWarnings("serial")
public class Copyright extends LongBase{

	private Set<Author> authors; 
	private Base<?> origin; 

	public Copyright() 
	{}
	
	
	public Set<Author> getAuthors() {
		return authors;
	}


	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}


	public Base<?> getOrigin() {
		return origin;
	}


	public void setOrigin(Base<?> origin) {
		this.origin = origin;
	}
	
	
}
