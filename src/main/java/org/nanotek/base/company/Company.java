package org.nanotek.base.company;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.nanotek.base.LongBase;

/**
 *
 * The Matter Class of other company related information.
 * 
 * May refer it self of several "Virtual Companies", used to host 
 * Data, Marketing Portfolios, etc.
 *
 * @author josecanovamauger
 *
 */
@Entity 
@Inheritance(strategy=InheritanceType.JOINED)
@SuppressWarnings("serial")
public class Company extends LongBase {

	//TODO:will change on future.
	protected String companyName; 
	
	@OneToMany
	@JoinColumn
	protected Set<VirtualCompany> companyReferences; 
	
	public Company() 
	{ 
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Set<VirtualCompany> getCompanyReferences() {
		return companyReferences;
	}

	public void setCompanyReferences(Set<VirtualCompany> companyReferences) {
		this.companyReferences = companyReferences;
	}


}
