package pack02_array2;

import java.util.Scanner;
import java.util.Random;
public class Test01_Game {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ���߱� ����");
	      System.out.print("���̵� �Է� : ");
		  int level= Integer.parseInt(sc.nextLine());	//������ ���� �ڵ����� �˰�����
		  
		  int[]gameArray = new int[level];//3�Է������� !> 0 0 0
		  
		  int random= new Random().nextInt(level);//0~2
		  
		  System.out.println("���� ���� : "+ random);
		  
		  gameArray[random]=1;//[1][0][0]
	       
		  while(true) {
	    	 System.out.println("1����"+ gameArray.length+"�����ǰ��Է�");
	    	 int userNum =Integer.parseInt(sc.nextLine())-1;
	    	
	    	 if(gameArray[userNum]==1) {
	    	
	    		 System.out.println("����");
	    		 
	    		 break;
	    	   }else {
	    		   System.out.println("����");
	    		   break;
	    	   }
	       }
	
	
}
}
