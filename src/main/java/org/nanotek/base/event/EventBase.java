package org.nanotek.base.event;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.nanotek.Base;

@Entity
@SuppressWarnings("serial")
public class EventBase implements Base<Long>{

	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToOne
	private Base<?> sourceEvent;

	public Base<?> getSourceEvent() {
		return sourceEvent;
	}

	public void setSourceEvent(Base<?> sourceEvent) {
		this.sourceEvent = sourceEvent;
	}
	
}
