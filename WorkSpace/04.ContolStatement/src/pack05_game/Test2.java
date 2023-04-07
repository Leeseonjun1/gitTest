package pack05_game;

import java.util.Scanner;

public class Test2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 while(true){
		System.out.println("국어점수를 입력하세요 : ");
	     int kor = Integer.parseInt(sc.nextLine());
	     if(0>kor || kor>100) {
			 System.out.println("오류메세지");
			 System.out.println("재입력");
			 continue;
		  }//if
		 System.out.println("영어점수를 입력하세요 : ");
		 int eng = Integer.parseInt(sc.nextLine());
		 if(0>eng||eng>100) {
			 System.out.println("오류메세지");
			 System.out.println("재입력");
			 continue; 
		    }//if
		 System.out.println("수학점수를 입력하세요 : ");
		 int mat = Integer.parseInt(sc.nextLine());
		 if(0>mat||mat>100) {
			 System.out.println("오류메세지");
			 System.out.println("재입력");
			 continue;
		 }//if
		 		int sum = kor+eng+mat;
			    double avg= kor+eng+mat;
			    System.out.println("종점 : "+sum);
			    System.out.println("평균 : "+avg/3);
			    break;
		 }//while
	     }//main
		}//class
