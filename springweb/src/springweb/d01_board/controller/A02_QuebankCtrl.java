package springweb.d01_board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.d01_board.service.A02_QuestBankService;
import springweb.d01_board.vo.Quebank;

@Controller
@RequestMapping("/questbank.do")
public class A02_QuebankCtrl {
	@Autowired(required=false)
	private A02_QuestBankService service;
	
//	http://localhost:6080/springweb/questbank.do?method=list
	@RequestMapping(params="method=list")
	public String quebank(Quebank sch, Model d){
		d.addAttribute("quelist", service.listQuebank(sch));
		return "/d01_board/a11_quebankList";
	}
//	method=insert
	@RequestMapping(params="method=insert")
	public String insert(){
		return "/d01_board/a12_quebankInsert";
	}
	@RequestMapping(params="method=insProc")
	public String insert(Quebank ins){
		System.out.println("�Է¹���:"+ins.getQue());
		
		
		
		service.insertQuebank(ins);
		// �Է�ó���� ������ ��ȸ controller�� ȣ���϶�!!
		return "redirect:/questbank.do?method=list";
	}
}
