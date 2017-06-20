package org.nanotek.base.contacts.social.facebook.company;

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
public final class FaceBookCompany extends VirtualCompany{

	private String faceBookId;

	public String getFaceBookId() {
		return faceBookId;
	}

	public void setFaceBookId(String faceBookId) {
		this.faceBookId = faceBookId;
	}
	
}
