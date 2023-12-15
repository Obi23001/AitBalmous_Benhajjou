package pk1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Declaration d'une nouvelle class contenant un tableau de type class mere
 */
public class MyShape {
	private Shape[] shapes;
	private int size;

	/**
	 * Constructeur qui remplit un tableau donnee
	 * 
	 * @param couleur de la forme
	 * @param la      taille du tableau
	 */
	public MyShape(Shape[] formes) {
		this.size = formes.length;
		shapes = new Shape[size];
		for (int i = 0; i < size; i++) {
			if (formes[i] instanceof Shape) {
				shapes[i] = formes[i];
			}
		}
	}

	/**
	 * Methode pour trier le tableau
	 */
	public void sort() {
		Arrays.sort(shapes);
	}

	/**
	 * Ajout d'une autre array a shapes[]
	 * 
	 * @param forme : array a ajoutee
	 */
	public void add(Shape forme) {
		shapes[size] = forme;
		size++;
	}

	/**
	 * Methode pour supprimer un array dans shape[]
	 * 
	 * @param forme a supprimee
	 */
	public void supprimer(Shape forme) {
		for (int i = 0; i < size; i++) {
			if (shapes[i].equals(forme)) {
				shapes[i] = null;
				size--;
			}
		}
	}

	/**
	 * Methode pour compter le nbr d'elements
	 * 
	 * @return nbr d'elements
	 */
	public int count() {
		int cpt = 0;
		for (int i = 0; i < size; i++) {
			cpt++;
		}
		return cpt;
	}

	/**
	 * Methode pour inverser le tableau
	 * 
	 * @param forme : tableau a inverser
	 * @return tableau inverse
	 */
	public void reverse() {
		int taille = size;
		for (int i = 0; i < taille / 2; i++) {
			Shape temp = shapes[i];
			shapes[i] = shapes[taille - 1 - i];
			shapes[taille - 1 - i] = temp;
		}
	}

	/**
	 * Methode pour afficher le tableau
	 */
	public void afficher() {
		for (int i = 0; i < size; i++) {
			System.out.println(shapes[i]);
		}
	}

	/**
	 * Methode pour extracter max element dans un tableau
	 * 
	 * @return max element
	 */
	public double max() {
		double max = 0;
		for (Shape shape : shapes) {
			if (shape instanceof Cercle)
				if (((Cercle) shape).getRayon() > max)
					max = ((Cercle) shape).getRayon();
		}
		return max;
	}
	/**
	 * Methode qui retourne true si les deux tableaux sont egaux
	 * @param myshape tableau a compare
	 * @return 
	 */
	public boolean egalite(MyShape myshape) {
		if (myshape.getSize() != this.getSize())
			return false;
		int cpt=0;
		for (int i = 0; i < this.getSize(); i++)
			if (myshape.shapes[i].equals(shapes[i]))
				cpt++;
		if(cpt == this.getSize())
			return true;
		else
			return false;			
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}

}
