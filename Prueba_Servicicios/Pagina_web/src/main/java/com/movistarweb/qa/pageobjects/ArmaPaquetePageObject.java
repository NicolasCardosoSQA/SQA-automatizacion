package com.movistarweb.qa.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://190.13.96.22/prepago/ventas-paquetes/")
public class ArmaPaquetePageObject extends PageObject {

	By btnArmaPaquete = By.xpath("//*[@id=\"ArmaTuPaquete\"]/div/span[1]");
	By btnNavega = By.xpath("//span[contains(.,'2.5GB')]");
	By btnMinutos = By.xpath("//span[contains(.,'10 Min.')]");
	By btnVigencia = By.xpath("//div[4]/div[2]/div");

	public By getBtnNavega() {
		return btnNavega;
	}

	public By getBtnMinutos() {
		return btnMinutos;
	}

	public By getBtnVigencia() {
		return btnVigencia;
	}

	public By getBtnArmaPaquete() {
		return btnArmaPaquete;
	}
}
