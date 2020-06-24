package polymorphisme;

public class AssietteRonde extends Assiette {

	private double rayon;
	
	public AssietteRonde(int annee, double r) {
		super(annee);
		this.rayon = r;
	}
	
	public double getRayon() {
		return rayon;
	}
	
	public double calculerSurface() {
		return (3.14 * getRayon() * getRayon());
	}
 
}
