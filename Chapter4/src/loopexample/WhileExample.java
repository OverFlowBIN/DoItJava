package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		// while (조건 확인 후 수행문 실행)
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		
		// do while (수행문이 먼저 => 조건 확인)
		int num2 = 1;
		int sum2 = 0;
		
		do {
			sum2 += num2;
			num2++;
		} while(num2 <= 10);
		System.out.println(sum2);
	} 

}
