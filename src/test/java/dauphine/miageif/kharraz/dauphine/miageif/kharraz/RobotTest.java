package dauphine.miageif.kharraz.dauphine.miageif.kharraz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


public class RobotTest {

	
	
	@Test
	public void testSeCharger() {
		
		// Success Scénario
		Robot adam = new Robot(50, 2, "Adam");
		assertEquals(true, adam.seCharger(40));
		
		// Fail scénario
		adam.setEnergyPercentage(100);
		assertEquals(false, adam.seCharger(10));
	}
	
	@Test
	public void testSePresenter() {
		
		// Success Scénario
		Robot adam = new Robot(100, 2, "Adam");
		String presentation = "Bonjour, je suis Adam"  +
				", j'ai 2" +
				", et mon niveau d'énergie est: 100%";
		assertEquals(presentation, adam.sePresenter());
		
		// Fail scénario
		adam.setEnergyPercentage(10);
		String fail = "J'ai besoin de se charger";
		assertEquals(fail, adam.sePresenter());
	}
	
}
