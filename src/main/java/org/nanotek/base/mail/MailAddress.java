package org.nanotek.base.mail;

/**
 * refer > http://www.ietf.org/rfc/rfc822.txt
 */
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.LongBase;
import org.nanotek.base.StringBase;

@Entity
@SuppressWarnings("serial")
public class MailAddress extends LongBase{

	@OneToOne (cascade=CascadeType.PERSIST)
	protected StringBase name; 

	@OneToOne(cascade=CascadeType.PERSIST)
	protected StringBase localPart; 

	@OneToOne(cascade=CascadeType.PERSIST)
	protected StringBase domain;

	public MailAddress()
	{ 
	}
	
	
	public MailAddress(StringBase name, StringBase localPart, StringBase domain) {
		super();
		this.name = name;
		this.localPart = localPart;
		this.domain = domain;
	}
	
	
	public StringBase getName() {
		return name;
	}

	public void setName(StringBase name) {
		this.name = name;
	}

	public StringBase getLocalPart() {
		return localPart;
	}

	public void setLocalPart(StringBase localPart) {
		this.localPart = localPart;
	}

	public StringBase getDomain() {
		return domain;
	}

	public void setDomain(StringBase domain) {
		this.domain = domain;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result
				+ ((localPart == null) ? 0 : localPart.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		MailAddress other = (MailAddress) obj;
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		if (localPart == null) {
			if (other.localPart != null)
				return false;
		} else if (!localPart.equals(other.localPart))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	} 
	
	

	
}
