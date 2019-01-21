package hellocucumber;

import static org.junit.Assert.assertEquals;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

class IsItFriday {
    static String isItFriday(String today) {
	if (today.equalsIgnoreCase("Friday")) {
	    return "TGIF";
	}
    return "Nope";
    }
}

public class Stepdefs {
    private String today;
    private String actualAnswer;

    @Given("^today is \"([^\"]*)\"$")
    public void today_is(String todayIs) {
        this.today = todayIs;
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() {
        this.actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
    	System.out.println("EXPECTED ANSWER is :"+expectedAnswer);
        assertEquals(expectedAnswer, actualAnswer);
    }
}