package com.altamira.qa.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://10.203.12.9:7071/AltamirA/bowe/bw_co_Forward")
public class InicioDeSesionpageObject extends PageObject {
	By txtUsuario = By.name("usuario");
	By txtClave = By.name("password");
	By btnLogin = By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/center/table/tbody/tr[5]/td/input[2]");

	public By getTxtUsuario() {
		return txtUsuario;
	}

	public By getTxtClave() {
		return txtClave;
	}

	public By getBtnLogin() {
		return btnLogin;
	}

}
