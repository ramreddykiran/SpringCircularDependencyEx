package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.services.demo1.ParentClass;

public class CircularDependencyDemo {
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-context.xml"});
    	ParentClass parentClass1 = (ParentClass) context.getBean("pClass");
    	
    	ParentClass parentClass2 = (ParentClass) context.getBean("pClass");
    	if(parentClass1==parentClass2){
			System.out.println("parent classes are same");
		} else {
			System.out.println("parent classes are different ");
			System.out.println("parentClass1 = "+parentClass1+ "   parentClass2 = " +parentClass2);
		}
		
    	
    	
    }

}
