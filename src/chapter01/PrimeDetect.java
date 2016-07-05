package chapter01;

import java.util.Scanner;

/*******************************************************************************
* Q: 키보드에서입력을받은숫자가소수(Prime number)인지아닌지를판단하려고합니
* 다. 2부터시작해서자신보다작은숫자까지나누어나머지값이0이나오지않을때
* 소수라고결론을내리려고합니다. 입력받는숫자는양의정수라고가정하고빈부분을작성하세요.
********************************************************************************/

public class PrimeDetect {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지판단할숫자: ");
		int num = scanner.nextInt();

		//변수 초기화
		boolean isPrime = true;
		int divisor = 2;
		
		//판단
		while(divisor<num){
			
			if(num% divisor ==0){
				//소수가 아님
				isPrime =false;
				break; //if빠져나오는게 아니라 루프를 빠져나옴
			}
//			System.out.println(divisor);//확인
			divisor++;
		}
		//출력
		if (isPrime == true) {
		System.out.println(num + "은소수 입니다.");
		} else {
		System.out.println(num + "은소수가 아닙니다.");
		}
		
		scanner.close();
		}
}