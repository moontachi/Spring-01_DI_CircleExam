package sample4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Sample4Main {

	public static void main(String[] args) {
//		CalcImpl calc = new CalcImpl(2);
//		calc.setSu1(3);
//		
//		calc.calculate();
		
		Resource resource = new ClassPathResource("calcTest.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);//빈을만들어서 팩토리에서 관리
		
		CalcImpl ci = (CalcImpl)factory.getBean("calc");
		ci.calculate();
	}

}
