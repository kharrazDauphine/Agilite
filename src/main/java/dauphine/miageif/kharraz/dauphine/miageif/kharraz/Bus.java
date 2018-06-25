package dauphine.miageif.kharraz.dauphine.miageif.kharraz;

public class Bus {
	
	private int nbPlaces;
	private int placesDispo;
	
	private Station stationActuelle, stationDestination;
	
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public int getPlacesDispo() {
		return placesDispo;
	}
	public void setPlacesDispo(int placesDispo) {
		this.placesDispo = placesDispo;
	}
	public Bus(int nbPlaces) {
		super();
		this.nbPlaces = nbPlaces;
		// Au début, toutes les places sont disponibles
		this.placesDispo = this.nbPlaces;
	}
	public Station getStationActuelle() {
		return stationActuelle;
	}
	public void setStationActuelle(Station stationActuelle) {
		this.stationActuelle = stationActuelle;
	}
	public Station getStationDestination() {
		return stationDestination;
	}
	public void setStationDestination(Station stationDestination) {
		this.stationDestination = stationDestination;
	}
	
	
	
}
