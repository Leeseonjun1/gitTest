package pack05_game;

import java.util.Scanner;

public class Test2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 while(true){
		System.out.println("���������� �Է��ϼ��� : ");
	     int kor = Integer.parseInt(sc.nextLine());
	     if(0>kor || kor>100) {
			 System.out.println("�����޼���");
			 System.out.println("���Է�");
			 continue;
		  }//if
		 System.out.println("���������� �Է��ϼ��� : ");
		 int eng = Integer.parseInt(sc.nextLine());
		 if(0>eng||eng>100) {
			 System.out.println("�����޼���");
			 System.out.println("���Է�");
			 continue; 
		    }//if
		 System.out.println("���������� �Է��ϼ��� : ");
		 int mat = Integer.parseInt(sc.nextLine());
		 if(0>mat||mat>100) {
			 System.out.println("�����޼���");
			 System.out.println("���Է�");
			 continue;
		 }//if
		 		int sum = kor+eng+mat;
			    double avg= kor+eng+mat;
			    System.out.println("���� : "+sum);
			    System.out.println("��� : "+avg/3);
			    break;
		 }//while
	     }//main
		}//class
