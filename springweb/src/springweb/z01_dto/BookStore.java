package springweb.z01_dto;

public class BookStore {
	private String bsname;
	private Book bk;
	public BookStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookStore(Book bk) {
		this.bk = bk;
	}
	public void setBsname(String bsname) {
		this.bsname = bsname;
	}
	public void displayBook(){
		System.out.println(bsname+" �������� ");
		if(bk!=null){
			System.out.println("���� �����ϴ� ������ ");
			System.out.println(bk.getName());
			System.out.println("������ "+bk.getPrice()+"��");
		}
	}
	
}
