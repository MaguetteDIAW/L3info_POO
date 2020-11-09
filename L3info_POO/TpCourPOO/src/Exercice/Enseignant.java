package Exercice;

public class Enseignant extends Personne {
	private int nbHeure;
	public Enseignant(String nom, String adress, double salaire,int nbHeure) {
		super(nom,adress,salaire);
		this.nbHeure=nbHeure;
		
	}
	
public void sePresenter() {
	super.sePresenter();
	System.out.println(" est un enseignant et il effectue "+this.nbHeure+" de cours");
	
		
	}


}
