package pk1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 * Declaration d'une classe contenant une liste de type classe mere
 */
public class MyShapeList {
	public List<Shape> list;
	/**
	 * Constructeur qui initialise une liste vide 
	 */
	public MyShapeList() {
		this.list = new ArrayList();
	}
	/**
	 * Methode pour alimenter la liste 
	 * @param myShape : tableau contenant les formes
	 */
	public void alimenterList(MyShape myShape) {
		for(Shape shape : myShape.getShapes())
			list.add(shape);
	}
	/**
	 * Methode pour afficher la liste
	 */
	public void afficherList() {
		for(Shape shape : list)
			System.out.println(shape);
	}
	/**
	 * Method pour afficher la liste en la parcourant avec un iterateur
	 */
	public void parcourirListIterator() {
		Iterator<Shape> it = this.list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	/**
	 * Methode pour inserer un element dans la liste
	 * @param element a ajouter
	 */
	public void insererElement(Shape element) {
		list.add(element);
	}
	/**
	 * Methode qui parcour la liste afin de recuperer l'element donnee en parametre
	 * @param element a recuperer
	 */
	public void recupereElement(Shape element) { //Je pense que Rechercher et Recuperer ont les memes fonctionnalite ?
		Iterator<Shape> it = this.list.iterator();
		while(it.hasNext()) {
			if(it.next() == element)
				System.out.println(it.next());
		}
	}
	/**
	 * Methode pour supprimer l'element donnee en parametre
	 * @param element a supprimer
	 */
	public void supprimerElement(Shape element) {
		list.remove(element);
	}
	/**
	 * Methode pour trier liste
	 */
	public void trierList() {
		Collections.sort(list);
	}
	/**
	 * Methode pour melanger liste
	 */
	public void melangerList() {
		Collections.shuffle(list);
	}
	/**
	 * Methode pour inverser liste
	 */
	public void inverserList() {
		Collections.reverse(list);
	}
	/**
	 * Methode qui permet d'extraire une partie de la liste donnee en parametre
	 * @param listAExtracter
	 * @param indexDepart
	 * @param indexDarriver
	 */
	public void extrairePartieList(MyShapeList listAExtracter,int indexDepart,int indexDarriver){
		this.list=listAExtracter.list.subList(indexDepart, indexDarriver);
	}
	/**
	 * Methode qui permet de comparer 2 listes
	 * @param listAComparer
	 * @return True si egaux & False si non
	 */
	public boolean comparerList(MyShapeList listAComparer) {
		if(list == null || listAComparer.list == null)
			return false;
		if (list.size() != listAComparer.list.size()) 
		    return false;
		for(int i=0 ; i<list.size() ; i++) {
			if(!list.get(i).equals(listAComparer.list.get(i)))
				return false;
		}
		return true;		
	}
	
}
