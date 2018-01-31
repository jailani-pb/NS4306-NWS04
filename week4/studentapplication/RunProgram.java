package week4.studentapplication;

public class RunProgram {

	public static void main(String[] args) {
		Module nepModule = 
				new Module("NS4306", "Network Programming", 3);
		Student student1 = new Student("Abu", 20);
		Student student2 = new Student("Bakar", 21);
		Student student3 = new Student("Curi", 22);
		Student student4 = new Student("Daging", 23);
		
		System.out.println("Module: " + nepModule.getCode() 
						+ " " + nepModule.getName());
		addingStudent(nepModule, student1);
		addingStudent(nepModule, student1);
		addingStudent(nepModule, student2);
		addingStudent(nepModule, student3);
		addingStudent(nepModule, student4);
		
		System.out.println("List of students for " 
						+ nepModule.getName());
		for(int i = 0; i < nepModule.getStudents().length; i++) {
			System.out.println(nepModule.getStudents()[i].getId() 
						+ nepModule.getStudents()[i].getName());
		}
	}
	
	public static void addingStudent(Module module, Student student) {
		System.out.println("Adding Student: " + student.getId() 
						+ " " + student.getName());
		System.out.println("Successful? " 
						+ module.addStudent(student));
	}
	
}
