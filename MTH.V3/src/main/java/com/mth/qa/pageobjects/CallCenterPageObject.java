package com.mth.qa.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://10.203.5.38/ADMAdmin/callcenter/CallcenterSubscriber.view")

public class CallCenterPageObject extends PageObject {

	By txtNumero = By.xpath("//input[@id='f1:itcc1']");
	By btnConsulta = By.xpath("//*[@id=\"f1:cmdsubs\"]");
	By btnMensajesCall = By.xpath("//*[@id=\"f1:acom\"]");
	By btnBuscar = By.xpath("//*[@id=\"j_id918:j_id920:j_id930\"]");

	
	public By getTxtNumero() {
		return txtNumero;
	}


	public By getBtnConsulta() {
		return btnConsulta;
	}


	public By getBtnMensajesCall() {
		return btnMensajesCall;
	}


	public By getBtnBuscar() {
		return btnBuscar;
	}
	
}
