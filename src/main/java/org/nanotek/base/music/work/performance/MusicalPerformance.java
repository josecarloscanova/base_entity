package org.nanotek.base.music.work.performance;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.nanotek.base.Work;
import org.nanotek.base.artist.Artist;
import org.nanotek.base.performance.PerformanceBase;

/**
 * TODO:Compare Collection-Set-List on OneToMany
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class MusicalPerformance extends PerformanceBase {

	@OneToOne
	private Work work; 
	
	@Enumerated
	private MusicalPerformanceType musicalPerformanceType;

	@OneToMany
	private Collection<Artist> artists; 
	
	public MusicalPerformance()
	{ 
		this.musicalPerformanceType = MusicalPerformanceType.Other;
	}
	
	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}

	public MusicalPerformanceType getMusicalPerformanceType() {
		return musicalPerformanceType;
	}

	public void setMusicalPerformanceType(
			MusicalPerformanceType musicalPerformanceType) {
		this.musicalPerformanceType = musicalPerformanceType;
	}

	
}
