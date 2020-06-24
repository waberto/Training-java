
public class Representant extends Employe {

	private final static double POURCENT_REPRESENTANT = 0.2;
	private final static int BONUS_REPRESENTANT = 800;
	private double chiffreAffaire;
	
	public Representant(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(nom, prenom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}

	@Override
	public double calculeSalaire() {
		// TODO Auto-generated method stub
		return (POURCENT_REPRESENTANT * chiffreAffaire) + BONUS_REPRESENTANT;
	}
	
	public String getTitre() {
		return "Le representant ";
	}
}
