package com.rest.resta;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaController {
	protected Logger logger = Logger.getLogger(RestaController.class
			.getName());

	@RequestMapping("/restar")
	public String doRestar(@RequestParam(value="restador1") String sOperando1,
			@RequestParam(value="restador2") String sOperando2) {

		int iOperando1 = Integer.valueOf(sOperando1);
		int iOperando2 = Integer.valueOf(sOperando2);
		int resultado = iOperando1 - iOperando2;

		return "{\"iOperando1\":\"" + sOperando1 + "\", \"iOperando2\":\"" + sOperando2 + "\", \"resultado\": \"" + resultado + "\"}";
	}
}
