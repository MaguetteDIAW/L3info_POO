package tpCollection_Genericite;
import java.util.*;

public class Comparaison implements Comparator<String> {

	public static void main(String[] args) {
		
		int count = args.length;
		for (String chaine :args) {
			
			System.out.println(chaine.toLowerCase());
		}
		Comparaison objet =new Comparaison();
		System.out.println(objet.compare("MAGUETTE","ABC"));
		

	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return  (o1.toLowerCase().compareTo(o2.toLowerCase()));
	}

}



