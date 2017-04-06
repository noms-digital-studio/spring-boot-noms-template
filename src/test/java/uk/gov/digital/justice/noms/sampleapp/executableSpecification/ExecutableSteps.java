package uk.gov.digital.justice.noms.sampleapp.executableSpecification;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SuppressWarnings("SpringJavaAutowiringInspection")
@TestPropertySource("/application-test.properties")
@ContextConfiguration
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ExecutableSteps {

    @Value("${local.server.port}")
    private int port;

    @When("^I call the Rest Service$")
    public void iCallTheRestService() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I receive an OK status$")
    public void iReceiveAnOKStatus() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^some data is returned in JSON format$")
    public void someDataIsReturnedInJSONFormat() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
