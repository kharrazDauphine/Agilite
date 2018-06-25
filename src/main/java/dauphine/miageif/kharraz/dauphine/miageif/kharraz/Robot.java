package dauphine.miageif.kharraz.dauphine.miageif.kharraz;

public class Robot {
	
	private int energyPercentage;
	private int handsNumber;
	private String name;
	
	private Position position;
	
	public void seDeplacer(Position newPosition) {
		this.position = newPosition;
	}
	
	public String sePresenter() {
		if(this.energyPercentage >= 25)
			return "Bonjour, je suis " +  this.name +
					", j'ai " + this.handsNumber + 
					", et mon niveau d'énergie est: " + this.energyPercentage + "%"
			;
		else
			return "J'ai besoin de se charger";
	}
	
	public boolean seCharger(int power) {
		if(this.energyPercentage == 100) {
			System.err.println("Je suis en pleine forme");
			return true;
		}
			
		else {
			this.energyPercentage = (power+energyPercentage >= 100) ? 100 : (power+energyPercentage);
			return true;
		}
			
	}
	
	public Robot() {
		super();
		this.energyPercentage = 0;
		this.handsNumber = 0;
		this.name = "Inconnu";
		this.position = new Position(0, 0);
	}
	
	public Robot(int energyPercentage, int handsNumber, String name, Position position) {
		super();
		this.energyPercentage = energyPercentage;
		this.handsNumber = handsNumber;
		this.name = name;
		this.position = position;
	}
	public Robot(int energyPercentage, int handsNumber, String name) {
		super();
		this.energyPercentage = energyPercentage;
		this.handsNumber = handsNumber;
		this.name = name;
		this.position = new Position(0, 0);
	}

	public int getEnergyPercentage() {
		return energyPercentage;
	}

	public void setEnergyPercentage(int energyPercentage) {
		this.energyPercentage = energyPercentage;
	}

	public int getHandsNumber() {
		return handsNumber;
	}

	public void setHandsNumber(int handsNumber) {
		this.handsNumber = handsNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	
}
