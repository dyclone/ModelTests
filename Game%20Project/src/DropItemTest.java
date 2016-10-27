import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import DropItems.DropItem;

public class DropItemTest {
	
	DropItem test1 = new DropItem(1, 2);
	Random rn = new Random();

	@Test
	public void testX() {
		int random = rn.nextInt(999);
		test1.setX(random);
		assertEquals(test1.getX(), random);
	}
	
	@Test
	public void testY() {
		int random = rn.nextInt(999);
		test1.setY(random);
		assertEquals(test1.getY(), random);
	}

}
