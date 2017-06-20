package org.nanotek.base.contacts.mail;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.contact.Contact;
import org.nanotek.base.mail.MailBox;

@Entity
@SuppressWarnings("serial")
public class MailContact extends Contact{

	@OneToOne
	private MailBox mailBox; 
	
	public MailContact () 
	{ 
	}

	public MailBox getMailBox() {
		return mailBox;
	}

	public void setMailBox(MailBox mailBox) {
		this.mailBox = mailBox;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mailBox == null) ? 0 : mailBox.hashCode());
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
		MailContact other = (MailContact) obj;
		if (mailBox == null) {
			if (other.mailBox != null)
				return false;
		} else if (!mailBox.equals(other.mailBox))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MailContact [mailBox=" + mailBox + "]";
	}
	
}
