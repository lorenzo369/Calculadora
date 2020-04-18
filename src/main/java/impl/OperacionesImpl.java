package impl;

import interfaces.Operaciones;

public class OperacionesImpl implements Operaciones {

	@Override
	public String sumar(String operando1, String operando2) {
		int iOperando1 = Integer.valueOf(operando1);
		int iOperando2 = Integer.valueOf(operando2);
		int suma = iOperando1 + iOperando2;

		return "{\"operando1\":\"" + operando1 + "\", \"operando2\":\"" + operando2 + "\", \"suma\": \"" + suma + "\"}";
	}

	@Override
	public String restar(String operando1, String operando2) {
		int iOperando1 = Integer.valueOf(operando1);
		int iOperando2 = Integer.valueOf(operando2);
		int resultado = iOperando1 - iOperando2;

		return "{\"iOperando1\":\"" + operando1 + "\", \"iOperando2\":\"" + operando2 + "\", \"resultado\": \"" + resultado + "\"}";
	}

	

}
