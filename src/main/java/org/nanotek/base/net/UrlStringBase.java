package org.nanotek.base.net;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import org.nanotek.base.StringPositionBase;

@Entity
@SuppressWarnings("serial")
public class UrlStringBase extends StringPositionBase{
	
	@ManyToOne
	protected Url parentUrl;
	
	@Enumerated 
	protected UrlPartType urlPartType;

	
	public UrlStringBase() 
	{ 
		this.urlPartType = UrlPartType.Other;
	}
	
	
	
	public UrlStringBase(UrlPartType urlPartType) {
		super();
		this.urlPartType = urlPartType;
	}

	public UrlPartType getUrlPartType() {
		return urlPartType;
	}

	public void setUrlPartType(UrlPartType urlPartType) {
		this.urlPartType = urlPartType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((urlPartType == null) ? 0 : urlPartType.hashCode());
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
		UrlStringBase other = (UrlStringBase) obj;
		if (urlPartType != other.urlPartType)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "UrlStringBase [urlPartType=" + urlPartType + "]";
	} 
	
}
