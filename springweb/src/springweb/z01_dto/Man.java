package springweb.z01_dto;
// springweb.z01_dto.Man
public class Man {
	private Woman woman;
	private String name;
	private String loc;
	
	public Woman getWoman() {
		return woman;
	}
//	autowire �Ӽ��� bean�� id�� woman�� ���� �� �Ҵ�..
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public void show(){
		System.out.println("�̸�:"+name);
		System.out.println("��� ��:"+loc);
		if(woman!=null){
			System.out.println("�׳�� !!!!");
			System.out.println("�̸�:"+woman.getName());
			System.out.println("����:"+woman.getAge());
			System.out.println("��°�:"+woman.getLoc());
		}
	}
	
}
