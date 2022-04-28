package com.movisarweb.qa.stepdefinitions;

import java.util.List;

import com.movistarweb.qa.models.Numero_Abonado;
import com.movistarweb.qa.steps.ArmaPaqueteSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ArmaPaqueteStepDefinitions {
	
	@Steps 
	ArmaPaqueteSteps armaSteps;
	@Given ("^ingreso a modulo arma tu paquete$")
	public void ingreso_a_modulo_arma_tu_paquete() {
		armaSteps.abrirPagina();
		armaSteps.clicArmaPaquete();
		armaSteps.clicBtnMinutos();
		armaSteps.clicBtnNavega();
		armaSteps.clicBtnVigencia();
		
	}

	@When("^ingreso el numero$")
	public void ingreso_el_numero(List<Numero_Abonado> listaNumero_Abondo) {

	}
	@Then("^se redirige a epayco$")
	public void ingresoALaPagina() {

	}
}
