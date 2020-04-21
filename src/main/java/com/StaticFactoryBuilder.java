package com;

import impl.OperacionesImpl;
import io.corp.calculator.TracerImpl;

/**
 * @author Lorenzo Sánchez
 *	Contenedor de instancias
 */
public class StaticFactoryBuilder {

	//para prohibir que se instacie esta clase
	private StaticFactoryBuilder(){
		
	}
	
	public static final TracerImpl LOGGER = new TracerImpl();
	
	public static final OperacionesImpl OPERACION = new OperacionesImpl();
	
	
	
}