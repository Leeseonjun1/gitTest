
public class Ex02_Operator {
public static void main(String[] args) {
	// 복습해도됨 엄청많이씀, 증감 ,가감
	// ++ , --
	int num1=1, num2 =1;
	
	
	System.out.println(num1++); // 후행연산(뒤에 증감식이 붙은것)
	System.out.println(++num2); // 선행연산(앞에 증감식이 붙은것)
	
	System.out.println("증감식 후:" + num1);
	System.out.println("증감식 후:" + num2);
	
	System.out.println(num1--);//2 출력후 2-1 
	System.out.println(--num1);//1 2-1 
	
}
}
