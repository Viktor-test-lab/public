package coding_task_problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * Entry point to the program.
 *
 */
public class Entry {

    public static void main(String[] args) {
    	List<Employee> employees = new ArrayList<>();
    	employees.add(new Employee("John"));
    	employees.add(new Employee("Mary"));
    	employees.add(new Employee("Peter"));
    	employees.add(new Employee("Michael"));
    	employees.add(new Employee("Sam"));
    	employees.add(new Employee("Will"));
    	employees.add(new Employee("Jackie"));
    	employees.add(new Employee("Frank"));
    	
		new EmployeeHandler(employees).run();
    }
}
