package org.nanotek.base.music.group;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.nanotek.base.artist.group.Group;
import org.nanotek.base.artist.group.GroupType;
import org.nanotek.base.music.artist.MusicalArtist;
import org.nanotek.base.music.release.MusicalRelease;

@Entity
@SuppressWarnings("serial")
public class MusicalGroup extends Group{

	@ManyToMany(mappedBy="musicalGroup")
	protected Set<MusicalArtist> groupFormation;

	@OneToMany(mappedBy="musicalGroup")
	protected Set<MusicalRelease> musicalReleases;

	@Column(length=1000,nullable=false)
	protected String musicalGroupDesignation; 
	
	
	public MusicalGroup()
	{
		this.groupType = GroupType.Musical;
	}
	

	public Set<MusicalArtist> getGroupFormation() {
		return groupFormation;
	}

	public void setGroupFormation(Set<MusicalArtist> groupFormation) {
		this.groupFormation = groupFormation;
	}

	public Set<MusicalRelease> getMusicalReleases() {
		return musicalReleases;
	}

	public void setMusicalReleases(Set<MusicalRelease> musicalReleases) {
		this.musicalReleases = musicalReleases;
	}

	public String getMusicalGroupDesignation() {
		return musicalGroupDesignation;
	}

	public void setMusicalGroupDesignation(String musicalGroupDesignation) {
		this.musicalGroupDesignation = musicalGroupDesignation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((groupFormation == null) ? 0 : groupFormation.hashCode());
		result = prime
				* result
				+ ((musicalGroupDesignation == null) ? 0
						: musicalGroupDesignation.hashCode());
		result = prime * result
				+ ((musicalReleases == null) ? 0 : musicalReleases.hashCode());
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
		MusicalGroup other = (MusicalGroup) obj;
		if (groupFormation == null) {
			if (other.groupFormation != null)
				return false;
		} else if (!groupFormation.equals(other.groupFormation))
			return false;
		if (musicalGroupDesignation == null) {
			if (other.musicalGroupDesignation != null)
				return false;
		} else if (!musicalGroupDesignation
				.equals(other.musicalGroupDesignation))
			return false;
		if (musicalReleases == null) {
			if (other.musicalReleases != null)
				return false;
		} else if (!musicalReleases.equals(other.musicalReleases))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MusicalGroup [groupFormation=" + groupFormation
				+ ", musicalReleases=" + musicalReleases
				+ ", musicalGroupDesignation=" + musicalGroupDesignation + "]";
	}
	

}
