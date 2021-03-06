package test.org.nanotek.datanucleus.calendar.builder;

import java.util.Calendar;

import org.nanotek.Builder;
import org.nanotek.base.date.MinuteBase;

public class MinuteBaseBuilder implements Builder<MinuteBase>{

	private Calendar calendar;

	public MinuteBaseBuilder () 
	{ 
		calendar = Calendar.getInstance();
	}
	
	public MinuteBaseBuilder(Calendar calendar) {
		this.calendar = calendar;
	}
	
	@Override
	public MinuteBase build() {
		MinuteBase minuteBase = new MinuteBase(); 
		minuteBase.setSecond(calendar.get(Calendar.SECOND));
		minuteBase.setMillisecond(calendar.get(Calendar.MILLISECOND));
		return minuteBase;
	}

}
