package springweb.b01_di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import springweb.z01_dto.Person;

public class A01_DI_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*xml �ε�*/
		Resource rs = new ClassPathResource("springweb/b01_di/diexp01.xml");
//		BeanFactory : bean��ü ȣ��.
//		XmlBeanFactory : xml�� �ִ� bean ȣ��.
		BeanFactory bean = new XmlBeanFactory(rs);
//		�ش� bean id������ �ε�.. xml id="p"
		Person p = (Person)bean.getBean("p");
		System.out.println("�̸�:"+p.getName());
		System.out.println("����:"+p.getAge());
		
	}

}
