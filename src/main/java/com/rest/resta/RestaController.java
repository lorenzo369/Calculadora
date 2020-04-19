package com.rest.resta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import impl.OperacionesImpl;

@RestController
public class RestaController {

	@GetMapping(value="/restar")
	public String doRestar(@RequestParam(value="restador1") String sOperando1,
			@RequestParam(value="restador2") String sOperando2) {

		OperacionesImpl operacionesImpl = new OperacionesImpl();
		return operacionesImpl.restar(sOperando1, sOperando2);
	}
}
