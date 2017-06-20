package org.nanotek.base.contacts.social.yahoo.person;

import javax.persistence.Entity;

import org.nanotek.base.contact.SocialPerson;
import org.nanotek.base.person.Person;

/**
 * Id field designates, the URI where the contact can be found. 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class YahooPerson extends SocialPerson{

	private String yahooId;

	public String getYahooId() {
		return yahooId;
	}

	public void setYahooId(String yahooId) {
		this.yahooId = yahooId;
	} 
	
	
	
}
