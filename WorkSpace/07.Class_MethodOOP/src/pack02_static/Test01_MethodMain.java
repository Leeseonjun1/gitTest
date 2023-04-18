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
			System.out.println("로그인성공");
			return true;
		} else {
			System.out.println("로그인실패");
			return false;
			}
	}

}
