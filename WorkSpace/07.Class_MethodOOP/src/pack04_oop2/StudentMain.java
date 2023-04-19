package pack04_oop2;

import pack03_oop1.ProductDTO;

public class StudentMain {
	public static void main(String[] args) {
//	Student stu= new Student();
//	  stu.number=1;
//	  stu.name="이선준";
//	  stu.en=100;
//	  stu.kor=100;
//	  stu.mat=100;
//	  stu.sum=stu.mat+stu.en+stu.kor;
//	  stu.avg=stu.sum/3;
//	  System.out.println(stu.number);
//	  System.out.println(stu.name);
//	  System.out.println(stu.en);
//	  System.out.println(stu.kor);
//	  System.out.println(stu.mat);
//	  System.out.println(stu.sum);
//	  System.out.println(stu.avg);
		StudentDTO dto1=new StudentDTO("이선준", 1, 100, 100, 100);
		StudentDAO dao=new StudentDAO();
		dao.display(dto1);
	}

	
	
	
	
	
}
