package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import springweb.z01_dto.MoviePoint;

@Controller
@SessionAttributes("mvpoint")
public class A09_SessionExp {

	@ModelAttribute("mvpoint")
	public MoviePoint getMvPoint(){
		return new MoviePoint();
	}
	@RequestMapping("/mvlogin.do")
	public String movieLogin(@ModelAttribute("mvpoint") MoviePoint mp){
		String page="a01_basic/a31_mvlogin";
		// �������� ������ ��û������ �޾��� ��.
		if(mp.getPoint()>0){
			// ���� tot������ point���� ����ó��.
			mp.setTot(mp.getTot()-mp.getPoint());
			page="a01_basic/a32_mvpoint";
		// 	�ʱ� �α���..
		}else if(mp.getName()!=null&&mp.getName().equals("ȫ�浿")){
			// �ʱ� �� ����Ʈ ����..
			mp.setTot(10000);
			page="a01_basic/a32_mvpoint";
		}
		
		return page;
	}
	
}
