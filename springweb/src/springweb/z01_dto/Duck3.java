package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Duck3 {
	private String type;
//	���εǴ� Ŭ������ �ϳ��� �ְ� ó���ϱ� ���ؼ�
	@Autowired(required=false)
	@Qualifier("flyway02")
	private Flyway fly;
	/*
	Flyway f01 = new LakeFlying();
	Flyway f02 = new SeaFlying();
	 * 
	 * */	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void showFly(){
		System.out.println(type + "������");
		if(fly!=null){
			fly.fly();
		}

	}
}
