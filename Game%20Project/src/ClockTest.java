import static org.junit.Assert.*;

import org.junit.Test;

public class ClockTest {
	
	Clock test = new Clock();

	@Test
	public void testTime() {
		test.setTime(10);
		assertEquals(test.getTime(), 10);
	}

}
