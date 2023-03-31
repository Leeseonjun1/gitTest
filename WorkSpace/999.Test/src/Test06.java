
public class Test06 {
	public static void main(String[] args) {
		// 명명규칙 : Class(.Java)파일은 대문자로 시작하기.
		// 변수는 소문자로 시작하는데 의미있는 단어를 연결해서 조합함.
		int subject1, subject2, subject3, subject4, subject5;
		subject1 = 10;
		subject2 = 20;
		subject3 = 30;
		subject4 = 40;
		subject5 = 50;
		System.out.println(subject1);
		System.out.println(subject2);
		System.out.println(subject3);
		System.out.println(subject4);
		System.out.println(subject5);

		// 형변환 (Casting): 서로 다른 타입의 변수를 변환시켜 사용함.
		// ex) int <-> double, String <-> int

		int iValue = 20;
		double dValue = iValue+0.5;
		System.out.println("iValue 값:" + iValue);
		System.out.println("dValue 값:" + dValue);

		iValue = (int) dValue;
		System.out.println("iValue 값:" + iValue);
		System.out.println("dValue 값:" + dValue);
 
		String str = "1234" + 12;// 123412
		// 문자열에 어떤 값을 더하는 것 == 합x
		int iData = 1234 + 12;// 1246
		
		System.out.println(iData);
		System.out.println(str);
	    //문자열에서 -> 숫자로 나오게하기
		int sum = Integer.parseInt(str)+1;
	    System.out.println(sum);
	    
	    // boolean (부울형) true 또는 false 만 저장이 가능함.
	    
	    
	    int num1 = 20;
	    double num2 = num1;
	    		

    System.out.println(num1);
    System.out.println(num2);
	}
	  

}
