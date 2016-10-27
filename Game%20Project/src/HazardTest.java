import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import Barrier.Barrier;
import Barrier.Gavion;
import Environment.Water;
import Hazards.Hazards;
import Hazards.Runoff;
import Hazards.WaterWaste;
import Hazards.Waves;

public class HazardTest {
	// (int Speed, int damage, int xWLoc, int yWLoc)
	Hazards hazardTest1 = new Hazards(5, 2, 5, 5);
	Random rn = new Random();
	Runoff runoffTest = new Runoff(1, 2, 3, 4);
	Water waterTest = new Water(3, 3, 3);
	WaterWaste waterWasteTest = new WaterWaste(2, 3, 4, 5);
	Waves waveTest = new Waves(3,4,5,6);
	Barrier gavionTest = new Gavion(1, 1, 1, 1);

	@Test
	public void testXLocation() {
		int randomTestInt = rn.nextInt(999);
		hazardTest1.setXWLoc(randomTestInt);
		// X location
		assertEquals(hazardTest1.getXWLoc(), randomTestInt);
		System.out.println(randomTestInt);
	}

	@Test
	public void testYLocation() {
		int randomTestInt = rn.nextInt(999);
		hazardTest1.setYWLoc(randomTestInt);
		// Y location
		assertEquals(hazardTest1.getYWLoc(), randomTestInt);
		System.out.println(randomTestInt);
	}
	
	@Test
	public void testDamage() {
		int randomTestInt = rn.nextInt(999);
		hazardTest1.setDamage(randomTestInt);
		// Damage
		assertEquals(hazardTest1.getDamage(), randomTestInt);
		System.out.println(randomTestInt);
	}
	
	@Test
	public void testSpeed() {
		int randomTestInt = rn.nextInt(999);
		hazardTest1.setSpeed(randomTestInt);
		// Speed
		assertEquals(hazardTest1.getSpd(), randomTestInt);
		System.out.println(randomTestInt);
	}
	
	@Test
	public void runoffFlow() {
		int randomTestInt = rn.nextInt(999);
		int randomTestInt1 = rn.nextInt(999);
		runoffTest.setXWLoc(randomTestInt);
		runoffTest.setSpeed(randomTestInt1);
		// Flow Test
		int flowTest = randomTestInt + randomTestInt1;
		runoffTest.flow();
		assertEquals(runoffTest.getXWLoc(), flowTest);
		System.out.println(randomTestInt + " " + randomTestInt1 + " " + flowTest);
	}
	
	@Test
	public void contaiminateTest(){
		assertEquals(runoffTest.contamine(waterTest), true);
		System.out.println(runoffTest.contamine(waterTest));
		runoffTest.setXWLoc(5);
		assertEquals(runoffTest.contamine(waterTest), false);
		System.out.println(runoffTest.contamine(waterTest));
	}
	
	@Test
	public void bottomTest(){
		assertEquals(waterWasteTest.Bottom(5),true);
		System.out.println(waterWasteTest.Bottom(5));
		assertEquals(waterWasteTest.Bottom(2),false);
		System.out.println(waterWasteTest.Bottom(2));
	}
	
	@Test
	public void fallTest(){
		waterWasteTest.fall();
		assertEquals(waterWasteTest.getYWLoc(), 7);
	}
	
	@Test
	public void damageBarrierTest(){
		assertEquals(waveTest.hitBarrier(gavionTest), false);
		waveTest.setXWLoc(1);
		assertEquals(waveTest.hitBarrier(gavionTest), true);
	}

}
