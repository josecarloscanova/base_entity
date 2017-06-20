package org.nanotek.base.author;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.nanotek.base.person.Person;


@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Author extends Person{
//	
//	@OneToMany
//	protected Set<AuthorArtisticName> artisticNames;
	
	public Author () 
	{}
	

//	public Author(Set<AuthorArtisticName> artisticNames) {
//		super();
//		this.artisticNames = artisticNames;
//	}
//	
//
//	public Set<AuthorArtisticName> getArtisticNames() {
//		return artisticNames;
//	}
//
//	public void setArtisticNames(Set<AuthorArtisticName> artisticNames) {
//		this.artisticNames = artisticNames;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = super.hashCode();
//		result = prime * result
//				+ ((artisticNames == null) ? 0 : artisticNames.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!super.equals(obj))
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Author other = (Author) obj;
//		if (artisticNames == null) {
//			if (other.artisticNames != null)
//				return false;
//		} else if (!artisticNames.equals(other.artisticNames))
//			return false;
//		return true;
//	}
	
}
