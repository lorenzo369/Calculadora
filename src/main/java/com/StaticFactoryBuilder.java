package com;

import io.corp.calculator.TracerImpl;

public class StaticFactoryBuilder {

	//para prohibir que se instacie esta clase
	private StaticFactoryBuilder(){
		
	}
	//para crear una sola instancia al lugar de una en cada clase que la utiliza
	public static final TracerImpl LOGGER = new TracerImpl();
	
	
	
}