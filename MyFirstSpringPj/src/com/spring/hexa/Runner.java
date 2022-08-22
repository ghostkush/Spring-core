package com.spring.hexa;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.spring.hexa.Student;

public class Runner {
	public static void main(String args[]) {
		BeanFactory factory =new DefaultListableBeanFactory();
		
		BeanDefinitionRegistry reg =(BeanDefinitionRegistry) factory;
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(reg);
		
		reader.loadBeanDefinitions(new ClassPathResource("student-config.xml"));
		
		Student student = (Student)factory.getBean("studentbean");
		student.displayInfo();
	}
}
