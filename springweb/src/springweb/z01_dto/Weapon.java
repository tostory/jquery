package springweb.z01_dto;
//springweb.z01_dto.Robot
//springweb.z01_dto.Rocket
//springweb.z01_dto.Laserbim
//

public interface Weapon {
	void attack();
}
// Weapon w1 = new Rocket();
// Weapon w2 = new Laserbim();  
// Weapon�� implments�ϸ� ��� ��ü�� Weapon�� �Ҵ��� �� �ִ�.
class Rocket implements Weapon{
	@Override
	public void attack() {
		System.out.println("������ �߻�!!");
	}
}
class Laserbim implements Weapon{
	@Override
	public void attack() {
		System.out.println("������ �� �߻�!!");
	}
	
}
