package pack02_static;

public class Test01_MethodMain {
	String id;
	String pw;
	
   public Test01_MethodMain(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
		
   		boolean login(){
		if(id!=pw) {
			System.out.println("�α��μ���");
			return true;
		} else {
			System.out.println("�α��ν���");
			return false;
			}
	}

}
