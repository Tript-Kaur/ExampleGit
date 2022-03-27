package Resources.Steps;

/*import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;*/
import io.cucumber.java.en.*;

public class postingSteps {

    @Given("^User should be logged in and should be present at its own wall$")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Background:Given");
    }

    @When("^I type the message in the text box$")
    public void i_type_the_message_in_the_text_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario1::When");
    }

    @When("^Click on Post button$")
    public void click_on_Post_button()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario1::When2");
    }

    @Then("^the message should be get posted$")
    public void the_message_should_be_get_posted()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario1::Then");
    }

    @When("^user supply the youtube link in the text box$")
    public void user_supply_the_youtube_link_in_the_text_box()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario2::When");
    }

    @Then("^the video should have proper thumbnail$")
    public void the_video_should_have_proper_thumbnail()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario2::Then");
    }



}
