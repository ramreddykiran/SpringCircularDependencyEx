package com.spring.services.demo1;

public class DependentClass {
	
	private ParentClass parentClass;
	
	/*public DependentClass(ParentClass parentClass){
		System.out.println("DependentClass constructor");
		this.parentClass = parentClass;
	}*/ //it will give circular dependency exception as DependentClass depends on ParentClass and vice-versa
	
	public void setParentClass(ParentClass parentClass){
		this.parentClass = parentClass;
	}
	
}
