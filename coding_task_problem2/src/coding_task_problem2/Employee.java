package coding_task_problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides common structure about an employee.
 * Employee inherits Person class.
 *
 */
public class Employee extends Person {

    private Employee currentBoss;
    private String employeeId;

    private List<String> currentReports = new ArrayList<>();
    private List<Employee> subordinates = new ArrayList<>();

    public Employee(String name) {
    	super(name);
    }
    
    public Employee(String name, int age) {
    	super(name, age);
    }
    
    public Employee(String name, int age, String adress) {
    	super(name, age, adress);
    }

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String id) {
		this.employeeId = id;
	}
	
	public List<String> getCurrentReports() {
		return currentReports;
	}

	public void setCurrentReports(List<String> reports) {
		this.currentReports = reports;
	}
	
	public String getCurrentBoss() {
		if (currentBoss == null) {
			return "undefined";
		}
		return currentBoss.getFirstName();
	}

	public void setCurrentBoss(Employee boss) {
		this.currentBoss = boss;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void addSubordinate(Employee employee) {
		if (!subordinates.contains(employee)) {
			subordinates.add(employee);
		}
	}
	
	/**
	 * Print employee records as string
	 */
	public String toString() {
		String name = "First name: " + getFirstName() + System.lineSeparator();
		
		String employeeId = "Employee ID: " + getEmployeeId() + System.lineSeparator();
		
		int employeeAge = getAge();
		String ageString;
		if (employeeAge == 0) {
			ageString = "undefined";
		} else {
			ageString = employeeAge + " years old";
		}
		String age = "Age: " + ageString + System.lineSeparator();
		
		String adress = "Address: " + getAdress() + System.lineSeparator();
		
		String boss = "Current Boss: " + getCurrentBoss() + System.lineSeparator();
		
		String subordinates;
		if (getSubordinates() == null) {
			subordinates = "Current Subordinates: " + "undefined" + System.lineSeparator();
		}
		
	    subordinates = "Current Subordinates: " + getSubordinates() + System.lineSeparator();
		
		return name + employeeId + age + adress + boss + subordinates;
	}
}

