public class Main {
	
	public static int f1(int a, int b, int c){
		return a*b*c;
	}
			public static void main(String[] args){
				//Дефинирайте метод, който приема 3 параметъра - цели числа и ги умножава едно с друго. 
				//Извикайте функцията 10 пъти с различни произволни числа.

	for(int i=0; i<10;i++){
		System.out.println(f1((int)(Math.random()*10),(int)(Math.random()*15),(int)(Math.random()*20)));
	}
		}
		
	
		
	

}

