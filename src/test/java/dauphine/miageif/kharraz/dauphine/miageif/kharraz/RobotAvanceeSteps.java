package dauphine.miageif.kharraz.dauphine.miageif.kharraz;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RobotAvanceeSteps {

	private Robot robot;
	private RobotAvancee robotAvancee;
	private Bus bus;
	private Station stationActuelle, stationDestination;
	
	@Given("^Robot se deplace vers la station$")
	public void robot_se_deplace_vers_la_station() throws Exception {
		robot = new Robot();
	    robotAvancee = new RobotAvancee(robot);
	    bus = new Bus(100);
	}

	@When("^bus a prendre de la \"([^\"]*)\" situe a (\\d+) et (\\d+)$")
	public void bus_a_prendre_de_la_situe_a_et(String name, int x, int y) throws Exception {
		stationActuelle = new Station(x, y, name);
		bus.setStationActuelle(stationActuelle);
	}

	@When("^se dirige vers \"([^\"]*)\" situe a (\\d+) et (\\d+)$")
	public void se_dirige_vers_situe_a_et(String name, int x, int y) throws Exception {
		stationDestination = new Station(x, y, name);
		bus.setStationDestination(stationDestination);
	}

	@When("^robot est dans (\\d+) et (\\d+)$")
	public void robot_est_dans_et(int x, int y) throws Exception {
		robot.setPosition(new Position(x, y));
		robotAvancee.prendreBus(bus);
	}

	@Then("^robot prend le bus$")
	public void robot_prend_le_bus() throws Exception {
		assertEquals(robotAvancee.getRobot().getPosition().getX(), stationDestination.getX());
	    assertEquals(robotAvancee.getRobot().getPosition().getY(), stationDestination.getY());
	}
	
}
