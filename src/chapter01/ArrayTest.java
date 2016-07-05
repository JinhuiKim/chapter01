package chapter01;

public class ArrayTest {

	public static void main(String[] args) {
		char[] c ;
		//char c[]; 둘다되지만 변수자리보다 타입자리에 배열쓰는 것을 선호
		
		c=new char[3];
		
		c[0]='S';
		c[1]='K';
		c[2]='U';
		//c[3]='k'; 에러
		
		
		int[] scores={100, 90, 20, 30,40};
		//int[] scores = new int[5];
	
		/*
		
		int[] scores2;
		scores2 ={100, 90, 20, 30, 40};
		
		*/
		
		
		System.out.println(scores.length);
		int sum=0;
		for(int i=0; i< scores.length; i++){
			sum = sum +scores[i];
		}
		
		//확장 for 문
		int sum2 = 0;
		for(int score:scores){
			sum2+= score;
		}
		
		System.out.println(sum+","+sum2);
	}

}
