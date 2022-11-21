package exercice1;
//QUESTION 2
public class TestDe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		De De1=new De();
		De1.setNbFace(6);
		//Q3
		De Des=new De();
				
		De Des1=new De(12);
		System.out.println(Des.lancer());
		System.out.printf(Des.toString(),Des.lancer(3));
		De Dess=new De("mag");
		De Desss=new De("mag");
		System.out.println(Des.toString());
		System.out.println(Dess.equals(Desss));
		System.out.println(De1.equals(De1));
		DePipes ndes=new DePipes(4);
		System.out.println(Dess.toString());
		System.out.println(ndes.toString());
		System.out.println(ndes.lancer(3));
		DeMemoire ndess=new DeMemoire(4);
		System.out.println(ndess.lancer(3));
		
		
		
		

		

	}

}
jhoihw
lkuaojsl

