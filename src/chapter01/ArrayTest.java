package chapter01;

public class ArrayTest {

	public static void main(String[] args) {
		char[] c ;
		//char c[]; �Ѵٵ����� �����ڸ����� Ÿ���ڸ��� �迭���� ���� ��ȣ
		
		c=new char[3];
		
		c[0]='S';
		c[1]='K';
		c[2]='U';
		//c[3]='k'; ����
		
		
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
		
		//Ȯ�� for ��
		int sum2 = 0;
		for(int score:scores){
			sum2+= score;
		}
		
		System.out.println(sum+","+sum2);
	}

}
