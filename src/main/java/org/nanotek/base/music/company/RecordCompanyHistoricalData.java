package org.nanotek.base.music.company;

import java.util.Date;

import org.nanotek.Base;

/**
 * Date/Time Attributes from a record company. 
 * 
 * @author josecanovamauger
 *
 */
@SuppressWarnings("serial")
public class RecordCompanyHistoricalData implements Base<Long> {

	private Long id; 
	private Date historicalEventDate;
	private Base<?> eventData;
	
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	} 
	
	public Date getHistoricalEventDate() {
		return historicalEventDate;
	}
	
	public void setHistoricalEventDate(Date historicalEventDate) {
		this.historicalEventDate = historicalEventDate;
	}

	public Base<?> getEventData() {
		return eventData;
	}
	
	public void setEventData(Base<?> eventData) {
		this.eventData = eventData;
	}

}
