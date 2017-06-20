package org.nanotek.base.atlas;

import javax.persistence.MappedSuperclass;

import org.nanotek.base.LongBase;

/**
 * Defines a position on a coordinante system (plane, cartesian, elevation, coordinate)
 * abstract in the sense that is designed just to fix the class model.
 * @author josecanova
 *
 */
@MappedSuperclass
@SuppressWarnings("serial")
public class Locality extends LongBase{

}
