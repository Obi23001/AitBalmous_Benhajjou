package pk1;
import java.util.Arrays;
import java.util.Collections;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cercle cercle1 = new Cercle("Rouge",4);
		Cercle cercle1Clone = (Cercle) cercle1.clone();
		Cercle cercle2 = new Cercle("Vert",6);
		Cercle cercle3 = new Cercle("Vert",3);
		
//		System.out.println(cercle1.toString());
//		System.out.println(cercle1Clone.toString());
//		System.out.println(cercle1.equals(cercle1Clone));
		
		Shape[] formes = new Shape[4]; 
		formes[0] = cercle1;
		formes[1] = cercle1Clone;
		formes[2] = cercle2;
		formes[3] = cercle3;
		
		Arrays.sort(formes);
		Collections.reverse(Arrays.asList(formes));
		for(int i=0;i<formes.length;i++)
			System.out.println(formes[i]);

		
		

	}

}
