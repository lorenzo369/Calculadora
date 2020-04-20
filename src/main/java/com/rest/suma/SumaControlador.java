package com.rest.suma;

import static com.StaticFactoryBuilder.OPERACION;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaControlador {

	@GetMapping("/sumar")
	public String doSumar(@RequestParam(value="operando1") String operando1,
			@RequestParam(value="operando2") String operando2) {

		return OPERACION.sumar(operando1, operando2);	
	}
}
