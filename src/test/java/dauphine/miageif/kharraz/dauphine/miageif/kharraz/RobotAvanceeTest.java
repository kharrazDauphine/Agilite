package dauphine.miageif.kharraz.dauphine.miageif.kharraz;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotAvanceeTest {

	@Test
	public void testPrendreBus() {
		RobotAvancee myNewRobot = new RobotAvancee(new Robot());
		Bus bus = new Bus(50);
		bus.setStationActuelle(new Station(10, 10,"Charles De Gaules"));
		bus.setStationDestination(new Station(100, 987, "La Défense"));
		
		myNewRobot.prendreBus(bus);
		
		
		
		assertEquals(myNewRobot.getRobot().getPosition().getX(),
				bus.getStationDestination().getX());
		assertEquals(myNewRobot.getRobot().getPosition().getY(),
				bus.getStationDestination().getY());
		
	}

}
