package ru.ibs.appline.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/scenario"},
        glue = {"ru.ibs.appline.framework.three_project.pages.steps"},
        tags = {"@oneTest"},
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}


)
public class CucumberRunner {
}
