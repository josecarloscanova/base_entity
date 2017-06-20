package org.nanotek.base.contacts.social;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.net.Url;

@Entity
@SuppressWarnings("serial")
public class GoogleSocialContact extends SocialContact{

	@OneToOne
	protected Url userUrl; 
	
	public GoogleSocialContact() 
	{ 
		super();
	}
	
	public GoogleSocialContact(Url userUrl) {
		super();
		this.userUrl = userUrl;
	}

	public Url getUserUrl() {
		return userUrl;
	}

	public void setUserUrl(Url userUrl) {
		this.userUrl = userUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((userUrl == null) ? 0 : userUrl.hashCode());
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
		GoogleSocialContact other = (GoogleSocialContact) obj;
		if (userUrl == null) {
			if (other.userUrl != null)
				return false;
		} else if (!userUrl.equals(other.userUrl))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GoogleSocialContact [userUrl=" + userUrl + "]";
	}
	
}
