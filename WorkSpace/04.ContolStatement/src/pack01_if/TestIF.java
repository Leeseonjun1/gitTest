package pack01_if;

public class TestIF {
public static void main(String[] args) {
  int code=1;
	if(code==1) {
		System.out.println("����");
	} else if (code==2) {
		System.out.println("����");
		}else if(code==3) {
			System.out.println("����");
		}else if (code==4) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
	
	int random=(int)(Math.random()*6)+1;
	System.out.println(random);
	if(random==1){
	System.out.println(random+"�� ��µǾ����ϴ�.");
           }else if (random==2) {
        	   System.out.println(random+"�� ��µǾ����ϴ�.");
           }else if (random==3) {
        	   System.out.println(random+"�� ��µǾ����ϴ�.");
           }else if (random==4) {
        	   System.out.println(random+"�� ��µǾ����ϴ�.");
           }else if(random==5) {
        	   System.out.println(random+"�� ��µǾ����ϴ�.");
           }else {
        	   System.out.println(random+"�� ��µǾ����ϴ�.");
           }
	
	 }
	

}

