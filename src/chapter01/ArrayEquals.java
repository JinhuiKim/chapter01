package chapter01;

public class ArrayEquals {

	public static void main(String[] args) {
		int[] a1 ={100,200, 300};
		int[] a2={100,200,300};
		
		boolean result = equals(a1, a2);
		System.out.println(result);
	}

	//static 함수는 static함수만 불러서 쓸수 있음
	public static boolean equals(int[] array1, int[] array2){
		if(array1 ==null || array2 ==null){
			return false;
		}
		//여기까지 왔다는건  array1,2가 null아님
		if(array1.length!=array2.length){
			return false;
		}
		
		for(int i=0; i<array1.length;i++){
			if(array1[i]!=array2[i])
				return false; //break 안써도 함수 끝남
		}// 두개가 다 똑같다. else, break 자꾸 쓰지말고 return할 조건 찾아서 쓰면코드깔끔
		return true;
	}
}
