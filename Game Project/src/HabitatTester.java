import static org.junit.Assert.*;

import org.junit.Test;

import Environment.Habitat;
import Hazards.WaterWaste;

public class HabitatTester {
	Habitat h1=new Habitat(1,1,1,1,1);
	Habitat h2=new Habitat(2,2,2,2,2);
	Habitat h3=new Habitat(3,3,3,3,3);
	@Test
	public void test() {
		//geters
		assertEquals(1,h1.getWidth());
		assertEquals(1,h1.getHeight());
		assertEquals(1,h1.getHealth());
		assertEquals(1,h1.getTrashCounter());
		assertEquals(1,h1.getRecycleCounter());
		
		assertEquals(2,h2.getWidth());
		assertEquals(2,h2.getHeight());
		assertEquals(2,h2.getHealth());
		assertEquals(2,h2.getTrashCounter());
		assertEquals(2,h2.getRecycleCounter());
		
		assertEquals(3,h3.getWidth());
		assertEquals(3,h3.getHeight());
		assertEquals(3,h3.getHealth());
		assertEquals(3,h3.getTrashCounter());
		assertEquals(3,h3.getRecycleCounter());
		
		//seters
		h1.setHealth(11);
		h1.setRecycleCounter(11);
		h1.setTrashCounter(11);
		assertEquals(11,h1.getRecycleCounter());
		assertEquals(11,h1.getTrashCounter());
		assertEquals(11,h1.getHealth());
		
		h2.setHealth(22);
		h2.setRecycleCounter(22);
		h2.setTrashCounter(22);
		assertEquals(22,h2.getRecycleCounter());
		assertEquals(22,h2.getTrashCounter());
		assertEquals(22,h2.getHealth());
		
		h3.setHealth(33);
		h3.setRecycleCounter(33);
		h3.setTrashCounter(33);
		assertEquals(33,h3.getRecycleCounter());
		assertEquals(33,h3.getTrashCounter());
		assertEquals(33,h3.getHealth());
		
		//WasteHitter
		WaterWaste w = new WaterWaste(1,1,1,1);
		h1.WasteHitter(w);
		assertEquals(10,h1.getHealth());
		
		WaterWaste w2 = new WaterWaste(2,2,2,2);
		h2.WasteHitter(w2);
		assertEquals(20,h2.getHealth());
		
		WaterWaste w3 = new WaterWaste(3,3,3,3);
		h3.WasteHitter(w3);
		assertEquals(30,h3.getHealth());
	}

}
