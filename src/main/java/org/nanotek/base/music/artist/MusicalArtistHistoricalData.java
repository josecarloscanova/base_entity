package org.nanotek.base.music.artist;

import org.nanotek.Base;
import org.nanotek.base.calendar.CalendarBase;

/**
 * 
 * Date/Time Attributes from a record company. 
 * Not yet finished.
 * 
 * @author josecanovamauger
 *
 */
//@Entity
@SuppressWarnings("serial")
public class MusicalArtistHistoricalData implements Base<Long> {

//	@Id
	private Long id; 
	
//	@OneToOne
	private CalendarBase historicalEventDate;
	
	private Base<?> eventData;
	
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	} 
	
	public CalendarBase getHistoricalEventDate() {
		return historicalEventDate;
	}
	
	public void setHistoricalEventDate(CalendarBase historicalEventDate) {
		this.historicalEventDate = historicalEventDate;
	}

	public Base<?> getEventData() {
		return eventData;
	}
	
	public void setEventData(Base<?> eventData) {
		this.eventData = eventData;
	}

}
