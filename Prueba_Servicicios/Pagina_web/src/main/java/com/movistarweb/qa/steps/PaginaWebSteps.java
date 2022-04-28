package com.movistarweb.qa.steps;

import com.movistarweb.qa.pageobjects.WebPageObject;

import PruebaKraken.KrakenWeb;

public class PaginaWebSteps extends KrakenWeb {
	WebPageObject webPOM = new WebPageObject();

	public void abrirPagina() {
		configuracionesIniciales();
		abrirNavegadorEn(webPOM);
	}

	public void darClicHabla() {
		click(webPOM.getBtnHabla());
	}

	public void darClicCombos() {
		click(webPOM.getBtnCombos());
	}

	public void darClicIlimidatos() {
		click(webPOM.getBtnIlimidatos());

	}

	public void darClicCompra() {
		click(webPOM.getBtnCompra());
	}

	public void darClicNavega() {
		click(webPOM.getBtnNavega());
	}

	public void escribirAbonado(String abonado) {
		escribirTexto(webPOM.getTxtAbonado(), abonado);
		esperar(15);
	}
	
	public void darClicPago() {
		click(webPOM.getBtnPagar());
	}
}
