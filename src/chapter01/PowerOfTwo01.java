package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args){

		Scanner scanner = new Scanner( System.in );
		
		
		System.out.print("�¼�: ");
		int power = scanner.nextInt();
		int result = 1;
		// Q: �Ʒ�while �ݺ������ۼ��Ͻÿ�.

		int i=0;
		while(i<power){
			result*=2;//result= result*2;
			i++;
		}
			
		System.out.println("2��"+ power + "������"+ result + "�Դϴ�.");
		scanner.close();//�ݾ��ش�
	}
}
