package Characters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlueCrabTester {
	BlueCrab test = new BlueCrab(0, 0, 0, 0, 0, false, false, 0, 0, 0, true);
	BlueCrab test2 = new BlueCrab(10, 10, 10, 10, 10, true, true, 10, 10, 10, true);
	BlueCrab test3 = new BlueCrab(100, 100, 100, 100, 100, true, false, 100, 100, 100, false);

	
@Test 
public void getXTest1(){
	int shouldbe = 0;
	assertEquals(shouldbe, test.getX());
	
}
@Test 
public void getXTest2(){
	int shouldbe = 10;
	assertEquals(shouldbe, test2.getX());
	
}
/*Incorrect test
@Test 
public void getXTest3(){
	int shouldbe = 0;
	assertEquals(shouldbe, test3.getX());
	
}
*/

@Test 
public void getYTest1(){
	int shouldbe = 0;
	assertEquals(shouldbe, test.getY());
	
}
@Test 
public void getYTest2(){
	int shouldbe = 10;
	assertEquals(shouldbe, test2.getY());
	
}
/*Incorrect test
@Test 
public void getYTest3(){
	int shouldbe = 0;
	assertEquals(shouldbe, test3.getY());
	
}
*/
@Test 
public void getHealthTest1(){
	int shouldbe = 0;
	assertEquals(shouldbe, test.getHealth());
	
}
@Test 
public void getHealthTest2(){
	int shouldbe = 10;
	assertEquals(shouldbe, test2.getHealth());
	
}
/*Incorrect test
@Test 
public void getHealthTest3(){
	int shouldbe = 0;
	assertEquals(shouldbe, test3.getHealth());
	
}
*/
@Test 
public void getLSpdTest1(){
	int shouldbe = 0;
	assertEquals(shouldbe, test.getLSpd());
	
}
@Test 
public void getLSpdTest2(){
	int shouldbe = 10;
	assertEquals(shouldbe, test2.getLSpd());
	
}
/*Incorrect test
@Test 
public void getLSpdTest3(){
	int shouldbe = 0;
	assertEquals(shouldbe, test3.getLSpd());
	
}
*/

@Test 
public void getWSpdTest1(){
	int shouldbe = 0;
	assertEquals(shouldbe, test.getWSpd());
	
}
@Test 
public void getWSpdTest2(){
	int shouldbe = 10;
	assertEquals(shouldbe, test2.getWSpd());
	
}
/*Incorrect test
@Test 
public void getWSpdTest3(){
	int shouldbe = 0;
	assertEquals(shouldbe, test3.getWSpd());
	
}
*/

@Test 
public void getXDirTest1(){
	boolean shouldbe = false;
	assertEquals(shouldbe, test.getXDir());
	
}
@Test 
public void getXDirTest2(){
	boolean shouldbe = true;
	assertEquals(shouldbe, test2.getXDir());
	
}
/*Incorrect test
@Test 
public void getXDirTest3(){
	boolean shouldbe = false;
	assertEquals(shouldbe, test3.getXDir());
	
}
*/

@Test 
public void getYDirTest1(){
	boolean shouldbe = false;
	assertEquals(shouldbe, test.getYDir());
	
}
@Test 
public void getYDirTest2(){
	boolean shouldbe = true;
	assertEquals(shouldbe, test2.getYDir());
	
}
/*Incorrect test
@Test 
public void getYDirTest3(){
	boolean shouldbe = false;
	assertEquals(shouldbe, test3.getYDir());
	
}
*/

@Test 
public void getOysterColTest1(){
	int shouldbe = 0;
	assertEquals(shouldbe, test.getOysterCol());
	
}

@Test 
public void getOysterColTest2(){
	int shouldbe = 10;
	assertEquals(shouldbe, test2.getOysterCol());
	
}
/*
@Test 
public void getOysterColTest3(){
	int shouldbe = 0;
	assertEquals(shouldbe, test3.getOysterCol());
	
}
*/

@Test 
public void getConcreteColTest1(){
	int shouldbe = 0;
	assertEquals(shouldbe, test.getConcreteCol());
	
}
@Test 
public void getConcreteColTest2(){
	int shouldbe = 10;
	assertEquals(shouldbe, test2.getConcreteCol());
	
}
/* Incorrect test
@Test 
public void getConcreteColTest3(){
	int shouldbe = 0;
	assertEquals(shouldbe, test3.getConcreteCol());
	
}
*/

@Test 
public void getCompostColTest1(){
	int shouldbe = 0;
	assertEquals(shouldbe, test.getCompostCol());
	
}
@Test
public void getCompostColTest2(){
	int shouldbe = 10;
	assertEquals(shouldbe, test2.getCompostCol());
	
}
/* Incorrect test
public void getCompostColTest3(){
	int shouldbe = 0;
	assertEquals(shouldbe, test3.getCompostCol());
	
}
*/
@Test
public void getInvincibleTest1(){
	boolean shouldbe = true;
	assertEquals(shouldbe, test.getInvincible());
}
@Test
public void getInvincibleTest2(){
	boolean shouldbe = true;
	assertEquals(shouldbe, test2.getInvincible());
}
@Test
public void getInvincibleTest3(){
	boolean shouldbe = false;
	assertEquals(shouldbe, test3.getInvincible());
}



@Test
public void setXTest1(){
	test.setX(5);
	int shouldbe = 5;
	assertEquals(shouldbe, test.getX());
}

@Test
public void setXTest2(){
	test2.setX(2);
	int shouldbe = 2;
	assertEquals(shouldbe, test2.getX());
}

/* incorrect test
@Test
public void setXTest3(){
	test3.setX(-1);
	int shouldbe = 26;
	assertEquals(shouldbe, test3.getX());
}
*/

@Test
public void setYTest1(){
	test.setY(15);
	int shouldbe = 15;
	assertEquals(shouldbe, test.getY());
}

@Test
public void setYTest2(){
	test2.setY(150);
	int shouldbe = 150;
	assertEquals(shouldbe, test2.getY());
}

/* incorrect test
@Test
public void setYTest3(){
	test3.setY(28);
	int shouldbe = 3;
	assertEquals(shouldbe, test3.getY());
}
*/

@Test
public void setHealth1(){
	test.setX(5);
	int shouldbe = 5;
	assertEquals(shouldbe, test.getX());
}

@Test
public void setHealth2(){
	test2.setX(2);
	int shouldbe = 2;
	assertEquals(shouldbe, test2.getX());
}

/* incorrect test
@Test
public void setHealth3(){
	test3.setX(-1);
	int shouldbe = 26;
	assertEquals(shouldbe, test3.getX());
}
*/

@Test
public void setLSpdTest1(){
	test.setLSpd(10);
	int shouldbe = 10;
	assertEquals(shouldbe, test.getLSpd());
}
@Test
public void setLSpdTest2(){
	test2.setLSpd(0);
	int shouldbe = 0;
	assertEquals(shouldbe, test2.getLSpd());
}
/* Incorrect test
@Test
public void setLSpdTest3(){
	test3.setLSpd(5);
	int shouldbe = 10;
	assertEquals(shouldbe, test3.getLSpd());
}
*/

@Test
public void setWSpdTest1(){
	test.setWSpd(12);
	int shouldbe = 12;
	assertEquals(shouldbe, test.getWSpd());
}
@Test
public void setWSpdTest2(){
	test2.setWSpd(6);
	int shouldbe = 6;
	assertEquals(shouldbe, test2.getWSpd());
}
/*
@Test
public void setWSpdTest3(){
	test3.setWSpd(4);
	int shouldbe = 6;
	assertEquals(shouldbe, test3.getWSpd());
}
*/
@Test
public void setXDirTest1(){
	test.setXDir(true);
	boolean shouldbe = true;
	assertEquals(shouldbe, test.getXDir());
}
@Test
public void setXDirTest2(){
	test2.setXDir(false);
	boolean shouldbe = false;
	assertEquals(shouldbe, test2.getXDir());
}

/*Incorrect test
@Test
public void setXDirTest3(){
	test3.setXDir(true);
	boolean shouldbe = false;
	assertEquals(shouldbe, test3.getXDir());
}
*/

@Test
public void setOysterColTest1(){
	test.setOysterCol(3);
	int shouldbe = 3;
	assertEquals(shouldbe, test.getOysterCol());
}
@Test
public void setOysterColTest2(){
	test2.setOysterCol(12);
	int shouldbe = 12;
	assertEquals(shouldbe, test2.getOysterCol());
}
/*Incorrect test
@Test
public void setOysterColTest3(){
	test3.setOysterCol(6);
	int shouldbe = 3;
	assertEquals(shouldbe, test3.getOysterCol());
}
*/

@Test
public void setConcreteColTest1(){
	test.setConcreteCol(1);
	int shouldbe = 1;
	assertEquals(shouldbe, test.getConcreteCol());
}
@Test
public void setConcreteColTest2(){
	test2.setConcreteCol(0);
	int shouldbe = 0;
	assertEquals(shouldbe, test2.getConcreteCol());
}
/* Incorrect test
@Test
public void setConcreteColTest3(){
	test3.setConcreteCol(12);
	int shouldbe = 1;
	assertEquals(shouldbe, test3.getConcreteCol());
}
*/

@Test
public void setCompostColTest1(){
	test.setCompostCol(16);
	int shouldbe = 16;
	assertEquals(shouldbe, test.getCompostCol());
}
@Test
public void setCompostColTest2(){
	test2.setCompostCol(4);
	int shouldbe = 4;
	assertEquals(shouldbe, test2.getCompostCol());
}
/*
@Test
public void setCompostColTest3(){
	test3.setCompostCol(16);
	int shouldbe = 1;
	assertEquals(shouldbe, test3.getCompostCol());
}
*/
@Test
public void setInvincibleTest1(){
	test.setInvincible(true);
	boolean shouldbe = true;
	assertEquals(shouldbe,test.getInvincible());
}
@Test
public void setInvincibleTest2(){
	test.setInvincible(false);
	boolean shouldbe = false;
	assertEquals(shouldbe,test.getInvincible());
}
@Test
public void setInvincibleTest3(){
	test2.setInvincible(true);
	boolean shouldbe = true;
	assertEquals(shouldbe,test2.getInvincible());
}
@Test
public void setInvincibleTest4(){
	test2.setInvincible(false);
	boolean shouldbe = false;
	assertEquals(shouldbe,test2.getInvincible());
}
@Test
public void foamTest1(){
	test.foam();
	boolean shouldbe = true;
	assertEquals(shouldbe, test.getInvincible());
}
@Test
public void foamTest2(){
	test2.foam();
	boolean shouldbe = true;
	assertEquals(shouldbe, test2.getInvincible());
}
@Test
public void foamTest3(){
	test3.foam();
	boolean shouldbe = true;
	assertEquals(shouldbe, test3.getInvincible());
}
public void collectTest1(){
	//OysterG item = new OysterG
	
}
}
