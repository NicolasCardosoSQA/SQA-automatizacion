package com.movisarweb.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/movistarweb/features/qa/Compra_Paquete.feature",
				 glue = "com.movisarweb.qa.stepdefinitions", 
				 snippets = SnippetType.CAMELCASE)

public class PaginaWebRunners {

}
