package org.nanotek.base.net;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.nanotek.base.LongBase;

@Entity
@SuppressWarnings("serial")
public class Url extends LongBase {

	@OneToMany(mappedBy="parentUrl")
	protected Set<UrlStringBase> url; 
	
	public Url() {
	}
	
	public Url(Set<UrlStringBase> url) {
		super();
		this.url = url;
	}


	public Set<UrlStringBase> getUrl() {
		return url;
	}

	public void setUrl(Set<UrlStringBase> url) {
		this.url = url;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Url other = (Url) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (url == null) {
			if (other.url != null) {
				return false;
			}
		} else if (!url.equals(other.url)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Url [id=" + id + ", url=" + url.toString() + "]";
	}
	
	
}
