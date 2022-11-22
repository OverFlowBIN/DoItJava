package assignment;

public class OperationEx3 {

	public static void main(String[] args) {

		// 단락 회로 평가
		// 논리 곱 
		int num1 = 10;
		int i = 2;
		
		boolean val = (num1 = num1 + 10) < 10 && (i = i + 2) < 10;
		System.out.println(val);  // false
		System.out.println(num1);  // 20 => 계산은 실행되었지만 false 반환 
		System.out.println(i);  // 2 => 논리 곱 뒤에 연산이 이루어지지 않음.

		// 논리 합 
		int num2 = 10;
		int i2 = 2;
		
		boolean val2 = (num2 = num2 + 10) > 10 || (i = i + 2) < 10;
		System.out.println(val2);  // true
		System.out.println(num2);  // 20 => 계산은 실행되었지만 true 반환 
		System.out.println(i2);  // 2 => 논리  뒤에 연산이 이루어지지 않음. 
		
		
		// example
		int num3 = 10;
		int num4 = 20;
		boolean result;
		
		result = (num3 > 10) && num2 > 10;
		System.out.println(result);  // false
		result = num3 > 10 || num4 > 10;
		System.out.println(result);  // true
		System.out.println(!result);  // false
		
	}

}
