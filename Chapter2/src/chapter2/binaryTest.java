package chapter2;

public class binaryTest {

	public static void main(String[] args) {

		int num = 10;
		int bNum = 0B1010;
		int oNum = 012;
		int hNum = 0XA;
		
		System.out.println(num);  // 10
		System.out.println(bNum); // 10
		System.out.println(oNum); // 10
		System.out.println(hNum); // 10
		
		int num1 = 0B00000000000000000000000000000101;
		int num2 = 0B11111111111111111111111111111011;
		
		int sum = num1 + num2;
		System.out.println(num1);  // 5
		System.out.println(num2);  // -5
		System.out.println(sum);   // 0
		
	}

}
