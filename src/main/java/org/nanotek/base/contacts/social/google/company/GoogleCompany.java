package org.nanotek.base.contacts.social.google.company;

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
public final class GoogleCompany extends VirtualCompany {

	private String googleId;

	public String getGoogleId() {
		return googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	} 
	
	
}
