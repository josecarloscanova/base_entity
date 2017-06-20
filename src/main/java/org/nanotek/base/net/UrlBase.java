package org.nanotek.base.net;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.nanotek.base.LongBase;

@Entity
@SuppressWarnings("serial")
public class UrlBase extends LongBase {

	@OneToMany
	protected Set<Url> url;
	
	public UrlBase() {
		super();
	}

	public UrlBase(Set<Url> url) {
		super();
		this.url = url;
	}

	public Set<Url> getUrl() {
		return url;
	}

	public void setUrl(Set<Url> url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		UrlBase other = (UrlBase) obj;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UrlBase [url=" + url + "]";
	}
	
}
