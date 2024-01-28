package pk1;

public abstract class Shape implements Comparable<Shape>{
	/**
	 * Declaration des attributs
	 */
	private String couleur;

	public String getCouleur() {
		return couleur;
	}

	/**
	 * Constructeur avec parametre
	 * 
	 * @param couleur de la forme
	 */
	public Shape(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * Redefinition de toString
	 */
	@Override
	public String toString() {
		return "Couleur : " + getCouleur() + "\n";
	}
	/**
	 * Implementation de l'interface Comparable
	 */

//	@Override
//	public int compareTo(Shape o) {
//		System.out.println("Comparator Shape");
//		return 0;
//	}
	
	public abstract int compareTo(Shape o);

}
