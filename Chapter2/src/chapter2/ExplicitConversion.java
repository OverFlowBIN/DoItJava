package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 명시적 형변환
		int iNum = 1000;
		byte bNum = (byte) iNum;
		
		System.out.println(iNum);  // 1000
		System.out.println(bNum);  // -24
		
		double dNum = 3.14;
		iNum = (int) dNum;
		System.out.println(iNum);  // 3
		
		float fNum = 0.9F;
		int num1 = (int) dNum + (int) fNum;
		int num2 = (int) (dNum + fNum);
		System.out.println(num1);  // 3
		System.out.println(num2);  // 4 값이 다르다
	}

}
