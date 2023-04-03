
public class Test01 {
public static void main(String[] args) {
  // int, double, string 
  int num; //변수 선언 
      num =100; //할당 (값을 넣어줌)
  double dNum1 = 3.14; // 초기화 (선언과동시에 할당)
  double dNum2, dNum3 ; //나열(선언을 여러개를 동시에함 , 초기화 가능)
  String str = "문자열";
  String numStr="123";
     
  int numStr1 =Integer.parseInt(numStr);
  System.out.println(numStr1+10);
  String numStr2= ""+numStr1; // 숫자에서 다시 문자로 변경식
  System.out.println(numStr2);
  
  
}
}
