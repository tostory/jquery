package springweb.b01_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springweb.z01_dto.Duck;
import springweb.z01_dto.Man;

public class A07_GenericXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext 
			ctx = new GenericXmlApplicationContext("springweb/b01_di/diexp07_auto.xml");
		Man man=ctx.getBean("man", Man.class);
		man.show();
		Duck d01=ctx.getBean("d1", Duck.class);
		d01.showFly();
		Duck d02=ctx.getBean("d2", Duck.class);
		d02.showFly();		
		
	
	}

}
