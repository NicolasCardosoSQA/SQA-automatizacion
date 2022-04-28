package com.altamira.login.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/altamira/qa/features/ConsultaSaldo.feature",
glue="com.altamira.login.qa.stepdefinitions",
snippets=SnippetType.CAMELCASE)

public class ConsultaSaldoRunner {
	
}
