package pack05_game;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	int random = new Random().nextInt(100)+1;//1~100까지의 수 채번
	System.out.println(random);
	    Scanner sc = new Scanner(System.in);
	    int i = 0; 	
	    while(true){
	    	 System.out.println("1부터 100사이의 정수를 입력하세요 ▶ ");
	    	 int num1= Integer.parseInt(sc.nextLine());
	    	 i++;
	    	 if (num1<random) {
        	      System.out.println("더 큰수를 입력하세요!");
	    	 }   else if(num1>random){
	    		 System.out.println("더 작은수 입력하세요");
        	 }else {
        		System.out.println("맞췄습니다.!");
        		break;
        }//else
	    	  }
	    System.out.println("시도횟수는 : "+i);
	}
	
}

