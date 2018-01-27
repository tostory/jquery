package springweb.z01_dto;

import java.util.ArrayList;

// springweb.z01_dto.Mart
public class Mart {
	private String name;
	private Product product;
	private ArrayList<Product> productList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	public void selling(){
		System.out.println("�������!!! "+name+"��Ʈ �Դϴ�.");
		if(product!=null){
			System.out.println("������ ��õ ����");
			System.out.println(product.getPname()+", "+
					product.getPrice()+"������ ��ʴϴ�!!");
		}
		
		if(productList!=null&&productList.size()>0){
			System.out.println("���Ź���!!");	
			for(Product prod:productList){
				System.out.print(prod.getPname()+"\t");
				System.out.print(prod.getPrice()+"\n");
			}
		}
		
		
	}
}
