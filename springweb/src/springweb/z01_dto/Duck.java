package springweb.z01_dto;
// springweb.z01_dto.Duck
// springweb.z01_dto.Flyway
// springweb.z01_dto.LakeFlying
// springweb.z01_dto.SeaFlying
public class Duck {
	private String type;
	private Flyway fly;
	
	// �����ڿ��� SeaFlying �Ҵ�
	public Duck(SeaFlying fly) {
		this.fly = fly;
	}
	// �޼��忡�� LakeFlying �Ҵ�
	// Flyway fly1 = new LakeFlying();
	// Flyway fly2 = new SeaFlying();
	public void setFly(LakeFlying fly) {
		this.fly = fly;
	}	
	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Flyway getFly() {
		return fly;
	}

	public void showFly(){
		System.out.println(type + "������");
		if(fly!=null){
			fly.fly();
		}
	}
}
interface Flyway{
	void fly();
}
/*
Flyway f01 = new LakeFlying();
Flyway f02 = new SeaFlying();
 * 
 * */

class LakeFlying implements Flyway{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("ȣ�� ���� ������!!");
	}
} 
class SeaFlying implements Flyway{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�ٴ� ���� �����!!");
	}
} 
