package Exercice;

import java.util.ArrayList;

public class Universite {
	private String titre;
	private int nbmembre=0;
	ArrayList<Personne>membre;
	
	 	
	public Universite(String titre) {
		titre=titre;
		membre=new ArrayList<Personne> ();
		
		
	}
	
	void ajouterPersonne  (Personne P){
		membre.add(P);
		nbmembre++;
		//nbmembre=membre.size();
		
	}
	
	void afficherMembre() {
		System.out.println("Liste des membres de l'universite : ");
		for(int i=0;i<nbmembre;i++) {
			membre.get(i).sePresenter();
			
		}
	}
}
