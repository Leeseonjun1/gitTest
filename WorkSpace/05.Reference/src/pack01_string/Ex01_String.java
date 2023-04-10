package pack01_string;
import java.util.Scanner;
public class Ex01_String {
public static void main(String[] args) {
	//String : 기본형 변수x 참조형변수
	//참조형 변수는 스택이라는 메모리공간에 힙 영역의 주소만 저장하고 실제 값은 힙 영역에 있는 형태
	//기본형 변수는 힙 영역 사용 x
	String strVar1="Kym";
	String strVar2="Kym";
	
	if(strVar1==strVar2) {
	 System.out.println("같음");
	}else{
		System.out.println("다름");
	}
	System.out.println();
	String strVar3=new String("Kym");
	String strVar4=new String("Kym");
	Scanner sc= new Scanner(System.in);
	String StrVar5 =sc.nextLine();
	if(strVar1==StrVar5) {
		System.out.println("strVar1==strVar5");
	}else if(strVar3==StrVar5) {
		System.out.println("strvar3==strVar5");
	}else {
		System.out.println("strVar1, strVar3, strVar5");
	}
	
	
	if(strVar3==strVar4) {
		System.out.println("같음");
	}else {
		System.out.println("다름");
	}
	
	
	}
}

