package tp2;


public class MonTableau implements EstComparable{
	int tab[];
	private int result;
	

	public MonTableau(int tab[]) {
		this.tab=tab;
	}
	
	
	public MonTableau() {
		tab= new int[] {1,2,3,4};
	}
	
	
	private int sommeTab() {
		int somme = 0;
		for (int i=0;i<tab.length;i++) {
			somme+=tab[i];
		}
		return somme;
	}
	
	
@SuppressWarnings("null")
@Override
	public int compareA(Object o) throws Exception {
		if(o==null) throw new NullPointerException("L'object n'est pas comparable");
		MonTableau som=null;
		int	somme1=0;
		if(o instanceof MonTableau) {
			som=((MonTableau)o);
			somme1=som.sommeTab();
			int somme2=sommeTab();
			if (somme1==somme2){
				return result=0;
			}
			else {return result=-1;}
		}
		else{throw new NullPointerException("L'object n'est pas comparable"); }
				
	}
}

