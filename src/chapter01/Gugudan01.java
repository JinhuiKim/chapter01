package chapter01;

public class Gugudan01 {
	
	public static void main(String[] args){
		
		int i=1;
		while(i<=9){
	
			int j=1;//블럭안에있는 변수는 지역변수. 변수는 블럭안에서 생성되고 블럭을 빠져나가면 없어진다. 스택
			while(j<=9){
				int result =i*j;// 곰셈 연산 한번하면  result가 없어짐
				System.out.println(i +" X "+j+" = "+ result);
				j=j+1;
			}
			
			System.out.println("====================");
			i=i+1;//i++;
		}
	}
}
