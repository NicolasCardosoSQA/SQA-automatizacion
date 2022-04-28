package com.altamira.qa.steps;

import com.altamira.qa.pageobjects.InicioDeSesionpageObject;
import com.sqasa.web.demo.utils.KrakenWeb;

public class InicioDeSesionSteps extends KrakenWeb {
	InicioDeSesionpageObject inicioPOM = new InicioDeSesionpageObject();

	public void abrirAltamira() {
		configuracionesIniciales();
		abrirNavegadorEn(inicioPOM);
	}

	public void escribirUsuario(String usuario) {
		escribirTexto(inicioPOM.getTxtUsuario(), usuario);
	}

	public void escribirClave(String clave) {
		escribirTexto(inicioPOM.getTxtClave(), clave);
	}

	public void clicLogin() {
		click(inicioPOM.getBtnLogin());
	}
	
}
