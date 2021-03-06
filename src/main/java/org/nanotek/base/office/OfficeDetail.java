package org.nanotek.base.office;

import org.nanotek.Base;


@SuppressWarnings("serial")
public class OfficeDetail implements Base<Number> {

	private Number id; 
	private String name; 
	private String value; 
	private OfficeUrl officeUrl; 
	
	
	public OfficeDetail() {
	}

	@Override
	public Number getId() {
		return id;
	}

	@Override
	public void setId(Number id) {
		this.id = id; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public OfficeUrl getOfficeUrl() {
		return officeUrl;
	}

	public void setOfficeUrl(OfficeUrl officeUrl) {
		this.officeUrl = officeUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((officeUrl == null) ? 0 : officeUrl.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		OfficeDetail other = (OfficeDetail) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (officeUrl == null) {
			if (other.officeUrl != null) {
				return false;
			}
		} else if (!officeUrl.equals(other.officeUrl)) {
			return false;
		}
		if (value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!value.equals(other.value)) {
			return false;
		}
		return true;
	}

}
