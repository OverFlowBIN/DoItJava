package loopexample;

public class continueExample {

	public static void main(String[] args) {

		int total = 0;
		
		for(int num = 1; num <= 100; num++) {
			if(num % 2 == 0) continue;
			total += num;
		}
		
		System.out.println("Total : " + total);
	}

}
