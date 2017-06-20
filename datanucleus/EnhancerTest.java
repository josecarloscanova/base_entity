package test.org.nanotek.datanucleus;

import org.datanucleus.enhancer.DataNucleusEnhancer;
import org.junit.Test;

public class EnhancerTest {

	@Test
	public void test() {
		DataNucleusEnhancer enhancer = new DataNucleusEnhancer("JPA", null);
		enhancer.setVerbose(true);
		enhancer.addPersistenceUnit("MusicBrainzImport");
		enhancer.enhance();
	}
	
}
