package org.nanotek.base.contacts.mail;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.nanotek.base.company.Company;
import org.nanotek.base.contact.CommercialContact;
import org.nanotek.base.contact.ContactType;

@Entity
@SuppressWarnings("serial")
public class ComercialMail extends MailContact implements CommercialContact<Company>{

	@OneToOne 
	protected Company company;
	
	public ComercialMail() 
	{ 
		this.contactType = ContactType.MailContact;
	}
	
	public ComercialMail(Company company) {
		super();
		this.company = company;
	}

	@Override
	public Company getCommercialContact() {
		return null;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((company == null) ? 0 : company.hashCode());
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
		ComercialMail other = (ComercialMail) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ComercialMail [company=" + company + "]";
	}
	
}
