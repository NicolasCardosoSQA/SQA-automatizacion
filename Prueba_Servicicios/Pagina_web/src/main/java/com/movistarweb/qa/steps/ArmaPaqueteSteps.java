package com.movistarweb.qa.steps;

import com.movistarweb.qa.pageobjects.ArmaPaquetePageObject;

import PruebaKraken.KrakenWeb;

public class ArmaPaqueteSteps extends KrakenWeb {

	ArmaPaquetePageObject ArmaPOM = new ArmaPaquetePageObject();

	public void abrirPagina() {
		configuracionesIniciales();
		abrirNavegadorEn(ArmaPOM);
	}

	public void clicArmaPaquete() {
		click(ArmaPOM.getBtnArmaPaquete());
	}

	public void clicBtnNavega() {
		click(ArmaPOM.getBtnNavega());
	}

	public void clicBtnMinutos() {
		click(ArmaPOM.getBtnMinutos());
	}

	public void clicBtnVigencia() {
		click(ArmaPOM.getBtnVigencia());
		esperar(10);
	}
}
