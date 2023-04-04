package pack01_if;

public class Ex_IfElse {
public static void main(String[] args) {
	//if문:단순if(조건식을 주고 해당하는 조건식이 TRUE인경우의 블럭킹(지역{})을 만들어서 코드실행)
	//if-else문:단순if문은 조건식이TRUE일때만 실행이되는 번거러움이 있음.
	//if의 조건식이 TRUE가 아닌 FALSE라면 else라는 키워드를 if문 뒤에 붙여서 FALSE실행부를 만들드는것.
	int score=85;
	if(score%2==0) {
		System.out.println("짝수");//TRUE일때실행
	} else {
		System.out.println("홀수");//FALSE일때실행
	}
	int num1= 10 , num2= 20;
	if(num1<num2) {
		System.out.println("num2크다");
	}else {
		System.out.println("num1작다");
	}
	}// main
}//class
