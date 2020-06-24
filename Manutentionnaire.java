
public class Manutentionnaire extends Employe{
	
	private static final double SALAIRE_HORAIRE = 65.0;
	private int heures;

	public Manutentionnaire(String nom, String prenom, int age, String date, int heures) {
		super(nom, prenom, age, date);
		this.heures = heures;
	}

	@Override
	public double calculeSalaire() {
		return SALAIRE_HORAIRE * heures;
	}

	public String getTitre() {
		return "Le manutentionnaire ";
	}
}
