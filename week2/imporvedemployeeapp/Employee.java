package week2.imporvedemployeeapp;

import java.time.LocalDate;

public class Employee {

	final int MIN_AGE = 18;
	final int MAX_AGE = 60;
	
	private int id;
	String name;
	private int yearOfBirth;
	private static int numberEmployee = 0;
	
	public Employee(String name, int yearOfBirth) {
		this.name = name;
		editYearOfBirth(yearOfBirth);
		numberEmployee++;
		this.id = numberEmployee;
	}
	
	public void editYearOfBirth(int yearOfBirth) {
		// Local Variable
		LocalDate now = LocalDate.now();
		LocalDate minimumYearOfBirth = now.minusYears(MAX_AGE);
		LocalDate maximumYearOfBirth = now.minusYears(MIN_AGE);
		if(yearOfBirth >= minimumYearOfBirth.getYear()
				&& yearOfBirth <= maximumYearOfBirth.getYear()) {
			this.yearOfBirth = yearOfBirth;
		} else {
			this.yearOfBirth = maximumYearOfBirth.getYear();
		}
	}
	
	public int getEmployeeAge() {
		LocalDate now = LocalDate.now();
		LocalDate age = now.minusYears(yearOfBirth);
		return age.getYear();
	}
	
	public int getEmployeeAge(int specificYear) {
		// Complex way
//		LocalDate now = LocalDate.now();
//		LocalDate currentAge = now.minusYears(yearOfBirth);
//		LocalDate difference = now.minusYears(specificYear);
//		return currentAge.getYear()-difference.getYear();
		
		// Simplest way
		return specificYear-yearOfBirth;
	}
	
	public static int getNumberEmployee() {
		return numberEmployee;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
	}
	
}
