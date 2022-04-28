package com.altamira.login.qa.stepdefinitions;

import java.util.List;

import com.altamira.qa.models.Insumo;
import com.altamira.qa.models.Usuario;
import com.altamira.qa.steps.ConsultaSaldoSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ConsultaSaldoStepDefinitions {

	@Steps
	ConsultaSaldoSteps consultaSteps;

	@Given("^Dentro de la pagina de altamira busco opcion saldo$")
	public void dentro_de_la_pagina_de_altamira_busco_opci_n_saldo() {
		consultaSteps.abrirAltamira();

	}

	@Given("^ingreso crendeciales$")
	public void ingreso_crendeciales(List<Usuario> listaUsuario) {
		consultaSteps.escribirUsuario(listaUsuario.get(0).getUsuario());
		consultaSteps.escribirClave(listaUsuario.get(0).getClave());
		consultaSteps.clicLogin();
	}

	@Given("^busco menu$")
	public void busco_menu() {
		consultaSteps.clicMoviStar();
		consultaSteps.abrirSaldo();
	}

	@When("^ingreso el dato de insumo$")
	public void ingreso_el_dato_de_insumo(List<Insumo> listaInsumo) {
		consultaSteps.escribirInsumo(listaInsumo.get(0).getInsumo());
		consultaSteps.clicBuscar();
	}

	@Then("^Capturo dato de saldo$")
	public void capturo_dato_de_saldo() {

	}

}
