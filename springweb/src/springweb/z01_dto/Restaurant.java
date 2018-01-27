package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {
	private String name;
	
	@Autowired
	private Food menu;
	
	public Restaurant(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void eatLunch(){
		System.out.println("���� ������ "+name+"�� ����");
		System.out.println(menu.getMenu()+"�� "+menu.getPrice()+"������ �Ա�� �ߴ�!!");
	}

	
}
