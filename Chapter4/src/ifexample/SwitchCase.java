package ifexample;

public class SwitchCase {

	public static void main(String[] args) {

		// switch case (int)
		int rank = 3;
		char medalColor;
		
		switch(rank) {
			case 1 : medalColor = 'G';
				break;
			case 2 : medalColor = 'S';
				break;
			case 3 : medalColor = 'B';
				break;
			default : medalColor = 'A';
		}
		// break를 안쓰게 되면 break를 만날때 까지나 default까지 간다. 
		
		System.out.println(rank +"등 매달의 색깔은 " + medalColor + "입니다.");
		
		
		// switch case (String)
		String medal = "Silver";
		
		switch(medal) {
		case "Gold" : 
			System.out.println("금메달입니다.");
			break;
		case "Silver" : 
			System.out.println("은메달입니다.");
			break;
		case "Bronze" : 
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("매달이 없습니다.");
		}
		
		
	}

}
