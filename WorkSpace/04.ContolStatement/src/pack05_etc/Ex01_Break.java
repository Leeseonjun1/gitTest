package pack05_etc;
import java.util.Scanner;
public class Ex01_Break {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	while(true) {
		System.out.println("������");
		int num1=Integer.parseInt(sc.nextLine());
		if(num1==-1){
			System.out.println("����");
			break;
	     }else if(num1==1) {
	    	 System.out.println("1���޴������ڵ�");
	     }else {
	    	 System.out.println("�߸����Է�");
	     }
		System.out.println("���");
		}
		
		
	
	
	
	
	}	
}
