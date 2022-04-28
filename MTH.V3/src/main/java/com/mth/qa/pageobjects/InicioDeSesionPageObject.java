package com.mth.qa.pageobjects;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://10.203.5.38/ADMAdmin/login/login.view")

public class InicioDeSesionPageObject extends PageObject {

	By txtUsuario = By.xpath("//*[@id='f1:i1']");
	By txtClave = By.xpath("//*[@id='f1:i2']");
	By btnLogin = By.xpath("//*[@id='f1:j_id28']");
	By btnCallCenter = By.xpath("//div[@id='_mf:b_id3050']/span[2]");
	
	
	public By getBtnCallCenter() {
		return btnCallCenter;
	}

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
