package pack03_for;

import java.util.Scanner;

public class Ex03_DebugFor {
public static void main(String[] args) {
	//Bug : 알수없는(개발자x)오류가 나오면서 프로그램이 정상 작동을 안할때.
	//Debug: 오류를 찾아서 바로잡는 과정
	//디버깅은 매우 중요함.
	//브레이킹(크) 포인트(중단점) : 프로그램은 위에서 아래로 순차적으로 동작한다.
	//특정 줄(스택)에 멈추고 해당하는 동작전에 변수나 상황을 먼저 확인을 할수있는점
	//1~10번째 줄까지 프로그램이 진행됨. 이용해서 특정줄(5)에서 멈춤
	Scanner sc = new Scanner(System.in);
	String inputData=sc.nextLine();
     int userNum=Integer.parseInt(inputData);//숫자 외에 값이 입력되면 int형으로 바꾸다가 오류
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	
	for(int i = 0; i<10; i++) {
		System.out.println(i);
	}
	
	
}//main
}//class
