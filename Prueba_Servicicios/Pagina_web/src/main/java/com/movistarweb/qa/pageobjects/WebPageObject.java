package com.movistarweb.qa.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://190.13.96.22/prepago/ventas-paquetes/")
public class WebPageObject extends PageObject {

	By btnPrepago = By.xpath("//*[@id=\'PaquetesPrepago\']/div");
	By btnIlimidatos = By.xpath("//*[@id=\"btnIlimiDatos\"]/span");
	By btnCombos = By.xpath("//*[@id=\"btnCombos\"]/span");
	By btnNavega = By.xpath("//*[@id=\"btnNavega\"]/span");
	By btnHabla = By.xpath("//*[@id=\"btnHabla\"]/span");
	By btnCompra = By.xpath("//*[@id=\"navegaModal\"]/div[5]/div[2]/button");
	By txtAbonado = By.xpath("//*[@id=\"phoneNumber\"]");
	By btnPagar = By.xpath("//*[@id=\"btnPagar\"]");

	public By getBtnPagar() {
		return btnPagar;
	}

	public By getTxtAbonado() {
		return txtAbonado;
	}

	public By getBtnCompra() {
		return btnCompra;
	}

	public By getBtnPrepago() {
		return btnPrepago;
	}

	public By getBtnIlimidatos() {
		return btnIlimidatos;
	}

	public By getBtnCombos() {
		return btnCombos;
	}

	public By getBtnNavega() {
		return btnNavega;
	}

	public By getBtnHabla() {
		return btnHabla;
	}

}
