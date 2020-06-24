package polymorphisme;

public class Cuillere extends Ustensile {
	
	private double longueur;

	public Cuillere(int annee, double l) {
		super(annee);
		this.longueur = l;
	}
	
	public double getLongueur() {
		return longueur;
	}

}
