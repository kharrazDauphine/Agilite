package dauphine.miageif.kharraz.dauphine.miageif.kharraz;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RobotSteps {
	
	private Robot robot;
	private boolean success;
	
	@Given("^Mike charge son robot$")
	public void mike_charge_robot() {
		robot = new Robot(50, 2, "Adam");
	}
	
	@When("^When Mike branche son robo$")
	public void mike_branche_chargeur() {
		success = robot.seCharger(40);
	}
	
	@Then("^batterie augmente$")
	public void should_succeed() {
		Assert.assertTrue(success);
	}
	
}
