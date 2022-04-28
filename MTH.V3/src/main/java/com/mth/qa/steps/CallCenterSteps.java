package com.mth.qa.steps;

import com.mth.qa.pageobjects.CallCenterPageObject;
import com.mth.qa.pageobjects.InicioDeSesionPageObject;

import PruebaKraken.KrakenWeb;

public class CallCenterSteps extends KrakenWeb {

	InicioDeSesionPageObject inicioPOM = new InicioDeSesionPageObject();
	CallCenterPageObject callPOM = new CallCenterPageObject();

	public void abrirMTH() {
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
	
	public void abrirCall() {
		configuracionesIniciales();
		abrirNavegadorEn(callPOM);
	}
	
	
	public void escribirNumero(String numero) {
		escribirTexto(callPOM.getTxtNumero(), numero);
	}

	public void darClicConuslta() {
		click(callPOM.getBtnConsulta());
		esperar(2);
	}

	public void darClicMensajesCall() {
		click(callPOM.getBtnMensajesCall());
		esperar(2);
	}

	public void darClicBuscar() {
		click(callPOM.getBtnBuscar());
		esperar(5);
	}

}
