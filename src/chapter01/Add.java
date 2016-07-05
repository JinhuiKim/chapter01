package chapter01;

public class Add {

	public static void main(String[] args) {
		int sum=0;
		for(String arg: args){
			int value=Integer.parseInt(arg);
//			System.out.println(value);
			sum += value;
		}
		System.out.println(sum);
	}

}
