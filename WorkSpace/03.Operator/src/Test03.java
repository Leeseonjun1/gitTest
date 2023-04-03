import java.util.Scanner;
public class Test03 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    String inputData1=sc.nextLine();
    
    int num1 = Integer.parseInt(inputData1);
	String reulst = num1 % 2 == 0  ? "Â¦¼ö" : "È¦¼ö" ;
	System.out.println(reulst);
	
	
	
	
}
}
