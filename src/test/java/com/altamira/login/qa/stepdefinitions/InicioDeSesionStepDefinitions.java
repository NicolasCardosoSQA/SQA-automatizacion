package com.altamira.login.qa.stepdefinitions;

import java.util.List;

import com.altamira.qa.models.Usuario;
import com.altamira.qa.steps.InicioDeSesionSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InicioDeSesionStepDefinitions {
	
	@Steps
	InicioDeSesionSteps inicioSteps;
	
	@Given("^que estoy en la pagina de inicio de AltamirA$")
	public void queEstoyEnLaPaginaDeInicioDeAltamirA() {
	   inicioSteps.abrirAltamira();
	}

	@When("^ingreso mis credenciales$")
	public void ingresoMisCredenciales(List<Usuario> listaUsuario) {
	    inicioSteps.escribirUsuario(listaUsuario.get(0).getUsuario());
	    inicioSteps.escribirClave(listaUsuario.get(0).getClave());
	    inicioSteps.clicLogin();
	}

	@Then("^Ingreso a la pagina$")
	public void ingresoALaPagina() {
	    
	}

}
