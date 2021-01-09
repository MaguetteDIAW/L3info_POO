package tpCollection_Genericite;
import java.util.*;

public class Comparaison {

	public static void main(String[] args) {
		Comparaison objet = new Comparaison();
		ArrayList<String> tab= new ArrayList<String>();
		for(String chaine :args) {tab.add(chaine);}

		
		
		System.out.println("args avant tri: "+tab);
		System.out.println("tri lexico:"+objet.triLexico(args));
		System.out.print("tri militaire:");objet.triMilitaire(args);
		System.out.println("tri Inverse lexico:"+objet.triInverseLexico(args));
		

	}
	
	
	public ArrayList<String> triLexico(String[] tab) {
		
		ArrayList<String> tab1= new ArrayList<String>();
		for(String chaine :tab) {tab1.add(chaine);}
		Collections.sort(tab1);
		
		return tab1;
	}
	
	public void triMilitaire(String[] tab) {
		
		ArrayList<String> tab1= new ArrayList<String>();
		Map<Integer, String> m = new HashMap<Integer, String>();
		for(String chaine :tab) {tab1.add(chaine);}
		Collections.sort(tab1);
		for (Iterator<String> i = tab1.iterator();i.hasNext(); ){
			
			String o = i.next();
			m.put(o.length(), o);
			List<Integer> employeeByKey = new ArrayList<Integer>(m.keySet());
			Collections.sort(employeeByKey);
			
			
		}
		System.out.println(m.values());
		
	}
	
	public ArrayList<String> triInverseLexico(String[] tab) {
			
			ArrayList<String> tab1= new ArrayList<String>();
			for(String chaine :tab) {tab1.add(chaine);}
			Collections.sort(tab1);
			Collections.reverse(tab1);
			
			return tab1;
		}
	

	
	

}



