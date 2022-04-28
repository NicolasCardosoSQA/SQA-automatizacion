package com.mth.qa.stepdefinitions;

import java.util.List;

import com.mth.qa.models.Datos;
import com.mth.qa.models.Usuario;
import com.mth.qa.steps.CallCenterSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CallCenterStepDefinitions {
	@Steps
	CallCenterSteps callcenterStep;

	@Given("^Ingreso a MTH$")
	public void ingresoAMTH() {
		callcenterStep.abrirMTH();

	}

	@When("^Escribo las credenciales de logeo$")
	public void escriboLasCredencialesDeLogeo(List<Usuario> listaUsuario) {
		callcenterStep.escribirUsuario(listaUsuario.get(0).getUsuario());
		callcenterStep.escribirClave(listaUsuario.get(0).getClave());
		callcenterStep.darClicLogin();
	}

	@Then("^Ingreso el numero a consultar$")
	public void ingresoElNumeroAConsultar(List<Datos> listaDatos) {
		callcenterStep.abrirCall();
		callcenterStep.escribirNumero(listaDatos.get(0).getNumerosuscriptor());
		callcenterStep.darClicConuslta();
		callcenterStep.darClicMensajesCall();
		callcenterStep.darClicBuscar();
	}

}
