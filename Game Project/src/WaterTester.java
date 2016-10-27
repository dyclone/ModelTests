import static org.junit.Assert.*;

import org.junit.Test;

import Environment.Water;

public class WaterTester {

	@Test
	public void test() {
		Water w1 = new Water(0, 0, 0);
		Water w2 = new Water(1, 1, 1);
		Water w3 = new Water(2, 2, 2);
		
		//geters
		assertEquals(0,w1.getx());
		assertEquals(0,w1.gety());
		assertEquals(0,w1.getContaminateLvl());
		
		assertEquals(1,w2.getx());
		assertEquals(1,w2.gety());
		assertEquals(1,w2.getContaminateLvl());
		
		assertEquals(2,w3.getx());
		assertEquals(2,w3.gety());
		assertEquals(2,w3.getContaminateLvl());
		
		//seters
		w1.setx(1);
		w1.sety(1);
		w1.setCLvl(1);
		assertEquals(1,w1.getx());
		assertEquals(1,w1.gety());
		assertEquals(1,w1.getContaminateLvl());
		
		w2.setx(2);
		w2.sety(2);
		w2.setCLvl(2);
		assertEquals(2,w2.getx());
		assertEquals(2,w2.gety());
		assertEquals(2,w2.getContaminateLvl());
		
		w3.setx(3);
		w3.sety(3);
		w3.setCLvl(3);
		assertEquals(3,w3.getx());
		assertEquals(3,w3.gety());
		assertEquals(3,w3.getContaminateLvl());
		
		//CThreshHold
		w1.setCLvl(5);
		assertEquals(true,w1.CThreshHold());
		assertEquals(false,w2.CThreshHold());
	}

}
