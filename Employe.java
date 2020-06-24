
public abstract class Employe {
	
	private String nom;
	private String prenom;
	private int age;
	private String date;
	
	
	
	public Employe(String nom, String prenom, int age, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}

	public abstract double calculeSalaire ();
	
	public String getTitre() {
		return "L'employé ";
	}
	
	public String getNom() {
		return getTitre() + prenom + " " + nom;
	}

}
