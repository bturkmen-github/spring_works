package com.bturkmen.work1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext_forWork1.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)factory.getBean("studentbean");  
	    student.dispalyInfo();
	    
	    
	    ApplicationContext context =   
	    	    new ClassPathXmlApplicationContext("applicationContext_forWork1.xml");  

	    Student student2=(Student)context.getBean("studentbean");
	    student2.dispalyInfo();
	}

}
