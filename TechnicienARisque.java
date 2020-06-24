
public class TechnicienARisque extends Technicien implements ARisque {

	public TechnicienARisque(String nom, String prenom, int age, String date, int unites) {
		super(nom, prenom, age, date, unites);
	}
	
	public double calculeSalaire() {
		return super.calculeSalaire() + PRIME;
	}

}
