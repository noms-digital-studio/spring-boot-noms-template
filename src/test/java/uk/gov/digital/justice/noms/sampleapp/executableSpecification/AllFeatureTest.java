package uk.gov.digital.justice.noms.sampleapp.executableSpecification;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(format = "pretty", features = "src/test/resources/features")
public class AllFeatureTest {
}