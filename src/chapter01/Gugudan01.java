package chapter01;

public class Gugudan01 {
	
	public static void main(String[] args){
		
		int i=1;
		while(i<=9){
	
			int j=1;//���ȿ��ִ� ������ ��������. ������ ���ȿ��� �����ǰ� ���� ���������� ��������. ����
			while(j<=9){
				int result =i*j;// ���� ���� �ѹ��ϸ�  result�� ������
				System.out.println(i +" X "+j+" = "+ result);
				j=j+1;
			}
			
			System.out.println("====================");
			i=i+1;//i++;
		}
	}
}
