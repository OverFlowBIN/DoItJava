package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// 묵시적 형변환 : 작은수 => 큰수 형변환
		byte bNum = 10;
		int num = bNum;
		System.out.println(num);  // 10
		
		long lNum = 10;
		float fNum = lNum;
		System.out.println(fNum); // 10.0
		
		double dNum = fNum + num;
		System.out.println(dNum); // 20.0

	}

}
