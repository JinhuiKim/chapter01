package chapter01;

public class ArrayEquals {

	public static void main(String[] args) {
		int[] a1 ={100,200, 300};
		int[] a2={100,200,300};
		
		boolean result = equals(a1, a2);
		System.out.println(result);
	}

	//static �Լ��� static�Լ��� �ҷ��� ���� ����
	public static boolean equals(int[] array1, int[] array2){
		if(array1 ==null || array2 ==null){
			return false;
		}
		//������� �Դٴ°�  array1,2�� null�ƴ�
		if(array1.length!=array2.length){
			return false;
		}
		
		for(int i=0; i<array1.length;i++){
			if(array1[i]!=array2[i])
				return false; //break �Ƚᵵ �Լ� ����
		}// �ΰ��� �� �Ȱ���. else, break �ڲ� �������� return�� ���� ã�Ƽ� �����ڵ���
		return true;
	}
}
