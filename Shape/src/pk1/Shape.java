package pk1;
public class Shape {
	/**
	 * Declaration des attributs
	 */
	private String couleur;
	public String getCouleur() {
		return couleur;
	}
	/**
	 * Constructeur avec parametre
	 * @param couleur de la forme
	 */
	public Shape(String couleur){
		this.couleur=couleur;
	}
	/**
	 * Redefinition de toString
	 */
	@Override
	public String toString() {
		return "Couleur : "+getCouleur()+"\n";
	}
	
}
