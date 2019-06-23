package stepDefinations;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on netBanking Page$")
    public void user_is_on_netbanking_page() throws Throwable {
        System.out.println("Testing");
    }
  /*  @When("^ User Login into username as \"([^\"]*)\" and passoword as \"([^\"]*)\"$")
    public void user_login_into_username_as_something_and_passoword_as_something(String strArg1, String strArg2) throws Throwable {
       System.out.println("this is regular expression"+strArg1+" "+strArg2);
    }*/
  /*  @When("^User Login into username and passoword$")
    public void user_login_into_username_and_passoword() throws Throwable {
    	System.out.println("Testing");
    }*/
    @When("^User Login into username as \"([^\"]*)\" and passoword as \"([^\"]*)\"$")
    public void user_Login_into_username_as_and_passoword_as(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("this is regular expression"+arg1+" "+arg2);
    }

    @Then("^Home Page is Populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Testing");
    }

    @And("^Cards are Displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Testing");
    }

}
