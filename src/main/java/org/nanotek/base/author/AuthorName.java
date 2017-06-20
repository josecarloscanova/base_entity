package org.nanotek.base.author;

import java.util.Set;

import javax.persistence.Entity;

import org.nanotek.base.LongBase;
import org.nanotek.base.person.name.NamePerson;

@Entity
@SuppressWarnings("serial")
public class AuthorName extends LongBase{

	protected Set<NamePerson> authorNames;
	
	public AuthorName() 
	{ 
	}

	public AuthorName(Set<NamePerson> authorNames) {
		super();
		this.authorNames = authorNames;
	}

	public Set<NamePerson> getAuthorNames() {
		return authorNames;
	}

	public void setAuthorNames(Set<NamePerson> authorNames) {
		this.authorNames = authorNames;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((authorNames == null) ? 0 : authorNames.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorName other = (AuthorName) obj;
		if (authorNames == null) {
			if (other.authorNames != null)
				return false;
		} else if (!authorNames.equals(other.authorNames))
			return false;
		return true;
	}
	
	
}
