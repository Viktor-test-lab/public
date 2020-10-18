package coding_task_problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

class HouseRobberyTest {

	@Test
	void testRobbery() {		
		Vector<Integer> testVector1 = new Vector<>();
		testVector1.add(1);
		testVector1.add(2);
		testVector1.add(3);
		testVector1.add(1);
		
		Vector<Integer> testVector2 = new Vector<>();
		testVector2.add(2);
		testVector2.add(7);
		testVector2.add(9);
		testVector2.add(3);
		testVector2.add(1);
		
		Vector<Integer> testVector3 = new Vector<>();
		testVector3.add(1);
		testVector3.add(-2);
		testVector3.add(3);
		
		int robbery1 = HouseRobbery.rob(testVector1);
		int robbery2 = HouseRobbery.rob(testVector2);
		int robbery3 = HouseRobbery.rob(testVector3);
		
		assertEquals(4, robbery1);
		assertEquals(12, robbery2);
		assertEquals(0, robbery3);
	}

}
