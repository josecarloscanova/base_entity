package org.nanotek.base.contacts.social.generic.company;

import org.nanotek.base.company.Company;

@SuppressWarnings("serial")
public class GenericCompany extends Company{

	public String companyUri;

	public GenericCompany () 
	{ 
		
	}
	
	public String getCompanyUri() {
		return companyUri;
	}

	public void setCompanyUri(String companyUri) {
		this.companyUri = companyUri;
	}
	
	
}
