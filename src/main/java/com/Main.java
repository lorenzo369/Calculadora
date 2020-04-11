package com;

import com.registro.EurekaServer;
import com.rest.suma.SumaServer;
import com.rest.resta.RestaServer;
import com.web.WebServer;

public class Main {
	public static void main(String[] args) {

		String nombreServidor = "";

		switch (args.length) {
		case 2:
			System.setProperty("server.port", args[1]);
		case 1:
			nombreServidor = args[0].toLowerCase();
			break;

		default:
			return;
		}

		if (nombreServidor.equals("eureka")) {
			EurekaServer.main(args);
		} else if (nombreServidor.equals("suma")) {
			SumaServer.main(args);
		} else if (nombreServidor.equals("resta")) {
			RestaServer.main(args);
		} else if (nombreServidor.equals("web")) {
			WebServer.main(args);
		} else {
			System.out.println("Tipo de servidor desconocido: " + nombreServidor);
		}
	}
}
