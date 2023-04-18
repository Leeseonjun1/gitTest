package pack02_static;

public class Ex03_String {
	//String Class:���ڿ��� �����ϱ� ���� ����� ��� �ִ� Ŭ����
	//java.lang(��Ű��), String.class(.java)
	//String ���� Class�̱� ������ ����� ������ �ִ�.
	//�ٸ����(Java,Oracle)�� ���� Ŭ������ ���(�޼ҵ�)Ȱ���غ���.
	//������ �Ұ�ȣ��x �޼ҵ�� �Ұ�ȣo
	public static void main(String[] args) {
		String str1="apple";
		String str2= new String("APPLE"); //�ν��Ͻ�ȭ ������ ���ļ� 
	System.out.println("str1 : "+ str1);
	System.out.println("str2 : "+ str2);
	
	//length()�޼ҵ�: ���ڿ��� ���̸� �˼�����
	System.out.println("length()"+str1.length());
	
	//toUpperCase(), toLowerCase()
	//�빮�ڷκ��� , �ҹ��ڷκ���
   System.out.println("toUpperCase()"+str1.toUpperCase());
   System.out.println("toLowerCase()"+str2.toLowerCase());
	//subString():Ư������ ���� (index)
   //subString�޼ҵ带 �ڵ� �ڵ��ϼ�(ctrl+space)�� �غ��� ȣ���غ���
   System.out.println("subString(int):"+str1.substring(2));
  System.out.println("subString(int,int)"+str1.substring(1,3));
  
  System.out.println("charAt: "+str1.charAt(4));
  System.out.println(str1.substring(4, 5));
  //indexOf():���ڿ����� Ư�� ������ ���翩�� ����:index��ȯ ����-1
  
  System.out.println("indexOf() : "+str1.indexOf("0"));
  //split():���ڿ��� �и� split()�޼ҵ带 �̿��ؼ� split()�޼ҵ尡 �����ϴ� Ÿ��
  	String[]temp=str1.split("");
  	System.out.println(temp.length);
	 
  	String str3= "ab cd ef";
  	String[]tempArr=str3.split(" ");
	System.out.println(tempArr.length);
	//pp��� ���ڸ� ã�Ƽ� @@�ٲ㺸��
	System.out.println(str1.replaceAll("pp", "@@"));
	//trim():�ڿ� ���� ����
	String trimStr1="	abc	def";
	System.out.println(trimStr1.trim().replaceAll("", ""));
	//��
	String eqStr1="A";
	String eqStr2= new String("A");
	if(eqStr1.equals(eqStr2)) {
		System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
	
	
	}
}
