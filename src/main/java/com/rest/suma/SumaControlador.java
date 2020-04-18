package com.rest.suma;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import impl.OperacionesImpl;

@RestController
public class SumaControlador {

	protected Logger logger = Logger.getLogger(SumaControlador.class
			.getName());

	@GetMapping("/sumar")
	public String doSumar(@RequestParam(value="operando1") String operando1,
			@RequestParam(value="operando2") String operando2) {

		OperacionesImpl operacionesImpl = new OperacionesImpl();
		return operacionesImpl.sumar(operando1, operando2);
	
	}
}
