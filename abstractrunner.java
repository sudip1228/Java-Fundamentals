package abstract_project;

public class abstractrunner {

	public static void main(String[] args) {
		student_contents s= new student_contents();
		s.details();
		student m= new student_contents();
		m.attendance();//polymorphism.attendance method of student_content is called.

	}

}
