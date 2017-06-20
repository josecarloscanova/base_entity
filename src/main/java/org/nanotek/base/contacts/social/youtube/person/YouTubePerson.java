package org.nanotek.base.contacts.social.youtube.person;

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
public class YouTubePerson extends SocialPerson{

	private String youtubeId;

	private String youtubeName;
	
	public String getYoutubeId() {
		return youtubeId;
	}

	public void setYoutubeId(String youtubeId) {
		this.youtubeId = youtubeId;
	}

	public String getYoutubeName() {
		return youtubeName;
	}

	public void setYoutubeName(String youtubeName) {
		this.youtubeName = youtubeName;
	}

	
	
}
