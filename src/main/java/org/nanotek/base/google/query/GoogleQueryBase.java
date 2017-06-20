package org.nanotek.base.google.query;

import javax.persistence.Entity;

import org.nanotek.Base;
import org.nanotek.base.google.GoogleBase;

@Entity
@SuppressWarnings("serial")
public abstract class GoogleQueryBase extends GoogleBase   {

	private Base<?> query;
	
	public  Base<?> getQuery() {
		return query;
	}

	public void setQuery(Base<?> query) {
		this.query = query;
	}

}
