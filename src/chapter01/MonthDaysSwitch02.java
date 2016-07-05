package chapter01;

public class MonthDaysSwitch02 {

	public static void main(String[] args) {
		int month = 2;
		int days=-1;
		
		switch (month) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
				days = 31;
				break;

			case 2:
				days = 28;
				break;

			case 4:
			case 6:
				days = 30;
				break;

			default:
				days =0;
				break;
		}
		System.out.println(month+"월은 " +days+"일까지 있습니다.");

	}

	}

