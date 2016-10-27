import static org.junit.Assert.*;

import org.junit.Test;

import Characters.BlueCrab;
import Characters.HorseshoeCrab;
import Characters.Oyster;

public class HorseshoeCrabTester {

	@Test
	public void test() {
		Oyster o1 = new Oyster(0, 0, 0, 0, 0, false, false, 0, 0, 0);
		BlueCrab c1 = new BlueCrab(0, 0, 0, 0, 0, false, false, 0, 0, 0, false);
		
		HorseshoeCrab h1 = new HorseshoeCrab(0, 0, 100, 0, 0, false, false, 0, 0, 0);
		h1.blueBlood(o1, c1);
		
		assertEquals(10,o1.getHealth());
		assertEquals(10,c1.getHealth());
		assertEquals(90,h1.getHealth());
		
		Oyster o2 = new Oyster(0, 0, 100, 0, 0, false, false, 0, 0, 0);
		BlueCrab c2 = new BlueCrab(0, 0, 100, 0, 0, false, false, 0, 0, 0, false);
		
		h1.blueBlood(o2, c2);
		assertEquals(100,o2.getHealth());
		assertEquals(100,c2.getHealth());
		assertEquals(80,h1.getHealth());
		
	}

}
