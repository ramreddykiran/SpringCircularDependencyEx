package com.spring.services.demo1;

public class ParentClass {
	
	private DependentClass dependentClass;

	/*public ParentClass(DependentClass dependentClass) {
		System.out.println("DependentClass constructor");
		this.dependentClass = dependentClass;
	}*/  //it will give circular dependency exception as ParentClass depends on DependentClass and vice-versa
	
	public void setDependentClass(DependentClass dependentClass){
		this.dependentClass = dependentClass;
	}
	

}
