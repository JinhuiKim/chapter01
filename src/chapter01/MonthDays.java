package chapter01;

public class MonthDays {

	public static void main(String[] args) {
		int month = 5;
		int days = 0;
		
		if (month ==1) {
			days = 31;
		} else if (month ==2){
			days =28;
		}else if (month ==3){
			days =31;
		}else if (month ==4){
			days =30;
		}else if (month ==5){
			days =31;
		}else if (month ==6){
			days =30;
		}else if (month ==7){
			days =31;
		}else if (month ==8){
			days =31;
		}else {
			days = 0;
		}

		System.out.println(month+"월은 " + days + "일까지 있습니다.");
	}

}
