package org.nanotek.base.artist.name;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.person.name.NamePerson;

@Entity
@SuppressWarnings("serial")
public class ArtistName extends NamePerson{

	@Enumerated(EnumType.STRING)
	protected ArtistNameType artistNameType = ArtistNameType.Other;

	public ArtistName() 
	{
	}
	
	public ArtistName(ArtistNameType artistNameType) 
	{
		this.artistNameType = artistNameType;
	}

	public ArtistNameType getArtistNameType() {
		return artistNameType;
	}

	public void setArtistNameType(ArtistNameType artistNameType) {
		this.artistNameType = artistNameType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((artistNameType == null) ? 0 : artistNameType.hashCode());
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
		ArtistName other = (ArtistName) obj;
		if (artistNameType != other.artistNameType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArtistName [artistNameType=" + artistNameType + "]";
	}
	
}
