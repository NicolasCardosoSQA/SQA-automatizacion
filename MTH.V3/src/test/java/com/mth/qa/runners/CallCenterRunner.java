package com.mth.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/mth/features/qa/CallCenterMTH.feature", 
				glue = "com.mth.login.qa.stepdefinitions", 
				snippets = SnippetType.CAMELCASE)
public class CallCenterRunner {

}
