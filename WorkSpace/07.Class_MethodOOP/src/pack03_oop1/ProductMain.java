package pack03_oop1;

public class ProductMain {
public static void main(String[] args) {
//	Product pro =new Product(1,"컴퓨터");
//	pro.num=1;
//	pro.name="컴퓨터";
//	pro.display();
//	Product pro1 =new Product(2,"컴퓨터");
//	pro1.num=2;
//	pro1.name="노트북";
//	pro1.display();
	
	ProductDTO dto = new ProductDTO();
	dto.num=1;
	dto.name="컴퓨터";	
	
	ProductDTO dto2=new ProductDTO();
	dto2.name="노트북";
	dto2.num=2;
	
	ProductDAO dao = new ProductDAO();
	dao.display(dto);
	//dao.display(dto2);
	
}

}
