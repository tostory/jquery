package springweb.b01_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springweb.z01_dto.Robot;

public class A20_GenericXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext 
			ctx = new GenericXmlApplicationContext("springweb/b01_di/"
					+ "diexp20_auto.xml");
		Robot robot=ctx.getBean("robot", Robot.class);
		robot.showAttack();	
		
	
	}

}
