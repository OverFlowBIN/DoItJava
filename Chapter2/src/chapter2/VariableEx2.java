package chapter2;

public class VariableEx2 {

	public static void main(String[] args) {

		int num = 10;  // 10이라는 값이(리터럴) 어딘가에 저장되있다. 저장할떄는 기본적으로 4바이트로 저장되어있다
		long num2 = 12345678900L; // 리터럴값이 4바이트에 저장이 안되는 값이면 8바이트로 저장해야한다 => 뒤에 L(long)을 붙인다.
		System.out.println(num + num2);
		
	}

}
