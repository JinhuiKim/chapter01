package chapter01;

import java.util.Scanner;

/*******************************************************************************
* Q: Ű���忡���Է����������ڰ��Ҽ�(Prime number)�����ƴ������Ǵ��Ϸ����մ�
* ��. 2���ͽ����ؼ��ڽź����������ڱ����������������0�̳�����������
* �Ҽ�����������������մϴ�. �Է¹޴¼��ڴ¾�������������ϰ��κ����ۼ��ϼ���.
********************************************************************************/

public class PrimeDetect {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Ҽ������Ǵ��Ҽ���: ");
		int num = scanner.nextInt();

		//���� �ʱ�ȭ
		boolean isPrime = true;
		int divisor = 2;
		
		//�Ǵ�
		while(divisor<num){
			
			if(num% divisor ==0){
				//�Ҽ��� �ƴ�
				isPrime =false;
				break; //if���������°� �ƴ϶� ������ ��������
			}
//			System.out.println(divisor);//Ȯ��
			divisor++;
		}
		//���
		if (isPrime == true) {
		System.out.println(num + "���Ҽ� �Դϴ�.");
		} else {
		System.out.println(num + "���Ҽ��� �ƴմϴ�.");
		}
		
		scanner.close();
		}
}