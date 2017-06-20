package org.nanotek.base.music.record;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.music.artist.MusicalArtist;
import org.nanotek.base.music.instrument.InstrumentBase;

@Entity
@SuppressWarnings("serial")
public class MusicalRecordParticipation extends LongBase{
	
	@OneToMany (cascade=CascadeType.PERSIST)
	protected Set<InstrumentBase> instrument = new HashSet<InstrumentBase>();
	
	@OneToOne  (optional=false,orphanRemoval=false) 
	protected MusicalArtist musicalArtist;
	
	protected Boolean singer = false;
	
	public MusicalRecordParticipation()
	{ 
	}

	public Set<InstrumentBase> getInstrument() {
		return instrument;
	}

	public void setInstrument(Set<InstrumentBase> instrument) {
		this.instrument = instrument;
	}

	public MusicalArtist getMusicalArtist() {
		return musicalArtist;
	}

	public void setMusicalArtist(MusicalArtist musicalArtist) {
		this.musicalArtist = musicalArtist;
	}

	public Boolean getSinger() {
		return singer;
	}

	public void setSinger(Boolean singer) {
		this.singer = singer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((instrument == null) ? 0 : instrument.hashCode());
		result = prime * result
				+ ((musicalArtist == null) ? 0 : musicalArtist.hashCode());
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
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
		MusicalRecordParticipation other = (MusicalRecordParticipation) obj;
		if (instrument == null) {
			if (other.instrument != null)
				return false;
		} else if (!instrument.equals(other.instrument))
			return false;
		if (musicalArtist == null) {
			if (other.musicalArtist != null)
				return false;
		} else if (!musicalArtist.equals(other.musicalArtist))
			return false;
		if (singer == null) {
			if (other.singer != null)
				return false;
		} else if (!singer.equals(other.singer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MusicalRecordParticipation [instrument=" + instrument
				+ ", musicalArtist=" + musicalArtist + ", singer=" + singer
				+ "]";
	}
	
}
