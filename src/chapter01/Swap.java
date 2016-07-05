package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		
		// Q1: n1값이항상큰값이되도록, 필요할경우n1과 n2를교체하라.
		if (n1<n2){	
			int tmp=n1;
			n1=n2;
			n2=tmp;
			
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		// n1은 30 n2는 10
		
		// Q2:최대값을판별하는조건을완성해보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		if (a1 >= a2) {
			if(a1>=a3){
				System.out.println("최대값은" + a1 +"입니다.");
			} else {
				//a3>a1>=a2
				System.out.println("최대값은" + a3 + "입니다.");
			}
			
		} else {
			// a2>a1
			if(a2>=a3){
				System.out.println("최대값은" + a2 +"입니다.");
			} else {
				// a3>a2>a1
				System.out.println("최대값은" + a3 + "입니다.");
			}
		}

/*		if (a1 >= a2 && a1>=a3) {
			System.out.println("최대값은" + a1 +"입니다.");
		} else if(a2>=a1 && a2>=a3) {
			System.out.println("최대값은" + a2 + "입니다.");
		} else if(a3>=a1 && a3>=a2){
			System.out.println("최대값은" + a3 + "입니다.");
		}
*/		//최대값은 50입니다.
	}

}
