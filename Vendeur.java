
public class Vendeur extends Employe {
	
	private final static double POURCENT_VENDEUR = 0.2;
	private final static int BONUS_VENDEUR = 400;
	private double chiffreAffaire;

	public Vendeur(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(nom, prenom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}

	@Override
	public double calculeSalaire() {
		return (POURCENT_VENDEUR *  chiffreAffaire) + BONUS_VENDEUR ;
	}
	
	public String getTitre() {
		return "Le vendeur ";
	}

}
