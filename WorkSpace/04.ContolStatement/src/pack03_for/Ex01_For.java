package pack03_for;

public class Ex01_For{
 public static void main(String[] args) {
	

	//반복문:for문
	//사용이유:기계는사람보다 반복적인 작업을 잘함(정확,일정)
	//for (반복에 사용할 변수 초기화; 조건식;증감식)
//	for(int i=0; i<10;) { //무한루프:잘못된 반복문 예시
//		System.out.println("for문변수i의 값 "+i);
//		break;
//	}
	   int result=0;
	   for(int i=0; i<9; i+=1) {
		System.out.println("홀수"+i);
		result=i;
		
		}
		System.out.println("i의최종값:"+ result);
	   
	
	
	
	
 	}//main
 	}	 //class


