package pk1;

/**
 * Declaration d'une nouvelle class contenant un tableau de type class mere 
 */
public class MyShape {
	private Shape[] shapes;
	private int size;
	/**
	 * Constructeur qui remplit un tableau donnee
	 * @param couleur de la forme
	 * @param la taille du tableau
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
