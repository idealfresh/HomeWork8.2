public class Main {
	
	public static int f1(int a, int b, int c){
		return a*b*c;
	}
			public static void main(String[] args){
				//����������� �����, ����� ������ 3 ���������� - ���� ����� � �� �������� ���� � �����. 
				//��������� ��������� 10 ���� � �������� ���������� �����.

	for(int i=0; i<10;i++){
		System.out.println(f1((int)(Math.random()*10),(int)(Math.random()*15),(int)(Math.random()*20)));
	}
		}
		
	
		
	

}

