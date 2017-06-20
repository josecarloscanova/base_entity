package org.nanotek.base;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

/**
 * Extends LongBase Class associating a position relative to a "defined origin". 
 * Uses a One-To-One relationship with StringBase class generating a specific identity object
 * to mark a position on a certain sequence arrangement. 
 * 
 * refer -> http://openjpa.apache.org/builds/1.0.2/apache-openjpa-1.0.2/docs/manual/jpa_overview_mapping_inher.html
 * 
 * @author josecanovamauger
 *
 */
@Entity
@SuppressWarnings("serial")
@Inheritance (strategy=InheritanceType.JOINED)
public class StringPositionBase extends LongBase {

	protected Integer position; 
	
	@OneToOne (fetch=FetchType.EAGER,cascade=CascadeType.PERSIST)
	protected StringBase stringBase;
	
	public StringPositionBase (){
		super();
	}

	public StringPositionBase(StringBase stringBase) {
		super();
		this.stringBase = stringBase;
	}
	
	public StringPositionBase(Integer position, StringBase stringBase) {
		super();
		this.position = position;
		this.stringBase = stringBase;
	}


	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public StringBase getStringBase() {
		return stringBase;
	}

	public void setStringBase(StringBase value) {
		stringBase = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((position == null) ? 0 : position.hashCode());
		result = prime * result
				+ ((stringBase == null) ? 0 : stringBase.hashCode());
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
		StringPositionBase other = (StringPositionBase) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (stringBase == null) {
			if (other.stringBase != null)
				return false;
		} else if (!stringBase.equals(other.stringBase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StringPositionBase [position=" + position + ", stringBase="
				+ stringBase + "]";
	}

}
