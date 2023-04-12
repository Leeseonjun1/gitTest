package pack02_array2;

import java.util.Scanner;
import java.util.Random;
public class Test01_Game {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("랜덤한 숫자 맞추기 게임");
	      System.out.print("난이도 입력 : ");
		  int level= Integer.parseInt(sc.nextLine());	//오류가 나는 코드인지 알고있음
		  
		  int[]gameArray = new int[level];//3입력했을때 !> 0 0 0
		  
		  int random= new Random().nextInt(level);//0~2
		  
		  System.out.println("랜덤 숫자 : "+ random);
		  
		  gameArray[random]=1;//[1][0][0]
	       
		  while(true) {
	    	 System.out.println("1부터"+ gameArray.length+"사이의값입력");
	    	 int userNum =Integer.parseInt(sc.nextLine())-1;
	    	
	    	 if(gameArray[userNum]==1) {
	    	
	    		 System.out.println("정답");
	    		 
	    		 break;
	    	   }else {
	    		   System.out.println("오답");
	    		   break;
	    	   }
	       }
	
	
}
}
