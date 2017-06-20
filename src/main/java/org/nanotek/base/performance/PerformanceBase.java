package org.nanotek.base.performance;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.nanotek.base.LongBase;
import org.nanotek.base.artist.group.Group;

/**
 * TODO: Compare with Collection.
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
public class PerformanceBase extends LongBase{

	@OneToMany
	protected Set<Group> groups; 
	
	@Column(length=2500)
	protected String performanceCharacteristics;

	public String getPerformanceCharacteristics() {
		return performanceCharacteristics;
	}

	public void setPerformanceCharacteristics(String performanceCharacteristics) {
		this.performanceCharacteristics = performanceCharacteristics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((performanceCharacteristics == null) ? 0
						: performanceCharacteristics.hashCode());
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
		PerformanceBase other = (PerformanceBase) obj;
		if (performanceCharacteristics == null) {
			if (other.performanceCharacteristics != null)
				return false;
		} else if (!performanceCharacteristics
				.equals(other.performanceCharacteristics))
			return false;
		return true;
	}
	
	
}
