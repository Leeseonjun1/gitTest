package pack02_static;

public class Ex01_Static {
	//static의 여부에 따라서 멤버를 구분한다.
	//static의 여부에 따라서 메모리에 올라가는 순서가다르다.
	//static:프로그램 시작전에 먼저 메모리에 할당. 프로그램 종료시 소멸
	//instance:인스턴스화 과정후에 메모리에 할당. 프로그램 종료시 소멸
	//멤버: 클래스의맴버=>클래스의중괄호 사이에 있는 모든것들
	
	static void sMethod() {
		System.out.println("스태틱멤버이니다.");
		//imethod();//인스턴스
	}
	 //스태틱이들어와되는데 인스턴스멤버가 들어가서
	//인스턴스 멤버
	void imethod() {
		System.out.println("인스터스 멤버 입니다.");
		
	}
	void imethod2() {
		imethod();//인스턴스 접근가능
		sMethod();//스태틱 접근가능
	}
	
	public static void main(String[] args) {
//	Ex01_Static sc = new Ex01_Static();
//	sc.imethod();
     Ex01_Static.sMethod();	
	
	
	}	
}
