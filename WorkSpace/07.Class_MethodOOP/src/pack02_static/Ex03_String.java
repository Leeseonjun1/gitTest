package pack02_static;

public class Ex03_String {
	//String Class:문자열을 조직하기 위한 기능을 담고 있는 클래스
	//java.lang(패키지), String.class(.java)
	//String 역시 Class이기 때문에 멤버를 가지고 있다.
	//다른사람(Java,Oracle)이 만든 클래스의 기능(메소드)활용해보기.
	//변수는 소괄호가x 메소드는 소괄호o
	public static void main(String[] args) {
		String str1="apple";
		String str2= new String("APPLE"); //인스턴스화 과정을 거쳐서 
	System.out.println("str1 : "+ str1);
	System.out.println("str2 : "+ str2);
	
	//length()메소드: 문자열의 길이를 알수있음
	System.out.println("length()"+str1.length());
	
	//toUpperCase(), toLowerCase()
	//대문자로변경 , 소문자로변경
   System.out.println("toUpperCase()"+str1.toUpperCase());
   System.out.println("toLowerCase()"+str2.toLowerCase());
	//subString():특정문자 추출 (index)
   //subString메소드를 코드 자동완성(ctrl+space)로 해보고 호출해보기
   System.out.println("subString(int):"+str1.substring(2));
  System.out.println("subString(int,int)"+str1.substring(1,3));
  
  System.out.println("charAt: "+str1.charAt(4));
  System.out.println(str1.substring(4, 5));
  //indexOf():문자열에서 특정 문자의 존재여부 존재:index반환 실패-1
  
  System.out.println("indexOf() : "+str1.indexOf("0"));
  //split():문자열의 분리 split()메소드를 이용해서 split()메소드가 리턴하는 타입
  	String[]temp=str1.split("");
  	System.out.println(temp.length);
	 
  	String str3= "ab cd ef";
  	String[]tempArr=str3.split(" ");
	System.out.println(tempArr.length);
	//pp라는 글자를 찾아서 @@바꿔보기
	System.out.println(str1.replaceAll("pp", "@@"));
	//trim():자우 공백 제거
	String trimStr1="	abc	def";
	System.out.println(trimStr1.trim().replaceAll("", ""));
	//비교
	String eqStr1="A";
	String eqStr2= new String("A");
	if(eqStr1.equals(eqStr2)) {
		System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	
	
	}
}
