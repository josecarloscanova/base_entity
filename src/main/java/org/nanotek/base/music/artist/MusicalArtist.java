package org.nanotek.base.music.artist;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.nanotek.base.artist.Artist;
import org.nanotek.base.artist.ArtistType;
import org.nanotek.base.music.group.MusicalGroup;
import org.nanotek.base.music.record.MusicalRecordPerformance;

/**
 * 
 * Usually someone that participate on "musical performances", 
 * Concerts, Records... 
 * It is not intended to be used with Technical Staff. 
 * 
 * @see http://musicbrainz.org/doc/Artist
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.JOINED)
public class MusicalArtist extends Artist{

	@OneToMany(orphanRemoval=true)
	protected Set<MusicalRecordPerformance> artistPerformances = new HashSet<MusicalRecordPerformance>();
	
	@ManyToMany
	protected Set<MusicalGroup> musicalGroup;
	
	public MusicalArtist() 
	{ 
		super();
		this.artistType = ArtistType.Musician;
	}
	
	
	public MusicalArtist(ArtistType artistType) {
		super(artistType);
	}


	public Set<MusicalRecordPerformance> getArtistPerformances() {
		return artistPerformances;
	}


	public void setArtistPerformances(
			Set<MusicalRecordPerformance> artistPerformances) {
		this.artistPerformances = artistPerformances;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((artistPerformances == null) ? 0 : artistPerformances
						.hashCode());
		result = prime * result
				+ ((musicalGroup == null) ? 0 : musicalGroup.hashCode());
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
		MusicalArtist other = (MusicalArtist) obj;
		if (artistPerformances == null) {
			if (other.artistPerformances != null)
				return false;
		} else if (!artistPerformances.equals(other.artistPerformances))
			return false;
		if (musicalGroup == null) {
			if (other.musicalGroup != null)
				return false;
		} else if (!musicalGroup.equals(other.musicalGroup))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "MusicalArtist [artistPerformances=" + artistPerformances
				+ ", musicalGroup=" + musicalGroup + "]";
	}

	

}
