package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CircleMain {
	public static void main(String[] args) {
//		double radius = 10.0;
//		Point point = new PointImpl();
//		point.setXpos(3.0);
//		point.setYpos(4.0);
//		
//		Circle circle = new CircleImpl(radius,point);
//		circle.display();
		
		Resource resource = new ClassPathResource("abc.xml"); // bean 설정한 xml파일 이름 적기.
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Circle circle = (Circle)factory.getBean("circle");// circle 이름인 객체를 가져와라 xml에서
		circle.display();
		
		Point point = (Point)factory.getBean("point");
		System.out.println("point.getXpos() :" + point.getXpos());
		System.out.println("point.getYpos() :" + point.getYpos());
	}
}

/* DI : Dependecy Injection */