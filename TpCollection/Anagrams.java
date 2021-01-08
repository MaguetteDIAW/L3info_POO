package tpCollection_Genericite;

import java.util.*; 
import java.io.*; 
	public class Anagrams{
		
		
		public static void main(String[] args){
			int nombre = Integer.parseInt(args[1]);//arge[1]
		// Read words from file and put into simulated multimap 
			Map<String, List<String>> m = new HashMap<String, List<String>>();
			try {
				Scanner s = new Scanner(new File(args[0]));//args[
				String mot;
				while(s.hasNext()){
					String alpha = alphabetize(mot = s.next()); List<String> l = m.get(alpha);
					if (l==null) { 
						m.put(alpha, l=new ArrayList<String>());} 
					l.add(mot);
				}
			} catch(IOException e) { 
				System.err.println(e); 
				System.exit(1); 
				} // Print all permutation groups above size threshold
			for (List<String> l : m.values()){
			if (l.size() >= nombre) { 
				System.out.println(l.size() + ": " + l);}
			} 
		}
		
	private static String alphabetize(String chaine){ 
		int count[] = new int[256];
		int len = chaine.length();
		for (int i=0; i<len; i++) {
			count[chaine.charAt(i)]++;}
			StringBuffer result = new StringBuffer(len);
			for (char c='a'; c<='z'; c++) {
		
				for (int i=0; i<count[c];i++) {result.append(c);}}
			return result.toString();
	} 
	}


