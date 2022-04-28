package com.mth.qa.pageobjects;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://10.203.5.38/ADMAdmin/test/test1.view")

public class CompraRequestPageObject extends PageObject {

	By txtSource = By.xpath("//*[@id=\"j_id2\"]/input[2]");
	By txtShortCut = By.xpath("//*[@id=\"j_id2\"]/input[3]");
	By txtSubscriberNumber = By.xpath("//*[@id=\"j_id2\"]/input[4]");
	By txtRequestText = By.xpath("//*[@id=\"j_id2\"]/input[5]");
	By btnProbar = By.xpath("//*[@id=\"j_id2\"]/input[6]");

	public By getBtnProbar() {
		return btnProbar;
	}

	public By getTxtSource() {
		return txtSource;
	}

	public By getTxtShortCut() {
		return txtShortCut;
	}

	public By getTxtSubscriberNumber() {
		return txtSubscriberNumber;
	}

	public By getTxtRequestText() {
		return txtRequestText;
	}

}
