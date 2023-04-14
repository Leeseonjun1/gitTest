package pack02_trycatch;

public class Ex04_TryNewCatch {

public static void main(String[] args) {
	
	
	int sum = 0;
	//throw: 강제로 예외를 발생시켜 catch블럭을 실행시킨다.
	try {
	for(int i =1; i<=100; i++) {
	sum+=i;
	 if(sum>=777) {
		 throw new Exception("누적합이 777이상이되었다!!"+sum);
		 }
	}
	}catch (Exception e) {
	e.printStackTrace();
	}
	System.out.println("누적합: "+ sum);
	System.out.println("770이상이면 계산중지값: "+ sum);
	

}
}
