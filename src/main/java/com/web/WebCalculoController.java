package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.StaticFactoryBuilder.LOGGER;

import io.corp.calculator.TracerImpl;

@Controller
public class WebCalculoController {
	@Autowired
	protected WebSumaService sumaService;

	@Autowired
	protected WebRestaService restaService;
	
	
	public WebCalculoController(WebSumaService sumaService, WebRestaService restaService) {
		this.sumaService = sumaService;
		this.restaService = restaService;
	}

	@GetMapping("/suma")
	public String doSuma(@RequestParam(defaultValue="0") String operando1,
			@RequestParam(defaultValue="0") String operando2,
			Model model) {

		String suma = sumaService.sumar(operando1, operando2);

		LOGGER.trace("Suma: " + suma);
		model.addAttribute("json", suma);

		return "suma";
	}

	@GetMapping("/resta")
	public String doResta(@RequestParam(defaultValue="0") String restador1,
			@RequestParam(defaultValue="0") String restador2,
			Model modelo) {

		String resultado = restaService.restar(restador1, restador2);
		
		
		
		LOGGER.trace("Resultado: " + resultado);
		modelo.addAttribute("json", resultado);

		return "resultado";
	}
}
