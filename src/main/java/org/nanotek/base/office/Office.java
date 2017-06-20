package org.nanotek.base.office;
/**
 * 
 * @author josecanovamauger
 */

import javax.persistence.Entity;

import org.nanotek.base.company.Company;

@Entity
@SuppressWarnings("serial")
public class Office extends Company {

	private String name; 
	private Integer discriminator = 0; 
	
	public Office() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(Integer discriminator) {
		this.discriminator = discriminator;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((discriminator == null) ? 0 : discriminator.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Office other = (Office) obj;
		if (discriminator == null) {
			if (other.discriminator != null) {
				return false;
			}
		} else if (!discriminator.equals(other.discriminator)) {
			return false;
		}
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
		return true;
	}

	@Override
	public String toString() {
		return "Office [id=" + id + ", name=" + name + ", discriminator="
				+ discriminator + "]";
	}

}
