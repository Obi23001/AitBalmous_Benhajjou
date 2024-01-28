package pk1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException{
		Cercle cercle1 = new Cercle("Rouge", 4);
		Cercle cercle1Clone = (Cercle) cercle1.clone();
		Cercle cercle2 = new Cercle("Vert", 6);
		Cercle cercle3 = new Cercle("Vert", 3);

		Shape[] formes = { cercle1, cercle1Clone, cercle2, cercle3};
		MyShape myShape = new MyShape(formes);
		
		System.out.println("*********Our Arrays********");
		myShape.afficher();
		System.out.println();
		System.out.println("*********After Sorting********");
		myShape.sort();
		myShape.afficher();
		System.out.println();
		System.out.println("*********After Removal********");
		myShape.supprimer(cercle2);
		myShape.afficher();
		System.out.println();
		System.out.println("Nombre d'elements : "+myShape.count());
		System.out.println();
		System.out.println("*********After Reversing********");	
		Cercle cercle4= new Cercle("Bleu",8);
		myShape.add(cercle4);
		myShape.reverse();
		myShape.afficher();
		System.out.println("*********Max element********");	
		System.out.println(myShape.max());
		System.out.println("*********Equality********");	
		Shape[] formes2 = { cercle4, cercle1, cercle1Clone, cercle3};
		MyShape myShape2 = new MyShape(formes2);
		System.out.println(myShape.egalite(myShape2));
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();
		
		MyShapeList myList = new MyShapeList();
		myList.alimenterList(myShape2);
		
		System.out.println("*********Simple Display List********");
		myList.afficherList();
		System.out.println("*********Display List With Iterator********");
		myList.parcourirListIterator();
		System.out.println("*********Display After Insertion********");
		myList.insererElement(cercle2);
		myList.parcourirListIterator();
		System.out.println("*********Fetch Element********");
		myList.recupereElement(cercle1);
		System.out.println("*********List After Removal********");
		myList.supprimerElement(cercle1);
		myList.supprimerElement(cercle2);
		myList.parcourirListIterator();
		System.out.println("*********List After Sorting********");
		myList.trierList();
		myList.parcourirListIterator();
		System.out.println("*********List After Reversing********");
		myList.inverserList();
		myList.parcourirListIterator();
		System.out.println("*********List After Shuffling********");
		myList.melangerList();
		myList.parcourirListIterator();
		System.out.println("*********List After Extraction********");
		MyShapeList myExtractedList = new MyShapeList();
		myExtractedList.extrairePartieList(myList,0, 2);
		myExtractedList.parcourirListIterator();
		System.out.println("*********Comparing 2 Lists********");
		System.out.println(myList.comparerList(myExtractedList));
		System.out.println("*********List After Clear********");
		myExtractedList.viderList();
		myExtractedList.parcourirListIterator();
		System.out.println("*********List After Swaping********");
		myList.swapElements(1, 3);
		myList.parcourirListIterator();
		
	}

}
