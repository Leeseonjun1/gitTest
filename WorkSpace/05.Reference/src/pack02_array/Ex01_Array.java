package pack02_array;

public class Ex01_Array {
	
	public static void main(String[] args) {
		//배열이란?
		//자료형 변수를 생성하고 사용할때 주로 쓰임
		//규칙"동일한"데이터 타입을 묶어서 사용하게 하며 정해진 수만큼 저장 처리하는 객체
		//객체(한번 만든 크기는 다시 바꾸는게 불편하다.
		//형탱 dataType[] name = new dayaType[size];
		//         데이터타입[]비열이름=new 데이터타입[크기]; 식
		
		//아직 스캐너나 별도의 처리로 점수를 입력하지 않은 변수 5개를 준비해둠
		int score1=0, score2=0, score3=0, score4=0, score5=0; 
	    int[]scores = new int[5];//0[0]1[0]2[0]3[0]4[0];
	    // 배열의 인덱스 규칙: n의 크기가 주어진 배열은 0부터 n-1까지 주소를 가진다
	    System.out.println("scores[0]값: "+ scores[0]);
	    System.out.println(scores);//힙영역의주소(메모리)값x
		scores[0]=10; //해당하는 타입의 변수라고 생각
		System.out.println("scores[0]값: "+ scores[0]);
		
		scores[0]=10; scores[1]=20; scores[2]=30;  scores[3]=40; scores[4]=50;
		System.out.println(scores[0]);
	    
		for(int i=0; i<5; i++) {
			scores[i]=i*5;
			
			System.out.println(scores[i]);
			
//			}
//		for(int i=1; i<=5; i++) {
//			System.out.println(i*10);
			}
//		
//		
		
	}//main
}//class
