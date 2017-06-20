package org.nanotek.base.artist.name;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.nanotek.base.LongBase;
import org.nanotek.base.artist.Artist;

@Entity
@SuppressWarnings("serial")
public class ArtisticName extends LongBase{

	@OneToMany
	protected Set<ArtistName> artistNames; 
	
	//TODO:Remove the optional
	@ManyToOne (optional=true)
	protected Artist artist;
	
	
	public ArtisticName() 
	{ 
	}
	
	public ArtisticName(Set<ArtistName> artistNames) {
		super();
		this.artistNames = artistNames;
	}

	
	public ArtisticName(Set<ArtistName> artistNames, Artist artist) {
		super();
		this.artistNames = artistNames;
		this.artist = artist;
	}

	public Set<ArtistName> getArtistNames() {
		return artistNames;
	}

	public void setArtistNames(Set<ArtistName> artistNames) {
		this.artistNames = artistNames;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result
				+ ((artistNames == null) ? 0 : artistNames.hashCode());
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
		ArtisticName other = (ArtisticName) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (artistNames == null) {
			if (other.artistNames != null)
				return false;
		} else if (!artistNames.equals(other.artistNames))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArtisticName [artistNames=" + artistNames + ", artist="
				+ artist + "]";
	}
	
}
