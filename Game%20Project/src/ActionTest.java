import static org.junit.Assert.*;

import org.junit.Test;

import Action.Action;
import Characters.Critter;

public class ActionTest {

	//int xPos, int yPos, int health, int landSpd, int waterSpd, boolean xDir, boolean yDir, int oysterCol, int concreteCol, int compostCol
	Critter test1 = new Critter(10, 10, 0, 0, 0, false, false, 0, 0, 0);
	
	@Test
	public void testMoveRight() {
		Action.moveRight(test1);
		assertEquals(test1.getX(), 13);
	}
	
	@Test
	public void testMoveLeft() {
		Action.moveLeft(test1);
		assertEquals(test1.getX(), 7);
	}
	
	@Test
	public void testSwimUp() {
		Action.swimUp(test1);
		assertEquals(test1.getY(), 13);
	}
	
	@Test
	public void testSwimDown() {
		Action.swimDown(test1);
		assertEquals(test1.getY(), 7);
	}

}
