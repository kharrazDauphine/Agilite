package dauphine.miageif.kharraz.dauphine.miageif.kharraz;

public class Station {
	
	private int x;
	private int y;
	private String nom;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Station(int x, int y, String nom) {
		super();
		this.x = x;
		this.y = y;
		this.nom = nom;
	}
	
	
	
}
