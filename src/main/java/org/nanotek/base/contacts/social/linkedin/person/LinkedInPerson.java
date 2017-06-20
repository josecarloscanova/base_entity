package org.nanotek.base.contacts.social.linkedin.person;

import javax.persistence.Entity;

import org.nanotek.base.contact.SocialPerson;
/**
 * Id field designates, the URI where the contact can be found. 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public final class LinkedInPerson extends SocialPerson{

	private String linkedInId;

	public String getLinkedInId() {
		return linkedInId;
	}

	public void setLinkedInId(String linkedInId) {
		this.linkedInId = linkedInId;
	} 
}
