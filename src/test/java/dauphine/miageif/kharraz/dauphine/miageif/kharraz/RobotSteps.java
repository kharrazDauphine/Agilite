package dauphine.miageif.kharraz.dauphine.miageif.kharraz;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RobotSteps {
	private Robot robot;
	private boolean success;

	@Given("^Mike charge son robot$")
	public void mike_charge_son_robot() throws Exception {
		robot = new Robot();
	}

	@When("^(\\d+) moins de cent$")
	public void moins_de_cent(int energyLevel) throws Exception {
		robot.setEnergyPercentage(energyLevel);
	}

	@When("^robot se charge de (\\d+)$")
	public void robot_se_charge_de(int power) throws Exception {
		success = robot.seCharger(power);
	}

	@Then("^chargement réussi$")
	public void chargement_réussi() throws Exception {
		Assert.assertTrue(success);
	}

	@When("^(\\d+) egal a cent$")
	public void egal_a_cent(int energyLevel) throws Exception {
		robot.setEnergyPercentage(energyLevel);
	}
	
	@When("^essai de charger de (\\d+)$")
	public void essai_de_charger_de(int power) throws Exception {
		success = robot.seCharger(power);
	}

	@Then("^chargement echoue$")
	public void chargement_echoue() throws Exception {
		Assert.assertFalse(success);
	}
}
