package springweb.b01_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springweb.z01_dto.Person;
import springweb.z01_dto.Product;

public class A06_GenericXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext 
			ctx = new GenericXmlApplicationContext("springweb/b01_di/diexp06.xml");
		Person p01=ctx.getBean("p01", Person.class);
		System.out.println(p01.getName()+":"+p01.getAge());
		Product prd01
		=ctx.getBean("prd01", Product.class);
		System.out.println(prd01.getPname()+":"+prd01.getPrice());

		
	}

}
