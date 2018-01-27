package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// springweb.z01_dto.Robot
//
public class Robot {
	private String kind;
	// �� Weapon�� �����⿡�� �Ҵ��� �� �ִ� 
	// type���� �Ҵ�ó�� �ϼ���.==> Autowired
	// Ȥ��, �����⿡ �ش� ��ü�� ������ �����߻�
	// ���� �ʵ��� ���ּ��� ==> required=false
	// �Ҵ��� ��ü�� ��ġ�� ���� ���� bean�� id������
	// �Ҵ��� �ּ��� ==>Qualifier
	@Autowired(required=false)
	@Qualifier("laserbim")
	private Weapon wp;

	public Robot(String kind) {
		super();
		this.kind = kind;
	}
	public void showAttack(){
		if(wp!=null){
			System.out.println(kind+" �κ��� ");
			wp.attack();
		}
	}
	
}
