package coding_task_problem1;

import java.util.*;

/**
 * Class that defines a house robbery calculation.
 *
 */
public class HouseRobbery {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		
		System.out.println(rob(vector));
	}

	/**
	 * Calculate maximum amount of money that can be robbed
	 * 
	 * @param given a list of houses to rob
	 * @return maximum sum of money returned
	 */
	public static int rob(Vector<Integer> houses) {
		
		// Exit if there are no houses to rob
	    if (houses == null || houses.size() == 0) {
	        return 0;
	    }
	    
	    // Exit if negative value exists in vector
	    Iterator<Integer> it = houses.iterator();
	    while (it.hasNext()) {
	       if (it.next() < 0) {
	   			return 0;
	       }
	    }
	 
	    // If there is only one house, return the amount of money of that house
	    if (houses.size() == 1) {
	        return houses.get(0);
	    }
	 
	    // Create a temporary array to store compared values in
	    int[] tempArray = new int[houses.size()];
	    tempArray[0] = houses.get(0);
	    tempArray[1] = Math.max(houses.get(0), houses.get(1));
	    
	    // For each house, fill the temp array with maximum value 
	    // of two non-adjacent houses or the middle house
	    for(int i = 2; i < houses.size(); i++) {
	        tempArray[i] = Math.max(tempArray[i-2] + houses.get(i), tempArray[i-1]);
	    }
	 
	    // Return last element on the temp array
	    return tempArray[houses.size() - 1];
	}
}
