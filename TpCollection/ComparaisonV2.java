package tpCollection_Genericite;
import java.util.*;

public class ComparaisonV2 {

	public static void main(String[] args) {
		ComparaisonV2 objet = new ComparaisonV2();
		ArrayList<String> tab= new ArrayList<String>();
		for(String chaine :args) {tab.add(chaine);}

		System.out.println("args avant tri: "+tab);
		switch(args[0]) {
			
			case "Lexico" :System.out.println("tri lexico:"+objet.triLexico(args));
				break;
			case "Militaire" :System.out.print("tri militaire:");objet.triMilitaire(args);
				break;
			case "Inverse lexico" :System.out.println("tri Inverse lexico:"+objet.triInverseLexico(args));
				break;
			default:
				System.out.println("Votre premiere argument doit etre Lexico,Militaire ou Inverse lexico..");
		}

	}
	
	
	public ArrayList<String> triLexico(String[] tab) {
		
		ArrayList<String> tab1= new ArrayList<String>();
		for(String chaine :tab) {tab1.add(chaine);}
		tab1.remove(0);
		Collections.sort(tab1);
		
		return tab1;
	}
	
	public void triMilitaire(String[] tab) {
		
		ArrayList<String> tab1= new ArrayList<String>();
		Map<Integer, String> m = new HashMap<Integer, String>();
		for(String chaine :tab) {tab1.add(chaine);}
		tab1.remove(0);
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
			tab1.remove(0);
			Collections.sort(tab1);
			Collections.reverse(tab1);
			
			return tab1;
		}
	

	
	

}



