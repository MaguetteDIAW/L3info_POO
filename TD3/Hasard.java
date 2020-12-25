package TD3;
import java.util.Random;


public class Hasard {
	

	public static <T> T tireHasrd (T[] tab) {
		T resultat=null;
		if (tab!=null && tab.length!=0) {
			
		
			Random ran =new Random();
			resultat =tab[ ran.nextInt(tab.length)];
			
		}
		return resultat;
	}

public static void main(String[] Arg) {
	Integer[] tableau= {1,2,3,4,5};
	System.out.println(tireHasrd(tableau));
	String[] tableau1= {"abc","cd","vg" };
	System.out.println(tireHasrd(tableau1));
}
}

