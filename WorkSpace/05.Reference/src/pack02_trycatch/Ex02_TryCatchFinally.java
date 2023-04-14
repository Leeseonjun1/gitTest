package pack02_trycatch;

public class Ex02_TryCatchFinally {
public static void main(String[] args) {
	
	try {
		System.out.println("가스불 ON");
		System.out.println("요리시작");
		int errorlnt =10/0; //요리하다가 갑자기 무슨일이 생김
		System.out.println("요리끝");
		System.out.println("가스불OFF");
		System.out.println("종료");
		}catch (Exception e) {
		System.out.println("예외 발생");
		}finally {
		  //반드시 실행되어야하는 로직(코드)이 있다면 넣어주는 부분
			System.out.println("요리끝");
			System.out.println("가스불OFF");
			System.out.println("종료");
		}
	
	
	
	
	
	
	
	
	
}
}
