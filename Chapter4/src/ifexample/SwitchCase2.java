package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		int month = 10;
		int day;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11: 
			day = 30;
			break;
		default:
			day = 0;
			break;
		}
		System.out.println(month + "월은" + day + "일 까지 있습니다.");
		
		
		int floor = 4;
		String shop = null;
		
		switch(floor) {
		case 1: shop = "약국";
			break;
		case 2: shop = "정형외과";
			break;
		case 3: shop = "피부과";
			break;
		case 4: shop = "치과";
			break;
		case 5: shop = "헬스 클럽";
			break;
		}
		System.out.println(floor + "층 " + shop + "입니다.");
		
	}

}
