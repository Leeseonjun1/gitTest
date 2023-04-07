package pack04_while;

public class Ex02_While {
	public static void main(String[] args) {
		int i= 1;
		int result =0;
		while(i<=10) {
			System.out.println(i);
			result+= i;
			i++;
		}
		for(int j=0; j<=10; j++) {
			result += j;
		}
		
		System.out.println(result);
		
	}

}
