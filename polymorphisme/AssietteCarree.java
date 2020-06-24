package polymorphisme;

public class AssietteCarree extends Assiette {

	private double cote;
	
	public AssietteCarree(int annee, double c) {
		super(annee);
		this.cote = c;
	}
	
	public double getCote() {
		return cote;
	}
	
	public double calculerSurface() {
		return (getCote() * getCote());
	}
	
	public double calculerValeur(int anneeActuelle) {
		double valeur = 5 * super.calculerValeur(anneeActuelle);
		return valeur;
	}

}
