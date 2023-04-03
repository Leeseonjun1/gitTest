
public class Ex09_Oper {
public static void main(String[] args) {
	//변수타입 변수명= 값 비교식?"반환값1":"반환값2"
	//int result= num < 10 ? 1: 식2?식3....:모든식이 참이 아닐때.
	//score라는 변수가 있음. 해당 변수의 값이 90보다 크다면 A등급 80보다 크다면 b등급.. d등급
	
	int score = 91;
	String grade = score>90 ? "A": score >80? "B":"D";
	System.out.println(grade);
	
	int score1= 71;
	String grade1= score1>71 ? "c" : score1> 60 ? "D" : "E";
	System.out.println(grade1);
	
}
}
