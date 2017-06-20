package org.nanotek.base.contacts.phone;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.nanotek.base.StringPositionBase;
/**
 * TODO: refactor this class. 
 * 
 * @author josecanova
 *
 */
@Entity
@SuppressWarnings("serial")
public class PhoneNumberBase extends StringPositionBase{

	@Enumerated (EnumType.ORDINAL)
	protected PhoneNumberType phoneNumberType; 
	
	@Enumerated (EnumType.ORDINAL)
	protected PhoneContactType phoneContactType; 
	
	public PhoneNumberBase()
	{ 
		this.phoneNumberType = PhoneNumberType.Other;
	}
	
	public PhoneNumberBase(PhoneNumberType phoneNumberType) {
		super();
		this.phoneNumberType = phoneNumberType;
	}


	public PhoneNumberType getPhoneNumberType() {
		return phoneNumberType;
	}
	
	public void setPhoneNumberType(PhoneNumberType phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}
	
}
