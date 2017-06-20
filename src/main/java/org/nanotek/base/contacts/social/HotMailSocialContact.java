package org.nanotek.base.contacts.social;

import javax.persistence.OneToOne;

import org.nanotek.base.net.Url;

@SuppressWarnings("serial")
public class HotMailSocialContact extends SocialContact{

	@OneToOne
	protected Url userUrl;

	public HotMailSocialContact() {
		super();
	} 
	
	
	public HotMailSocialContact(Url userUrl) {
		super();
		this.userUrl = userUrl;
	}

}
