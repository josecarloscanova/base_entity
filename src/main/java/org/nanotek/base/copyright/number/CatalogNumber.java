package org.nanotek.base.copyright.number;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import org.nanotek.base.StringBase;
import org.nanotek.base.company.Company;

/**
 * refer -> http://www.iasa-web.org/cataloguing-rules/80-introduction
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class CatalogNumber extends StringBase{
	
	//Who manages the number
	@OneToOne
	private Company holderCompany;
	
	@Enumerated 
	protected CatalogNumberType numberType = CatalogNumberType.Other;

	public Company getHolderCompany() {
		return holderCompany;
	}

	public void setHolderCompany(Company holderCompany) {
		this.holderCompany = holderCompany;
	}

	public CatalogNumberType getNumberType() {
		return numberType;
	}

	public void setNumberType(CatalogNumberType numberType) {
		this.numberType = numberType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((holderCompany == null) ? 0 : holderCompany.hashCode());
		result = prime * result
				+ ((numberType == null) ? 0 : numberType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatalogNumber other = (CatalogNumber) obj;
		if (holderCompany == null) {
			if (other.holderCompany != null)
				return false;
		} else if (!holderCompany.equals(other.holderCompany))
			return false;
		if (numberType != other.numberType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CatalogNumber [holderCompany=" + holderCompany
				+ ", numberType=" + numberType + "]";
	}
	

	
}
