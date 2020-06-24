package ToStringEquals;

public class RectangleColore extends Rectangle {
	
	private String couleur;

	public RectangleColore(double largeur, double hauteur, String couleur) {
		super(largeur, hauteur);
		this.couleur = couleur;
	}

	public boolean equals(RectangleColore autreRectColore) {
		if(autreRectColore == null) {
			return false;
		}
		
		else if(autreRectColore.getClass() != getClass()) {
			return false;
		}
		else {
			return (super.equals(autreRectColore) && couleur.equals(autreRectColore.couleur));
		}
	}
	
	public String toString() {
		return (super.toString() + "\n couleur " + couleur);
	}
}
