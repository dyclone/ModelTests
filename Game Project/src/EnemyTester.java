import static org.junit.Assert.*;

import org.junit.Test;

import Characters.Enemy;
import DropItems.DropItem;
import DropItems.OysterG;

public class EnemyTester {

	@Test
	public void test() {
		Enemy e1 = new Enemy(0, 0, 0, 0, 0, false, false, 0, 0, 0, 0);
		Enemy e2 = new Enemy(0, 0, 0, 0, 0, false, false, 0, 0, 0, 0);
		Enemy e3 = new Enemy(0, 0, 0, 0, 0, false, false, 0, 0, 0, 0);
		
		e1.setDValue(1);
		e2.setDValue(2);
		e3.setDValue(3);
		
		assertEquals(1,e1.getDValue());
		assertEquals(2,e2.getDValue());
		assertEquals(3,e3.getDValue());
		
		OysterG g1 = new OysterG(0, 0);
		DropItem d1 = e1.drop();
		assertEquals(g1.getX(),d1.getX());
		assertEquals(g1.getY(),d1.getY());
	}

}
