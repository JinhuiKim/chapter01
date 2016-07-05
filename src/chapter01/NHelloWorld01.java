package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		//String s = "HelloWorld";
		String s = new String("HelloWorld");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		int i = 0;
		while(i<count){
	
			System.out.println("Hello World");
			i = i+1;
		}
//		System.out.println(count);
	}

}
