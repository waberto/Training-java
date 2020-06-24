
public class Salaire {
	
	public static void main(String args[]) {
		
		Personnel p = new Personnel();
		p.ajouterEmploye(new Vendeur("Waberi", "Houssein", 32, "2018", 40000));
		p.ajouterEmploye(new Representant("Sadik", "Bachir", 33, "2016", 50000));
		p.ajouterEmploye(new Technicien("Abdi", "Houssein", 34, "2014", 60000));
		p.ajouterEmploye(new Manutentionnaire("Ismael", "Houssein", 28, "2012", 45));
		p.ajouterEmploye(new TechnicienARisque("Ahmed", "Houssein", 22, "2020", 1000));
		p.ajouterEmploye(new ManutentionnaireARisque("Abou", "Houssein", 25, "2021", 45));
		
		p.afficheSalaire();
		System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");
	}
}