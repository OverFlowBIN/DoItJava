package assignment;

public class OperationEx4 {

	public static void main(String[] args) {

		// 복합 대입 연산자 
		int num1 = 10;
		System.out.println(num1 += 5);  // 15
		System.out.println(num1 %= 10);  // 5
		
		// 삼항연산자
		int num2 = (10 > 5) ? 10 : 5;
		System.out.println(num2);  // 10
	}

}
