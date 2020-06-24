
public class ManutentionnaireARisque extends Manutentionnaire implements ARisque {

	public ManutentionnaireARisque(String nom, String prenom, int age, String date, int heures) {
		super(nom, prenom, age, date, heures);
	}
	
	public double calculeSalaire() {
		return super.calculeSalaire() + PRIME;
	}

}
