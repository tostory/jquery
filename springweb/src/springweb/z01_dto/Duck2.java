package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;


public class Duck2 {
	private String type;
	public Duck2(){
		type="���";
	}
	// �ش� �����⳻�� LakeFlying�� ������ type�� �ε��Ǿ� ������
	// �ڵ����� �Ҵ��ϼ���!!
	@Autowired
	private LakeFlying fly01; // fly01 = new LakeFlying();
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void showFly(){
		System.out.println(type+"������ ");
		if(fly01!=null){
			fly01.fly();
		}
	}
	
	
}
