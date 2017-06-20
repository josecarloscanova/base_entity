package org.nanotek.base.contacts.social.youtube.company;

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
public class YouTubeCompany extends VirtualCompany{

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
