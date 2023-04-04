package pack01_if;
import java.util.Scanner;
public class Test_DiceGame {
public static void main(String[] args) {
	//ex)사용자가어떤 동작을 했을때 게임이 진행이 되는것==조작
	System.out.println("주사위 게임을 시작합니다.");
	System.out.println("-1을 입력하면 종료합니다. 그외에는 시작");
	Scanner sc= new Scanner(System.in);
	int random1= Integer.parseInt(sc.nextLine());
    if (random1==-1) {
    	System.out.println("종료합니다");
    }else {
    	System.out.println("게임시작");
    	System.out.println("사용자가 주사위를 굴릴 차례입니다. 굴리기 엔터");
    	sc.nextLine();
    	int userNum=(int)(Math.random()*6)+1;
    	System.out.println("사용자의 수"+ userNum);
    	System.out.println("사용자가 주사위를 굴릴 차례입니다. 굴리기 엔터");
    	sc.nextLine();
    	int comNum=(int)(Math.random()*6)+1;
    	System.out.println("컴퓨터의 수:"+comNum);
    	if(userNum<comNum) {
    		System.out.println("유저의 수: "+userNum + "컴퓨터의 수: "+comNum +"유저승!");
    	}else if(userNum>comNum) {
    		System.out.println("유저의 수: "+userNum + "컴퓨터의 수: "+comNum +"유저승!");
    	}else {
    		System.out.println("유저의 수: "+userNum + "컴퓨터의 수: "+comNum +"무승부");
    	}
    } 
	
	 //1~6까지의 수 랜덤하게 뽑는 기능 (메소드)
	
	
	
	
	
}
}
