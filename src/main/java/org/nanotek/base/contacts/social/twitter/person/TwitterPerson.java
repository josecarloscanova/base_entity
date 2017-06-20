package org.nanotek.base.contacts.social.twitter.person;

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
public final class TwitterPerson extends SocialPerson{

	private String twitterId;

	public String getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}
	
}
