
package pack01_if;

import java.util.Scanner;

public class Ex01_If {
	
	public static void main(String[] args) {// {프로그램 시작점
		//if문 : 제어문중에 조건문이다.
		//어떤 조건을 주고 해당 조건이 TRUE일때의 지역(블러킹{})을 만들고 그 지역의 코드를 실행한다.
		//이항연산자부분은 값만 결과로 사용가능> if문은 별도의 코딩을 결과로써 사용이 가능하다.
		// if (조건식:TRUE와FALSE의 결과를 얻을수있는것) {
		    // 조건식이 TRUE일때 실행하는 부분.
		//}
		int score = 80; //웹에서 입력받아온 ID와 PW를 비교할때 사용함.
		if(score>=90) {
			//조건식이 TRUE일때만 실행가능하다.
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A등급 입니다.");
		}
		System.out.println("여기까지 왔을까요?");
		//score의 숫자가 홀수인지 짝수인지를 판단해서 결과를 출력해보기
		if(score%2==0) {
		    System.out.println("짝수");
			}
		if(score%2==1) {
			System.out.println("홀수");
		}
		
		
//         Scanner sc = new Scanner(System.in);
//         System.out.print("가격을 적으세요: ");
//         int money =Integer.parseInt(sc.nextLine());
//	   
//	    if(money > 2500) {
//	    	System.out.println("커피");
//	    }
//	    if(money < 2500) {
//	    	System.out.println("라떼");
	    }
		}// 프로그램 끝점
	
	


