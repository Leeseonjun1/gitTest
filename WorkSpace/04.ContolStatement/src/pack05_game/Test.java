package pack05_game;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	int random = new Random().nextInt(100)+1;//1~100������ �� ä��
	System.out.println(random);
	    Scanner sc = new Scanner(System.in);
	    int i = 0; 	
	    while(true){
	    	 System.out.println("1���� 100������ ������ �Է��ϼ��� �� ");
	    	 int num1= Integer.parseInt(sc.nextLine());
	    	 i++;
	    	 if (num1<random) {
        	      System.out.println("�� ū���� �Է��ϼ���!");
	    	 }   else if(num1>random){
	    		 System.out.println("�� ������ �Է��ϼ���");
        	 }else {
        		System.out.println("������ϴ�.!");
        		break;
        }//else
	    	  }
	    System.out.println("�õ�Ƚ���� : "+i);
	}
	
}

