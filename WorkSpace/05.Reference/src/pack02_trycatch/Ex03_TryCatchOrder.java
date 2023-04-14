package pack02_trycatch;

import java.util.Scanner;

public class Ex03_TryCatchOrder {
public static void main(String[] args) {
	int data2=0;
	try {
		int data1=10;
		int result=data1/data2;
		Scanner sc= new Scanner(System.in);
		sc.nextLine();
		args[10]="1";
		String data3="100";
	} catch (ArithmeticException e) {//연산오류 0으로 어떤수 나누기하면발생
		int data3=100;
		System.out.println("data2의 변수(값:"+data2+")때문에오류"+e.getMessage());
	}catch (NullPointerException e) {
		System.out.println("NullPointerException"+e.getMessage());
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("배열 오류!!"+e.getMessage());
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("문자 오류!!" + e.getMessage());
	}
	
	
	
	
	
	
	
}
}
