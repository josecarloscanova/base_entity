package test.org.nanotek.datanucleus.calendar.builder;

import java.util.Calendar;

import org.nanotek.Builder;
import org.nanotek.base.date.DayBase;

public class DayBaseBuilder implements Builder <DayBase>{

	
	private Calendar calendar;

	public DayBaseBuilder() {
			calendar = Calendar.getInstance();
	}
	
	public DayBaseBuilder(Calendar calendar) {
		this.calendar = calendar;
	}

	@Override
	public DayBase build() {
		
		DayBase dayBase = new DayBase();
		dayBase.setHour(calendar.get(Calendar.HOUR_OF_DAY));
		dayBase.setMinute(calendar.get(Calendar.MINUTE));
		return dayBase;
	}

}
