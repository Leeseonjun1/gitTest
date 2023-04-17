package pack01_base;

public class Ex02_Calculator {
//static 키워드가 있는지 없는지의 판단.(멤버구분의매우중요함)
	//메소드의구조
	//생성자 메소드 (Constructor):객체를 생성할때 필요한 메소드

	//메소드구조:
	//void메소드이름(){
	// 메소드내용(코드)          
	//}
	//파라메터부: 어떤것이든 메소드가 실행 될때 필요한 (변수,클래스등)정보가 있다면 
	//			받아오게끔 처리하는 부분
	
	//PowerOff에서 main에 접근이 되는이유: static멤버여서 메모리에 먼저 있기때문
	//main에서 poweroff접근이 안되는이유: 인스턴스화 과정을 안거치면 메모리에 없음
	
	void powerOn(int power) {
		if(power<1) {
			System.out.println("베터리 부족으로 실행불가");
			PowerOff();
		}else {
			System.out.println("전원을 켭니다.");
		}
	}
	void PowerOff() {
	System.out.println("전원을 끕니다.");
	}
	//void인지 void가 아닌지에 따라 리턴타입이 결정된다.
	//내가 알고있는 모든 타입> 리턴타입으로 사용이가능
	//void:리턴이없는(작업 후 결과가 필요가 없음)
	
	//return 타입이 void가 아니게 주어지면 해당하는 타입을 반환하는 return 키워드 반드시 필요하다.
	
	int test() {
	return 0;	
	}
	
	//1. 파라메터부에 숫자를 두개 입력받기
	//2. 입력받는 파라메터부 두 숫자합을 return코딩해보기
	int plus(int num1, int num2) {
	return num1+num2;	
		}
	int plsu3(int num1,int num2 ,int num3) {
		return num1+num2+num3;
	}
	
}
