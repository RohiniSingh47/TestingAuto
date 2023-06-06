    //package api.cucumber.steps;

package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostStep {

    @Given("^user should be logged in and should be present at its own wall$")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() throws Throwable {
        System.out.println("user_should_be_logged_in_and_should_be_present_at_its_own_wal");
    }

    @When("^i type the message as \"([^\"]*)\"in the text box$")
    public void i_type_the_message_as_somethingin_the_text_box(String text) throws Throwable {
        System.out.println(text);
    }

    @When("^user supply the youtube link as \"([^\"]*)\" in the text box$")
    public void user_supply_the_youtube_link_as_something_in_the_text_box(String link) throws Throwable {
        System.out.println(link);
    }

    @Then("^the message should get posted$")
    public void the_message_should_get_posted() throws Throwable {
        System.out.println("the_message_should_get_posted");
    }

    @Then("^then video should get posted on the user wall$")
    public void then_video_should_get_posted_on_the_user_wall() throws Throwable {
        System.out.println("then_video_should_get_posted_on_the_user_wall");
    }

    @And("^click on post button$")
    public void click_on_post_button() throws Throwable {
        System.out.println("click_on_post_button");
    }

    @And("^the video should have proper thumbnail$")
    public void the_video_should_have_proper_thumbnail() throws Throwable {
        System.out.println("the_video_should_have_proper_thumbnail");
    }

    @When("i type the message in the box")
    public void iTypeTheMessageInTheBox() {
    }

    @When("user supply the youtube link in the text box")
    public void userSupplyTheYoutubeLinkInTheTextBox() {
    }
}

