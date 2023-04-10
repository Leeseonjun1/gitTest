package pack01_string;

public class Ex01_Null {
public static void main(String[] args) {
	//기본형 변수 타입 : int double float long char boolean
	//참조형 변수 타입 : 변수 x , 기본형 변수타입이 아닌 모든 것들(객체,Object,Class)
	//스택 영역에 참조 번지수를 저장하고 값은 힙에 따로 저장.
	//Null (참조 번지수가 없는 상태 오류가 제일 많이 발생함)
	String str1= null;
	String str2="a";
	String str3;//null 이라는것은 참조를 시작하지는x 스택에 변수는 올라가 있음
	//아직 어떤값을 할당할지 모를 때 null로 초기화 할수 있음.
	
	System.out.println(str1.length());
	System.out.println(str2.length());
	//System.out.println(str3);

	
	if(str1==str2) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	
	
	
}
}
