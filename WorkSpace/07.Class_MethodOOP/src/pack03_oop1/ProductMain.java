package pack03_oop1;

public class ProductMain {
public static void main(String[] args) {
//	Product pro =new Product(1,"��ǻ��");
//	pro.num=1;
//	pro.name="��ǻ��";
//	pro.display();
//	Product pro1 =new Product(2,"��ǻ��");
//	pro1.num=2;
//	pro1.name="��Ʈ��";
//	pro1.display();
	
	ProductDTO dto = new ProductDTO();
	dto.num=1;
	dto.name="��ǻ��";	
	
	ProductDTO dto2=new ProductDTO();
	dto2.name="��Ʈ��";
	dto2.num=2;
	
	ProductDAO dao = new ProductDAO();
	dao.display(dto);
	//dao.display(dto2);
	
}

}
