package coding_task_problem2;

/**
 * Class to provide common structure about a person,
 *
 */
public class Person {

    private String firstName;
    private int age;
    private String adress;

    public Person(String firstName) {
        this.firstName = firstName;
    }
    
    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
    
    public Person(String firstName, int age, String adress) {
        this.firstName = firstName;
        this.age = age;
        this.setAdress(adress);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
