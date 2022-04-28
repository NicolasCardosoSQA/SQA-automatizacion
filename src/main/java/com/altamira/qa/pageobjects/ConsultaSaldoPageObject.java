package com.altamira.qa.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://10.203.12.9:7071/AltamirA/bowe/bw_co_CargaConsultaSaldo?ID=infoConsultaSaldo")
public class ConsultaSaldoPageObject extends PageObject {
	By BtnMoviStar = By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td/a/font");
	By BtnConsulta = By.xpath(
			"/html/body/form[1]/table[2]/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr/td[4]/a/div/table/tbody/tr/td/font");
	By TxtNumero = By.name("nTelefono");
	By BtnBuscar = By.id("Buscar");

	public By getBtnMoviStar() {
		return BtnMoviStar;
	}

	public By getBtnConsulta() {
		return BtnConsulta;
	}

	public By getTxtNumero() {
		return TxtNumero;
	}

	public By getBtnBuscar() {
		return BtnBuscar;
	}

}
