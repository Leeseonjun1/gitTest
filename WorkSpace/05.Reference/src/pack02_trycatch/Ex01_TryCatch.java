package pack02_trycatch;



public class Ex01_TryCatch {

	public static void main(String[] args) {
		//try{
		  //예외(오류)가 발생할 가능성이 있는 코드(코드 자체가 정상);
		//a<= x코드가 비정상
		//Integer.parselnt(sc.nextLlne());
		//}cath(Exception e){
		//예외가 발생할 시 처리할 코드(대안코드)
		//}선택 finally{
		//무조건 한번 실행되어야 하는 코드가 있다면 넣어줌.
		//데이터베이스의 연결을 해제하거나,세션을 끊는다.(큐넷)
		//}
		
	try {	
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("오류가 발생함.");
		}
			System.out.println("여기까지 실행되나요??");
		
		//[에러의종류]
		//1.하드웨어적인 에러: 치명적인에러 > 프로그램이 실행이안된다.(그래픽카드,메모리등등의 물리적)
		//2.소프트웨어적인 에러: 가벼운 에러 > 예외(Exception)
		//	-Oracle회사에서는 모든 예외들을 클래스로 만들어서 제공을 한다.
		//	-예)NullPointerException:null인상태에서 기능 사용(참조x)	
		
		//[예외의종류]
		//1.미확인 예외(실행 예외)
		//-프로그램을 실행 해봐야만 예외가 발생하는지 알 수있다.
		//-프로그래머의 실수,경험에 의해서 발생: 디버깅(오류수정)작업한다.
		
		//2.확인 예외(일반 예외)
		//-프로그램 작성중(코딩)에 반드시 예외처리를 해줘야만 사용이 가능한 것들이있음
		//-try{}Catch{}해주면 해결됨.	
		
		
		//FilelnputStream fis=new FileInputStream("abc.txt");
		
		
		
		
		
	}
	
	
}
