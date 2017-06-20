package org.nanotek.base.contacts.social.linkedin.company;

import javax.persistence.Entity;

import org.nanotek.base.company.Company;
import org.nanotek.base.company.VirtualCompany;
/**
 * Id field designates, the URI where the contact can be found. 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public final class LinkedInCompany extends VirtualCompany{

	private String linkedInId;

	public String getLinkedInId() {
		return linkedInId;
	}

	public void setLinkedInId(String linkedInId) {
		this.linkedInId = linkedInId;
	}
	
}
