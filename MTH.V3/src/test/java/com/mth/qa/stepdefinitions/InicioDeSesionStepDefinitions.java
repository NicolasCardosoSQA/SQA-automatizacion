package com.mth.qa.stepdefinitions;

import java.util.List;

import com.mth.qa.models.Usuario;
import com.mth.qa.steps.InicioDeSesionSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InicioDeSesionStepDefinitions {

	@Steps
	InicioDeSesionSteps iniciostep;

	@Given("^que estoy en la pagina de inicio de MTH$")
	public void que_estoy_en_la_pagina_de_inicio_de_MTH() {
		iniciostep.abrirmth();
	}

	@When("^ingreso mis credenciales$")
	public void ingreso_mis_credenciales(List<Usuario> listaUsuario) {
		iniciostep.escribirUsuario(listaUsuario.get(0).getUsuario());
		iniciostep.escribirClave(listaUsuario.get(0).getClave());
		iniciostep.darClicLogin();
	}

	@Then("^Ingreso a la pagina$")
	public void ingreso_a_la_pagina() {

	}
}
