package org.nanotek.base.company;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.nanotek.base.net.UrlBase;

/**
 * A company basically represented by a WEB presence other than 
 * physical presence (for example malls and its relatives). 
 * Physical Companies, like Stores, Malls, Banks might have a physical 
 * representation, while Virtual Companies, does not requires a specific physical location. 
 * Since a Company might represent several virtual companies and each of this companies, 
 * also can present it self on different locations (like google, facbook, linked in, its own domain address). 
 * usind different URI (a url that represents the company or it's home page). 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@SuppressWarnings("serial")
public class VirtualCompany extends Company{

	@OneToOne
	protected UrlBase urlBase;

	public VirtualCompany()
	{ 
		super();
	}
	
	public VirtualCompany(UrlBase urlBase) {
		super();
		this.urlBase = urlBase;
	}

	public UrlBase getUrlBase() {
		return urlBase;
	}

	public void setUrlBase(UrlBase urlBase) {
		this.urlBase = urlBase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((urlBase == null) ? 0 : urlBase.hashCode());
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
		VirtualCompany other = (VirtualCompany) obj;
		if (urlBase == null) {
			if (other.urlBase != null)
				return false;
		} else if (!urlBase.equals(other.urlBase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VirtualCompany [urlBase=" + urlBase + "]";
	}

}
