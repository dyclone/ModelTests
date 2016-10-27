import static org.junit.Assert.*;

import org.junit.Test;

import Barrier.Barrier;

public class barrierTester {
	Barrier b1=new Barrier(5,50,50,10);
	Barrier b2=new Barrier(5,6,7,8);
	Barrier b3=new Barrier(1,2,3,4);
	@Test
	public void testGS1() {
		//geters
		assertEquals(5,b1.getDur());
		assertEquals(50,b1.getX());
		assertEquals(50,b1.getY());
		assertEquals(10,b1.getCost());
		
		assertEquals(5,b2.getDur());
		assertEquals(6,b2.getX());
		assertEquals(7,b2.getY());
		assertEquals(8,b2.getCost());
		
		assertEquals(1,b3.getDur());
		assertEquals(2,b3.getX());
		assertEquals(3,b3.getY());
		assertEquals(4,b3.getCost());
		
		//Seters
		b1.setDur(1);
		assertEquals(1,b1.getDur());
		b1.setCost(1);
		assertEquals(1,b1.getCost());
		b1.setX(1);
		assertEquals(1,b1.getX());
		b1.setY(1);
		assertEquals(1,b1.getY());
		
		
		b2.setDur(2);
		assertEquals(2,b2.getDur());
		b2.setCost(2);
		assertEquals(2,b2.getCost());
		b2.setX(2);
		assertEquals(2,b2.getX());
		b2.setY(2);
		assertEquals(2,b2.getY());
		
		
		b3.setDur(3);
		assertEquals(3,b3.getDur());
		b3.setCost(3);
		assertEquals(3,b3.getCost());
		b3.setX(3);
		assertEquals(3,b3.getX());
		b3.setY(3);
		assertEquals(3,b3.getY());
	}

}
