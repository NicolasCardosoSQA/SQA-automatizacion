package com.altamira.qa.steps;

import com.altamira.qa.pageobjects.ConsultaSaldoPageObject;
import com.altamira.qa.pageobjects.InicioDeSesionpageObject;
import com.sqasa.web.demo.utils.KrakenWeb;

public class ConsultaSaldoSteps extends KrakenWeb {
	ConsultaSaldoPageObject consultaPOM = new ConsultaSaldoPageObject();
	InicioDeSesionpageObject inicioPOM = new InicioDeSesionpageObject();
	
	
	public void abrirAltamira() {
		configuracionesIniciales();
		abrirNavegadorEn(inicioPOM);
	}

	public void escribirUsuario(String usuario) {
		escribirTexto(inicioPOM.getTxtUsuario(), usuario);
	}

	public void escribirClave(String clave) {
		escribirTexto(inicioPOM.getTxtClave(), clave);
	}

	public void clicLogin() {
		click(inicioPOM.getBtnLogin());
	}

	public void clicMoviStar() {
		click(consultaPOM.getBtnMoviStar());

	}

	public void abrirSaldo() {
		configuracionesIniciales();
		abrirNavegadorEn(consultaPOM);
	}
	
	public void escribirInsumo(String insumo) {
		escribirTexto(consultaPOM.getTxtNumero(), insumo);
	}

	public void clicBuscar() {
		click(consultaPOM.getBtnBuscar());
	}

}
