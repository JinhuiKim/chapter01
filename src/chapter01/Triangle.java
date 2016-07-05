package chapter01;

public class Triangle {

	public static void main(String[] args){
		
		int num=6;
		
		for(int i = 0; i<num; i++){ //세로축
			for(int j=0; j<=i; j++){//가로축
				System.out.print('*');
				
			}
			//System.out.println(); 
			System.out.print("\n");
		} 
		System.out.println();
		
	}
	
}
