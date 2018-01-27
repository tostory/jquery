package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class A07_ForRedCtrl {
	// ����Ʈ ȣ��
	@RequestMapping("/redirect01.do")
	public String redirect01(){
		return "redirect:http://www.naver.com";
	}
//	���� controller ȣ��..
	@RequestMapping("/redirect02.do")
	public String redirect02(){
		
		return "redirect:/start.do";
	}
//	���� �ڿ� ȣ�� jsp page ȣ��..
	@RequestMapping("/redirect03.do")
	public String redirect03(){
		return "redirect:/index";
	}
//	���� �ڿ� ȣ�� 1
//	http://localhost:6080/springweb/redEmp2.do?ename=F
//	redirect�� �����Ͱ����� ��û������ �ѱ��� X	

	@RequestMapping("/redEmp.do")
	public String redEmp(){
		return "redirect:/emplist.do";
	}
//	���� �ڿ� ȣ�� 2
//	http://localhost:6080/springweb/forEmp.do?ename=F
//	��û���� �Ѱ����� ���� Ȯ���� �� �ִ�.
@RequestMapping("/forEmp.do")
	public String forEmp(){
		return "forward:/emplist.do";
	}	
	
	@RequestMapping("/callingSel.do")
	public String initCall(@RequestParam(value="sel", defaultValue="0") 
	                          int choiceNum ){
		String page="a01_basic/a24_initPage";
		if(choiceNum==1){
			page="redirect:/buyProduct.do";
		}else if(choiceNum==2){
			page="forward:/buyProduct.do";
		}
		
		return page;
	}	
	

}
