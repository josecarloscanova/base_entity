package org.nanotek.base.artist;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;

import org.nanotek.base.artist.name.ArtistName;
import org.nanotek.base.person.Person;

import javax.persistence.InheritanceType;

@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class Artist extends Person {
	
	@Enumerated(value=EnumType.STRING)
	protected ArtistType artistType = ArtistType.Other;

	@OneToMany(fetch=FetchType.EAGER,orphanRemoval=false,cascade={CascadeType.PERSIST, CascadeType.REFRESH})
	protected Set<ArtistName> artistNames = new HashSet<ArtistName>();
	
	public Artist() {
		super();
	}
	
	public Artist(ArtistType artistType) {
		super();
		this.artistType = artistType;
	}

	public Artist(ArtistType artistType, Set<ArtistName> artistNames) {
		super();
		this.artistType = artistType;
		this.artistNames = artistNames;
	}

	public ArtistType getArtistType() {
		return artistType;
	}

	public void setArtistType(ArtistType artistType) {
		this.artistType = artistType;
	}

	public Set<ArtistName> getArtistNames() {
		return artistNames;
	}

	public void setArtistNames(Set<ArtistName> artistNames) {
		this.artistNames = artistNames;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((artistNames == null) ? 0 : artistNames.hashCode());
		result = prime * result
				+ ((artistType == null) ? 0 : artistType.hashCode());
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
		Artist other = (Artist) obj;
		if (artistNames == null) {
			if (other.artistNames != null)
				return false;
		} else if (!artistNames.equals(other.artistNames))
			return false;
		if (artistType != other.artistType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artist [artistType=" + artistType + ", artistNames="
				+ artistNames + "]";
	}

}
