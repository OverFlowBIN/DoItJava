package classpart;

public class StudentTest {

	// main function
	// 다른 class(StudentTest)에서 사용하는 경우가 보통이다.
	public static void main(String[] args) {
		
		// Student 객체 타입(참조형 데이터 타입), studentLee(참조변수)
		// parameter가 있는 생성자에 의해 인스턴스 생
		Student studentLee = new Student("김영빈", 100);
//		studentLee.studentName = "김영빈";
//		studentLee.studentID = 100;
		studentLee.address = "경기도 안양시 비산동";
		
		// default 생성자에 의한 인스턴스 생성 
		Student studentKim = new Student();
		studentKim.studentName = "overflowBIN";
		studentKim.studentID = 101;
		studentKim.address = "서울시 용산구 이촌동";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);  // classpart.Student@1c53fd30 => 주소값 확인 가
		System.out.println(studentKim);  // classpart.Student@50cbc42f
		
	}

}