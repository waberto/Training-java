
public class Technicien extends Employe {
	
	private static final double FACTEUR_UNITE = 5.0;
	private int unites;

	public Technicien(String nom, String prenom, int age, String date, int unites) {
		super(nom, prenom, age, date);
		this.unites = unites;
	}

	@Override
	public double calculeSalaire() {
		return FACTEUR_UNITE * unites ;
	}
	
	public String getTitre() {
		return "Le technicien ";
	}
}
