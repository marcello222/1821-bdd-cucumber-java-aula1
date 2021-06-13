package br.com.alura.leilao.acceptance;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Extends do JUNit 4
@CucumberOptions(features = "classpath:features")
public class LeilaoCucumberRunner {
}
