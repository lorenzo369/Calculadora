package com.rest.resta;

import static com.StaticFactoryBuilder.OPERACION;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaController {

	@GetMapping(value="/restar")
	public String doRestar(@RequestParam(value="restador1") String sOperando1,
			@RequestParam(value="restador2") String sOperando2) {

		return OPERACION.restar(sOperando1, sOperando2);
	}
}
