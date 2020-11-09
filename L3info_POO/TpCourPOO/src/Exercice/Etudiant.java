package Exercice;

public class Etudiant extends Personne {
	String numeroE;
	public Etudiant(String nom, String adress, double salaire,String numeroE) {
		super(nom,adress,salaire);
		this.numeroE=numeroE;
		
		
		
	}
		
	
	
	public String toString() {
		
		return "<<Etudiant N° "+this.numeroE+
				super.toString();
	}
	
	public void sePresenter() {
		super.sePresenter();
		System.out.println(" est un etudiant et son numero est  "+this.numeroE);
		
	}


	public Etudiant(String n, Double s,String numeroE) {
		super(n, s);
		this.numeroE=numeroE;
		// TODO Auto-generated constructor stub
	
		

}
}