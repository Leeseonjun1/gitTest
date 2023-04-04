package pack01_if;

public class Ex04_Ifif {
public static void main(String[] args) {
	//블럭킹의 기본 개념:{<메모리올림       }<메모리에서내림
    //자바프로그램은 메모리를 효율적으로 쓰기위해서 메모리에 올리고 내리는 과정이 존재함.
	//블럭킹(지역)은 계속해서 중첩이 가능하다.
int score =10;
//if (score%2==0) {
//	System.out.println("짝수");
//}else {
//	System.out.println("홀수");
//}
//if(score==10) {
//	System.out.println("10");
//}else {
//	System.out.println("else10아님");
//}
//if(score<11) {
//	System.out.println("else11작음");
//}
	
if(score %2==0) {
	System.out.println("짝수");
	if(score==10) {
		System.out.println("10");
		if(score<11) {
			System.out.println("11보다작음");
		}
	}
  	} else {
	  System.out.println("홀수");
	  if(score==10) {
		 System.out.println("10");
		 if(score <11) {
			 System.out.println();
		 }
	  }else {
		  System.out.println("10아님");
	  }
  }
 
	




	
	}//main
}//class
