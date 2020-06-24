package polymorphisme;

public abstract class Assiette extends Ustensile {

	public Assiette(int annee) {
		super(annee);
	}
	
	public abstract double calculerSurface(); 

}
