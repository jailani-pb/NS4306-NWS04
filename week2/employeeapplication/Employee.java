package week2.employeeapplication;

public class Employee {

	// Instance Variable
	int id;
	String name;
	private int age;
	// Class Variable
	private static int numberEmployee = 0;
	
	// Contructor
	// Variable inside the parenthesis (bracket)
	// is parameter variable (in this case; name and age)
	public Employee(String name, int age) {
		this.name = name;
		this.editAge(age);
		numberEmployee++;
		this.id = numberEmployee;
	}

	// Method that return nothing (void)
	// Variable inside the parenthesis (bracket)
	// is parameter variable (in this case; age)
	public void editAge(int age) {
		if(age >= 18 && age <= 60) {
			this.age = age;
		} else {
			this.age = 18;
		}
	}
	
	public int getNumberEmployees() {
		return numberEmployee;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
