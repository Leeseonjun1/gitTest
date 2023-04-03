
public class Ex04_Oper {
public static void main(String[] args) {
	//산칙연산 + 나머지
	int value1= 5 , value2 = 2;
	//string- int가 불가능하기때문에
	//소괄호로 연산 우선순위를준다.
	// 습관적으로 string 과 연산할때는 괄호를 씌여준다.
	
	
	System.out.println("value1 + value2 ="+ (value1 +value2));
	System.out.println("value1 - value2 ="+ (value1 -value2));
	System.out.println("value1 * value2 ="+ (value1 *value2));
	System.out.println("value1 / value2 ="+ (value1 /value2));
	System.out.println("나머지는 %로 구한다 ="+ (value1 %value2)	);
}
}
