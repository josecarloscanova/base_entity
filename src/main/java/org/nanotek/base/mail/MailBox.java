package org.nanotek.base.mail;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
public class MailBox {

	@Enumerated(EnumType.STRING)
	protected MailBoxType mailBoxType = MailBoxType.Other;

	@OneToOne protected MailAddress mailAddress; 
	
	public MailBoxType getMailBoxType() {
		return mailBoxType;
	}
	
	public MailBox(MailAddress mailAddress) {
		super();
		this.mailAddress = mailAddress;
	}

	public void setMailBoxType(MailBoxType mailBoxType) {
		this.mailBoxType = mailBoxType;
	}

	public MailAddress getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(MailAddress mailAddress) {
		this.mailAddress = mailAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((mailAddress == null) ? 0 : mailAddress.hashCode());
		result = prime * result
				+ ((mailBoxType == null) ? 0 : mailBoxType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MailBox other = (MailBox) obj;
		if (mailAddress == null) {
			if (other.mailAddress != null)
				return false;
		} else if (!mailAddress.equals(other.mailAddress))
			return false;
		if (mailBoxType != other.mailBoxType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MailBox [mailBoxType=" + mailBoxType + ", mailAddress="
				+ mailAddress + "]";
	} 
	
}
