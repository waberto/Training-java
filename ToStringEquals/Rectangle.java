package ToStringEquals;

public class Rectangle {

	private double largeur;
	private double hauteur;

	public Rectangle(double largeur, double hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	@Override
	public boolean equals(Object autreRect) {

		if (autreRect == null)
			return false;
		else if (autreRect.getClass() != getClass())
			return false;
		else {
			return ((largeur == ((Rectangle) autreRect).largeur) && hauteur == ((Rectangle) autreRect).hauteur);
		}
	}
	
	public String toString() {
		return "Rectangle : \n "
				+ "largeur = " + largeur + "\n hauteur = " + hauteur;	
	}

}
