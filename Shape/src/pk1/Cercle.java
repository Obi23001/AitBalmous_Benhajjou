package pk1;
public class Cercle extends Shape {
	/**
	 * Declaration des attributs
	 */
	private double rayon;
	/**
	 * Constructeur avec parametre
	 * @param couleur du cercle
	 * @param rayon du cercle
	 */
	public Cercle(String couleur,double rayon) {
		super(couleur);
		this.rayon=rayon;
	}
	/**
	 * Redefinition de toString
	 */
	@Override
	public String toString() {
		return super.toString()+"Rayon : " + rayon;
	}
	
}
