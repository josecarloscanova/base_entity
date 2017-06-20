package org.nanotek.base.contacts.social.facebook.person;

import javax.persistence.Entity;

import org.nanotek.base.contact.SocialPerson;
import org.nanotek.base.contact.SocialPersonType;
import org.nanotek.base.person.Person;

/**
 * Id field designates, the URI where the contact can be found. 
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public final class FaceBookPerson extends SocialPerson{

	private String faceBookId;
	
	public FaceBookPerson()
	{ 
		this.socialPersonType = SocialPersonType.FaceBook;
	}

	public String getFaceBookId() {
		return faceBookId;
	}

	public void setFaceBookId(String faceBookId) {
		this.faceBookId = faceBookId;
	}
	
}
