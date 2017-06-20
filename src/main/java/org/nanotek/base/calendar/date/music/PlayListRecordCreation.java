package org.nanotek.base.calendar.date.music;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.calendar.date.RecordCreation;
import org.nanotek.base.calendar.date.TemporalDateType;
import org.nanotek.base.music.playlist.PlayList;

@Entity
@SuppressWarnings("serial")
public class PlayListRecordCreation extends RecordCreation{

	@OneToOne
	protected PlayList playList;

	public PlayListRecordCreation()
	{ 
		this.temporalDateType = TemporalDateType.PlayList;
	}
	
	public PlayList getPlayList() {
		return playList;
	}

	public void setPlayList(PlayList playList) {
		this.playList = playList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((playList == null) ? 0 : playList.hashCode());
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
		PlayListRecordCreation other = (PlayListRecordCreation) obj;
		if (playList == null) {
			if (other.playList != null)
				return false;
		} else if (!playList.equals(other.playList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlayListRecordCreation [playList=" + playList + "]";
	}
	
}
