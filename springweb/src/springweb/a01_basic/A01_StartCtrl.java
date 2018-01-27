package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.z01_dto.Exam;
import springweb.z01_dto.Member;

// �޸𸮿� �ε��ϱ�
// 1. �� Ŭ���� �������� annotation����  Controller ����
// 2. dispather.xml�� xml��� ������� bean ���
// springweb.a01_basic.A01_StartCtrl
@Controller
public class A01_StartCtrl {
	// http://localhost:6080/springweb/start.do
	// ȣ��� �޼���.. annotation���� RequestMapping("������ ȣ���")
	
	@RequestMapping("/start.do")
	public String start(){
//		1. ��û��..
//		2. business login ó�� (service�� ���ؼ� model)
//		3. view�� ȣ��..
		return "a01_basic/a01_start"; //ȭ��� ȣ��..
	}
	// http://localhost:6080/springweb/sendForw.do?id=himan&pass=7777
	@RequestMapping("/sendForw.do")
	public String sendForw(Member mem, Model d){
//		1. ��û�� ó��..
		System.out.println(mem.getId()+":"+mem.getPass());
//		2. �𵨵����� ó��
//		   msg  "id @@@ �̰�, password @@@ �Դϴ�!!"
		d.addAttribute("msg", "id "+mem.getId()+" �̰�, password "+
				mem.getPass()+" �Դϴ�!!");
		// view�� : ${msg}
		return "a01_basic/a02_send";
	}
	// �α��� �ʱ� ȭ��..http://localhost:6080/springweb/login.do
	@RequestMapping("/login.do")
	public String login(){
		return "a01_basic/a03_login";
	}
	// �α��� üũ ó��  http://localhost:6080/springweb/loginck.do
	@RequestMapping("/loginck.do")
	public String loginck(Member mem, Model d){
		String page="a03_login";
		d.addAttribute("msg", mem.getId()+"�� ������ ���̵� �ƴմϴ�!");
		if(mem.getId().equals("himan")&&mem.getPass().equals("7777")){
			page="a04_login_succ";
			d.addAttribute("msg", mem.getId()+"�� �������!!");
		}
		return "a01_basic/"+page;
	}
	@RequestMapping("/exam.do")
	public String exam(Model d){
		Exam mem = new Exam();
		mem.setNum01((int)(Math.random()*10));
		mem.setNum02((int)(Math.random()*10));
		d.addAttribute("exam", mem);
		
		return "a01_basic/a05_exam";
	}
	// �α��� üũ ó��  http://localhost:6080/springweb/examck.do
	@RequestMapping("/examck.do")
	public String examck(Exam mem, Model d){
		String page="a05_exam";
		d.addAttribute("msg", "�����Դϴ�.");
		if((mem.getNum01()+mem.getNum02())==mem.getInputdata()){
			page="a06_pass";
			d.addAttribute("msg","pass");
		}
		return "a01_basic/"+page;
	}	

}










