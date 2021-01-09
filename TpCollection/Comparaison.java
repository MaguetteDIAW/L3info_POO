package tpCollection_Genericite;
import java.util.*;

public class Comparaison {

	public static void main(String[] args) {
		Comparaison objet = new Comparaison();
		ArrayList<String> tab= new ArrayList<String>();
		for(String chaine :args) {tab.add(chaine);}

		
		
		System.out.println("args avant tri: "+tab);
		System.out.println("tri lexico:"+objet.triLexico(args));
		

	}
	
	
	public ArrayList<String> triLexico(String[] tab) {
		
		ArrayList<String> tab1= new ArrayList<String>();
		for(String chaine :tab) {tab1.add(chaine);}
		Collections.sort(tab1);
		
		return tab1;
	}
	
	
	
	

	public int countMot(String mot) {return mot.length();}

	
	
	
	
	

}



