package org.nanotek.base.calendar;

import org.nanotek.Groupable;

public enum CalendarGroupType implements Groupable<CalendarGroupType>{

	DATE, 
	DAY, 
	MINUTE,
	TIMEZONE;
	
	@Override
	public CalendarGroupType getGroup() {
		return this;
	}

}
