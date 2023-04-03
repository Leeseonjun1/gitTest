
public class Ex08_Oper {
public static void main(String[] args) {
	//비교연산자: 조건문에 많이 사용 된다.
	//조건 : 어떤 식이 참인지 또는 거짓인지를 판단하는 것
	// id와 pw가 내가 입력한 값과 DB에 있는 값이 일치하는지? "로그인":"아이디 또는 비미번호를 확인하세요"
	// 조건은반드시true와 false의 답을 얻을수있어야한다.
	int num1 = 10 , num2=10;
	//== !=  <=  >=  <   > 
	// 같다 같지x 이상 이하 초과 미만
	//조건식을 사용하고 나서는 결과가 반드시 true false가 나온다()
	boolean result1= num1==num2;// true
	boolean result2= num1!=num2;// false
	boolean result3= num1<= num2;// true //10이하는 10이 포함에서 true
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	
	System.out.println(num1==num2);
	System.out.println(num1!=num2);
	System.out.println(num1<=num2);
	System.out.println(num1 >= num2); //t
	System.out.println(num1 > num2); //f
	System.out.println(num1 < num2);//f
	
	//식을 연결 :논리 연산자 (여러개조건 판단)
	// 최종적인 결과 True또는 False의 결과만 나온다
	//조건식 A && 조건식 B : 조건식a가 참이고 조건식b도 참일 경우 = True 그 외에 False
	//&& (AND,*,논리곱)
	//조건식 A || 조건식 B : 조건식a가 참이면 뒤에 조건과 상관없이 true
	//||(OR)
	System.out.println("=========구분=========");
	System.out.println(10>5 && 20>5);
	System.out.println(10>5 && 20<5);
	System.out.println(5>10 && 20>5);
	System.out.println(5>10 && 5>20);
	System.out.println("=========구분=========");
	System.out.println(10>5 || 20>5); //t
	System.out.println(10>5 || 20<5); //t
	System.out.println(5>10 || 20>5); //t
	System.out.println(5>10 || 5>20); //f
	System.out.println(5>10 && 20>5 || 5>10); 
	
	
}
}
