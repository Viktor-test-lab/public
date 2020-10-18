package coding_task_problem2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Class to handle employees.
 *
 */
public class EmployeeHandler {
	private List<Employee> employees;
    private Scanner input = new Scanner(System.in); 
	
	public EmployeeHandler(List<Employee> employees) {
		this.employees = employees;
	}

	public void printEmployee(Employee employee) {
        System.out.println(employee.toString());
	}
	
	public Employee findEmployee(String name) {
	    for (Employee employee : employees) {
	        if (employee.getFirstName().equals(name)) {
	        	return employee;
	        }
	    }
	    
	    System.out.println("Employee not found");
	    
	    return null;
	}
	
	/**
	 * Main thread looping and asking user for input
	 */
	public void run() {
		while(true) {
			System.out.print("Insert employee name: ");
			String name = input.nextLine();
			System.out.print(System.lineSeparator());

			if (!name.isEmpty()) {
				Employee employee = findEmployee(name);
				if (employee != null) {
			       	System.out.println("1: Print employee data");
		        	System.out.println("2: Update employee record");
			    	int choice = input.nextInt();
					System.out.print(System.lineSeparator());
			    	
			    	switch (choice) {
			    	case 1:
			        	printEmployee(employee);
			        	break;
			    	case 2:
			        	System.out.println("1: Employee ID");
			        	System.out.println("2: Age");
			        	System.out.println("3: Adress");
			        	System.out.println("4: Current Boss");
			        	System.out.println("5: Add subordinate");
		    	    	int updateRecordChoice = input.nextInt();
		    	    	
		    	    	switch (updateRecordChoice) {
		    	    		case 1:
			    	           	System.out.print("Employee ID: ");
			    	    		employee.setEmployeeId(input.next());
		    	    			break;
			    	    	case 2:
			    	           	System.out.print("Age: ");
				    	    	int newAge;
				    	    	
				    	    	try {
				    	    		newAge = input.nextInt();
				    	    		employee.setAge(newAge);
				    	    	} catch (InputMismatchException ex) {
				    	           	System.out.println("Failed: Enter age as number");
				    	    	}
				    	    	
				    	    	break;
			    	    	case 3:
			    	        	System.out.print("Adress: ");
				    	    	String newAdress = input.next();
				    	    	employee.setAdress(newAdress);
				    	    	break;
			    	    	case 4:
			    	    	   	System.out.print("Current Boss: ");
				    	    	String newBoss = input.next();
				    	    	
				    	    	Employee boss = findEmployee(newBoss);
				    	    	if (boss != null) {
				    	    		employee.setCurrentBoss(boss);
				    	    	}
				    	    	break;
			    	    	case 5:
			    	    		System.out.print("Add subordinate: ");
				    	    	String newSubordinate = input.next();
				    	    	
				    	    	Employee subordinate = findEmployee(newSubordinate);
				    	    	if (subordinate != null) {
				    	    		employee.addSubordinate(subordinate);
				    	    	}
				    	    	break;
			    	 		default:
					        	System.out.println("No such option");
				    			break;
			    	    		
		    	    	}
		    	    	break;
	    	 		default:
			        	System.out.println("No such option");
		    			break;
			    	}
		    	    	System.out.print(System.lineSeparator());
				}
			}
		}	
	}
}
