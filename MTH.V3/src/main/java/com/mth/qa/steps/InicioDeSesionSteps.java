package com.mth.qa.steps;

import com.mth.qa.pageobjects.InicioDeSesionPageObject;

import PruebaKraken.KrakenWeb;

public class InicioDeSesionSteps extends KrakenWeb {
	
	
	InicioDeSesionPageObject inicioPOM = new InicioDeSesionPageObject();

	public void abrirmth() {
		configuracionesIniciales();
		abrirNavegadorEn(inicioPOM);

	}

	public void escribirUsuario(String usuario) {
		escribirTexto(inicioPOM.getTxtUsuario(), usuario);
	}

	public void escribirClave(String clave) {
		escribirTexto(inicioPOM.getTxtClave(), clave);
	}

	public void darClicLogin() {
		click(inicioPOM.getBtnLogin());
		esperar(3);
	}

	public void darClicCallCenter() {
		click(inicioPOM.getBtnCallCenter());
		esperar(2);
	}

}
