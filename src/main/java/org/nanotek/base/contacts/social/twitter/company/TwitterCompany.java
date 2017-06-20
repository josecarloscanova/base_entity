package org.nanotek.base.contacts.social.twitter.company;

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
public final class TwitterCompany extends VirtualCompany{

	private String twitterId;

	public String getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}
	
}
