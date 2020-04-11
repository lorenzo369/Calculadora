package com.rest.suma;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaControlador {

	protected Logger logger = Logger.getLogger(SumaControlador.class
			.getName());

	@RequestMapping("/sumar")
	public String doSumar(@RequestParam(value="operando1") String operando1,
			@RequestParam(value="operando2") String operando2) {

		int iOperando1 = Integer.valueOf(operando1);
		int iOperando2 = Integer.valueOf(operando2);
		int suma = iOperando1 + iOperando2;

		return "{\"operando1\":\"" + operando1 + "\", \"operando2\":\"" + operando2 + "\", \"suma\": \"" + suma + "\"}";
	}
}
