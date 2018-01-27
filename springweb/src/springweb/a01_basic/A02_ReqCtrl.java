package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
// springweb.a01_basic.A02_ReqCtrl
// 1. annotation ����
// 2. ������(dispatcher-servlet.xml)�� ���
@Controller
public class A02_ReqCtrl {
	
//	http://localhost:6080/springweb/reqexp01.do
//	http://localhost:6080/springweb/reqexp01.do?greet1=hi!!
//	http://localhost:6080/springweb/reqexp01.do?greet1=hi!!&greet2=good day!!
//	http://localhost:6080/springweb/reqexp01.do?greet1=hi!!&greet2=good day!!&callNum=25
//	http://localhost:6080/springweb/reqexp01.do?callNum=25
//	?greet1=hi!!&greet2=good!!
	@RequestMapping("/reqexp01.do")
	public String requestCall(
			@RequestParam(value="greet1", defaultValue="�ʱ��λ�!!")
								String greet01,
			@RequestParam(value="greet2", defaultValue="�ʱ��λ�2")
								String greet02,
			@RequestParam(value="callNum", defaultValue="-1")
								int callNum01
						 ){
			System.out.println("��û��1:"+greet01);
			System.out.println("��û��2:"+greet02);
			System.out.println("��û��3(����):"+callNum01);
		
		return "a01_basic/a10_calling";//ȭ��� ȣ��..
	}
	// ���� ���� �ʱ� ȭ�� ȣ��..
//	http://localhost:6080/springweb/buyForm.do
	@RequestMapping("/buyForm.do")
	public String buyForm(){
		return "a01_basic/a11_buyForm";
	}
	// pname=���&price=2
	@RequestMapping(value="/reqBuy.do")
	public String requestBuy(
				@RequestParam(value="pname", defaultValue="")
				String prodName,
				@RequestParam(value="price", defaultValue="0")
				int price,
				@RequestParam(value="cnt", defaultValue="0")
				int cnt,
				Model d
			){
		d.addAttribute("showinfo","���ſ�û ������ �����ϴ�!!");
		// ��û�� ���� ��� ������ ���� ��
		if(!prodName.equals("")&&cnt>0){
			String msg="��û�Ͻ� ������ "+prodName+"�̰�, "
					+ "�ܰ���"+price+"�� �̸�,"
					+ cnt+"���� �Ѻ����  "+(price*cnt)+"�� �Դϴ�!";
			d.addAttribute("showinfo",msg);
		}
		
		return "a01_basic/a12_buyList";
	}
	// ��û ��� ó��
	// 1. get��� �ַ� �ʱ� ȭ�� �ε���, ó��..
//	http://localhost:6080/springweb/calling.do
	@RequestMapping(value="/calling.do", method=RequestMethod.GET)
	public String methodExp(){
		return "/a01_basic/a13_getForm";
	}
	@RequestMapping(value="/calling.do", method=RequestMethod.POST)
	public String methodExp2(){
		return "/a01_basic/a14_postResult";
	}	
	
	
	
	
	
	
	
}










