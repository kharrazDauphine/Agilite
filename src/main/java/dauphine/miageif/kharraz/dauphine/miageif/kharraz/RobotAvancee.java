package dauphine.miageif.kharraz.dauphine.miageif.kharraz;

public class RobotAvancee implements Target{
	Robot robot;
	
	public RobotAvancee(Robot robot) {
		super();
		this.robot = robot;
	}
	public Robot getRobot() {
		return robot;
	}
	public void setRobot(Robot robot) {
		this.robot = robot;
	}


	public void prendreBus(Bus bus) {
		int x = bus.getStationActuelle().getX();
		int y = bus.getStationActuelle().getY();
		
		Position positionBus = new Position(x, y);
		
		robot.seDeplacer(positionBus);
		
		int xDestination = bus.getStationDestination().getX();
		int yDestination = bus.getStationDestination().getY();
		Position destination = new Position(xDestination, yDestination);
		
		robot.setPosition(destination);
		
	}
	
}
