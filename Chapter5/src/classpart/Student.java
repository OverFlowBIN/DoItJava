package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	// default 생성자
	public Student() {}
	
	// parameter가 있는 생성자 => 생성자가 두개 있을수 있다 => overloading
	public Student(String name, int ID) {
		studentName = name;
		studentID = ID;
	}
	
	
	// method
	public void showStudentInfor() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	
}
