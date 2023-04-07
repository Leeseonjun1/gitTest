package pack04_while;

public class Ex01_While {
public static void main(String[] args) {
	  //for(반복에 사용할 변수 초기화 ; 조건식(True; 증감식){
	  //실제반복할코드();
      //}
	
    // 1. 변수초기화식
	//while(2.조건식){
	//반복하는구간
	// 3. 증감식 or break를 이용한 반복문 종료
	//}
//	int i =0;
//	while(i<10) {
//	System.out.println(i);
//	i++;
//	}
	//for 문 반복횟수를 정확하게 알때 수에 의해서 반복시키는 경우
	//while문 반복회수를 정확하게 모를때 조건에 의해서 반복
	int j =0;
	while(j<50) {
		if(j%2==1) {
			System.out.println(j);
		}
		j++;
	}
	
	
}
	
}
