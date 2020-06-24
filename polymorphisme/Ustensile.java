package polymorphisme;

public abstract class Ustensile {
	
	private int annee;

	public Ustensile(int annee) {
		this.annee = annee;
	}
	
	public double calculerValeur(int anneeActuelle) {
		int age = (anneeActuelle - getAnnee());
		double valeur = 0;
		if(age > 50) {
			valeur = age - 50;
		}
		return valeur;
	}
	
	public int getAnnee() {
		return annee;
	}
}
