package com.mth.qa.steps;

import com.mth.qa.pageobjects.CompraRequestPageObject;
import com.mth.qa.pageobjects.InicioDeSesionPageObject;

import PruebaKraken.KrakenWeb;

public class CompraRequestSteps extends KrakenWeb {
	CompraRequestPageObject RequestPOM = new CompraRequestPageObject();
	InicioDeSesionPageObject inicioPOM = new InicioDeSesionPageObject();

	public void abrirmth() {
		configuracionesIniciales();
		abrirNavegadorEn(inicioPOM);

	}

	public void darClicLogin() {
		click(inicioPOM.getBtnLogin());
		esperar(3);
	}

	public void escribirUsuario(String usuario) {
		escribirTexto(inicioPOM.getTxtUsuario(), usuario);
	}

	public void escribirClave(String clave) {
		escribirTexto(inicioPOM.getTxtClave(), clave);
	}

	public void abriTest() {
		configuracionesIniciales();
		abrirNavegadorEn(RequestPOM);
	}

	public void escribirFuente(String fuente) {
		limpiarCampo("//*[@id=\"j_id2\"]/input[2]");
		escribirTexto(RequestPOM.getTxtSource(), fuente);
	}

	public void escribirCodigoCorto(String codigocorto) {
		limpiarCampo("//*[@id=\"j_id2\"]/input[3]");
		escribirTexto(RequestPOM.getTxtShortCut(), codigocorto);
	}

	public void escribirNumeroSuscriptor(String numerosuscriptor) {
		limpiarCampo("//*[@id=\"j_id2\"]/input[4]");
		escribirTexto(RequestPOM.getTxtSubscriberNumber(), numerosuscriptor);
	}

	public void escribirMensajeTexto(String mensajetexto) {
		limpiarCampo("//*[@id=\"j_id2\"]/input[5]");
		escribirTexto(RequestPOM.getTxtRequestText(), mensajetexto);
		esperar(5);
	}
	
	public void clicProbar () {
		click(RequestPOM.getBtnProbar());
		esperar(2);
	}
	
}
