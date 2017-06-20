package org.nanotek.base.music.company;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import org.nanotek.base.company.Company;
import org.nanotek.base.music.release.MusicalRelease;

/**
 *  Refer Label on MusicBrain, at start holds information on any company at 
 *  MB database.
 *  
 *  May also use as reference -> http://www.hollywoodreporter.com/tv/production-listings#Bootleg%20Productions
 * 
 * Defined as an entrepreneurship to aggregate, artists, bands and crew related to 
 * music industry.
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class RecordCompany extends Company{
	
	//	protected @ManyToMany Set<Company> companies; 
	
	@Enumerated(EnumType.STRING)
	protected RecordCompanyType recordCompanyType  = RecordCompanyType.Other; 
	
	@OneToMany(mappedBy="recordCompany")
	protected Set<MusicalRelease> musicalReleases;
	
	public RecordCompany ()
	{ 
	}

	public RecordCompanyType getRecordCompanyType() {
		return recordCompanyType;
	}

	public void setRecordCompanyType(RecordCompanyType recordCompanyType) {
		this.recordCompanyType = recordCompanyType;
	}

	public Set<MusicalRelease> getMusicalReleases() {
		return musicalReleases;
	}

	public void setMusicalReleases(Set<MusicalRelease> musicalReleases) {
		this.musicalReleases = musicalReleases;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((musicalReleases == null) ? 0 : musicalReleases.hashCode());
		result = prime
				* result
				+ ((recordCompanyType == null) ? 0 : recordCompanyType
						.hashCode());
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
		RecordCompany other = (RecordCompany) obj;
		if (musicalReleases == null) {
			if (other.musicalReleases != null)
				return false;
		} else if (!musicalReleases.equals(other.musicalReleases))
			return false;
		if (recordCompanyType != other.recordCompanyType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecordCompany [recordCompanyType=" + recordCompanyType
				+ ", musicalReleases=" + musicalReleases + "]";
	}
	
}
