package testExoClonage;

public class Personnes implements Cloneable {
	String nom;
	int age;
	Voiture maVoiture;
	int[] salaires;
	public Personnes(String nom, int age, Voiture maVoiture) {
	this.nom=nom;
	this.age=age; 
	this.maVoiture=maVoiture; 
	salaires= new int[12]; 
	salaires[0]=1500;
	}
	//public Object clone() {
	//Object o = null; try {
	//o = super.clone();
	//}
	//catch (CloneNotSupportedException e) { 
	//	System.out.println("clonage impossible");
	//}
	//return o; }
	
	public Object clone() { 
		try {
		Personnes s = (Personnes)super.clone();
		s.salaires=(int [])salaires.clone();
		s.maVoiture = (Voiture)maVoiture.clone();
		return s;
		} 
		catch (CloneNotSupportedException e) {
			String immat;
			// ne devrait jamais arriver car Voiture est cloneable
				}
		throw new InternalError();
		
	}

}
