package com.mth.qa.stepdefinitions;

import java.util.List;

import com.mth.qa.models.Datos;
import com.mth.qa.models.Usuario;
import com.mth.qa.steps.CompraRequestSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraRequestStepDefinitions {

	@Steps
	CompraRequestSteps requeststep;

	@Given("^Estoy en la pagina de mth$")
	public void estoy_en_la_pagina_de_mth() {
		requeststep.abrirmth();
	}

	@Given("^ingreso credenciales$")
	public void ingreso_credenciales(List<Usuario> listaUsuario) {
		requeststep.escribirUsuario(listaUsuario.get(0).getUsuario());
		requeststep.escribirClave(listaUsuario.get(0).getClave());
		requeststep.darClicLogin();
	}

	@Given("^Ingreso a la pagina test$")
	public void ingreso_a_la_pagina_test() {
		requeststep.abriTest();
	}
	
	@When("^ingreso los datos del request Agrandado$")
	public void ingreso_los_datos_del_request_Agrandado(List<Datos> listaDatos) {
		requeststep.escribirFuente(listaDatos.get(0).getFuente());
		requeststep.escribirCodigoCorto(listaDatos.get(0).getCodigocorto());
		requeststep.escribirNumeroSuscriptor(listaDatos.get(0).getNumerosuscriptor());
		requeststep.escribirMensajeTexto(listaDatos.get(0).getMensajetexto());
		requeststep.clicProbar();
	}


	@When("^ingreso los datos del request Transpaso Saldo$")
	public void ingreso_los_datos_del_request_Transpaso_Saldo(List<Datos> listaDatos) {
		requeststep.escribirFuente(listaDatos.get(1).getFuente());
		requeststep.escribirCodigoCorto(listaDatos.get(1).getCodigocorto());
		requeststep.escribirNumeroSuscriptor(listaDatos.get(1).getNumerosuscriptor());
		requeststep.escribirMensajeTexto(listaDatos.get(1).getMensajetexto());
		requeststep.clicProbar();
	}

	@When("^ingreso los datos del request Confirmacion transpaso$")
	public void ingreso_los_datos_del_request_Confirmacion_transpaso(List<Datos> listaDatos) {
		requeststep.escribirFuente(listaDatos.get(2).getFuente());
		requeststep.escribirCodigoCorto(listaDatos.get(2).getCodigocorto());
		requeststep.escribirNumeroSuscriptor(listaDatos.get(2).getNumerosuscriptor());
		requeststep.escribirMensajeTexto(listaDatos.get(2).getMensajetexto());
		requeststep.clicProbar();
	}

	@When("^ingreso los datos del request Pide Saldo$")
	public void ingreso_los_datos_del_request_Pide_Saldo(List<Datos> listaDatos) {
		requeststep.escribirFuente(listaDatos.get(3).getFuente());
		requeststep.escribirCodigoCorto(listaDatos.get(3).getCodigocorto());
		requeststep.escribirNumeroSuscriptor(listaDatos.get(3).getNumerosuscriptor());
		requeststep.escribirMensajeTexto(listaDatos.get(3).getMensajetexto());
		requeststep.clicProbar();
	}

	@When("^ingreso los datos del request Confirmacion pide$")
	public void ingreso_los_datos_del_request_Confirmacion_pide(List<Datos> listaDatos) {
		requeststep.escribirFuente(listaDatos.get(4).getFuente());
		requeststep.escribirCodigoCorto(listaDatos.get(4).getCodigocorto());
		requeststep.escribirNumeroSuscriptor(listaDatos.get(4).getNumerosuscriptor());
		requeststep.escribirMensajeTexto(listaDatos.get(4).getMensajetexto());
		requeststep.clicProbar();
	}

	@When("^ingreso los datos del request Reactiva$")
	public void ingreso_los_datos_del_request_Reactiva(List<Datos> listaDatos) {
		requeststep.escribirFuente(listaDatos.get(5).getFuente());
		requeststep.escribirCodigoCorto(listaDatos.get(5).getCodigocorto());
		requeststep.escribirNumeroSuscriptor(listaDatos.get(5).getNumerosuscriptor());
		requeststep.escribirMensajeTexto(listaDatos.get(5).getMensajetexto());
		requeststep.clicProbar();
	}

	@Then("^Enviar request$")
	public void Enviar_request() {

	}

}
