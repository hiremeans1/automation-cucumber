package com.hiremeans.facebook;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/Facebook/EPA.feature"},
        glue = "com.hiremeans.stepdefinition")
public class EpaRunner {
}
