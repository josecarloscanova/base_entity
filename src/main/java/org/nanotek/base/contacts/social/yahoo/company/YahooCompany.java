package org.nanotek.base.contacts.social.yahoo.company;

import javax.persistence.Entity;

import org.nanotek.base.company.VirtualCompany;

/**
 * Id field designates, the URI where the contact can be found. 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class YahooCompany extends VirtualCompany{

	private String yahooId;

	public String getYahooId() {
		return yahooId;
	}

	public void setYahooId(String yahooId) {
		this.yahooId = yahooId;
	}
	
}
