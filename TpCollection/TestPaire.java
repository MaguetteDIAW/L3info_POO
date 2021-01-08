package tpCollection_Genericite;

public class TestPaire {

	public static void main(String[] args) {
		Paire<String,Integer> paire1=new Paire<String,Integer>("Magou",22);
		Paire<String,Integer> paire2=new Paire<String,Integer>("Annastajia",21);
		
		System.out.println(paire1.toString());
		System.out.println(paire2.toString());
		
		System.out.println(paire1.getFirst());
		System.out.println(paire2.getSecond());
		
		
		
	}

}
