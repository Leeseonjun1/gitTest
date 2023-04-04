package pack01_if;

public class Ex03_Ifif {
public static void main(String[] args) {
	//블럭킹> {}(지역)
	//int num1=10; (변수 초기화 시키면 메모리 어는 부분에 값이 저장되고 우는 변수명으로 찾아서쓴다)
	//변수는 언제까지 메모리에 저장이 되어있을까?
	//새로운 변수를 쓰기전까지 ? 프로그램 끝날될까지 ?
	int num1 = 10;
	if(num1==10) {  // main안에 num1라는 변수를 쓰고있어서
		int num2=10;// {}블럭킹이 끝나는 지점까지
		System.out.println(num2);
	}
	{
		int num2=10;             // 새로운 블럭킹에 다시 쓸수있음
	
		System.out.println(num2);
	}
	
	
	
 }//main
}//class
