package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		
		// 비트 연산자
		int num1 = 5;
		int num2 = 10;
		
		int resultAnd = num1 & num2;
		System.out.println(resultAnd);  // 0
		
		int resultOr = num1 | num2;
		System.out.println(resultOr);  // 15
		
		
		int num3 = 5;
		System.out.println(num3 << 1);  // 10 (5*2와 같음) 
		System.out.println(num3);  // 5 (num3의 변화는 없음)
		System.out.println(num3 <<= 2);  // 20 (5*4와 같음)
		System.out.println(num3);  // 20 (등호가 추가되면 값이 변화함)
	
		System.out.println(num3 >>= 1);  // 10 (20/2)
		System.out.println(num3);  // 10 (등호가 추가되면 값이 변화함)
			
		
		int n1 = 2;
		int n2 = 10;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		System.out.println(~n1);

	}

}
