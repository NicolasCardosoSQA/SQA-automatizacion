package com.movisarweb.qa.stepdefinitions;

import java.util.List;

import com.movistarweb.qa.models.Numero_Abonado;
import com.movistarweb.qa.models.Numero_Abonados;
import com.movistarweb.qa.steps.ArmaPaqueteSteps;
import com.movistarweb.qa.steps.PaginaWebSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PaginaWebStepDefinitions {

	@Steps
	PaginaWebSteps webSteps;
	

	@Given("^que estoy en la pagina de movistar web$")
	public void que_estoy_en_la_pagina_de_movistar_web() {
		webSteps.abrirPagina();
		webSteps.darClicHabla();
		webSteps.darClicIlimidatos();
		webSteps.darClicNavega();
		webSteps.darClicCompra();
	}

	@When("^ingreso el numero del abonado$")
	public void ingresoElNumeroDelAbonado(List<Numero_Abonados> listaNumero_Abonados) {
		}




	@Then("^se redirige a epayco$")
	public void ingresoALaPagina() {

	}
}
