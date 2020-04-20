package com;

import io.corp.calculator.TracerImpl;

public class StaticFactoryBuilder {

	//para prohibir que se instacie esta clase
	private StaticFactoryBuilder(){
		
	}
	public static final TracerImpl LOGGER = new TracerImpl();
	
	
	
}