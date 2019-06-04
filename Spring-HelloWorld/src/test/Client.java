package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {
	public static void main(String[] args) {
		// find XML
		Resource resource = new ClassPathResource("resources/spring.xml");
		
		/*
		 * BeanFactory container is creates object at first request so we can say it is
		 * Lazy container
		 */
		
		// load XML into container
		@SuppressWarnings("deprecation")
		BeanFactory beanFactory = new XmlBeanFactory(resource);
			
		// Create Test class object
		Object object = beanFactory.getBean("t");
		Test test = (Test) object;
		test.hello();
	}
}
