
public class Personnel {
	
	private Employe[] staff;
	private int nbreEmploye;
	private final static int MAXEMPLOYE = 200;
	
	public Personnel() {
		staff = new Employe[MAXEMPLOYE];
		this.nbreEmploye = 0;
	}
	
	public void ajouterEmploye(Employe emp) {
		++nbreEmploye;
		if(nbreEmploye <= MAXEMPLOYE) {
			staff[nbreEmploye - 1]  = emp;
		} else {
			System.out.println("Pas plus de " + MAXEMPLOYE + " employés");
		}
	}
	
	public void afficheSalaire() {
		for(int i = 0; i < nbreEmploye; i++) {
			System.out.println(staff[i].getNom() + " gagne "
					+ staff[i].calculeSalaire() + " francs.");
		}
	}
	
	public double salaireMoyen() {
		double somme = 0.0;
		for(int i = 0; i < nbreEmploye; i++) {
			somme += staff[i].calculeSalaire();
		}
		return somme / nbreEmploye;
	}
	
	
	
	
}
