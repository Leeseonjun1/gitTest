package pack05_etc;
import java.util.Scanner;
public class Ex01_Break {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	while(true) {
		System.out.println("루프중");
		int num1=Integer.parseInt(sc.nextLine());
		if(num1==-1){
			System.out.println("종료");
			break;
	     }else if(num1==1) {
	    	 System.out.println("1번메뉴대한코딩");
	     }else {
	    	 System.out.println("잘못된입력");
	     }
		System.out.println("출력");
		}
		
		
	
	
	
	
	}	
}
