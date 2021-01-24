package coinMaster;

import java.util.ArrayList;

public class TestTour {

	public static void main(String[] args) {
		
		 
		Tour t =new Tour(); // le tour pour tester les methode
		
		
		//TEST AVEC TROIS VILLAGES
		Village village1 =new Village();
		Village village2 =new Village();
		Village village3 =new Village();
		
		
		// OBJECT DANS LES VILLAGES
		Objet objet1= new Objet("Personne");
		Objet objet2= new Objet("Maison");
		Objet objet3= new Objet("Vehicule");
		Objet objet4= new Objet("Objet_Nature");
		Objet objet5= new Objet("O_Transport");
	 	
		
		//TEST AVEC 2 JOUEUR
		Joueur joueur1=new Joueur("Magou",village1);
		joueur1.acheterUnObjet(objet1);
		Joueur joueur2=new Joueur("Anthony",village1);
		joueur1.acheterUnObjet(objet1);
		joueur1.acheterUnObjet(objet2);
		
		
		
		
		//test la machine a sou
		System.out.println(joueur1.toString());
		joueur1.recompence1(t.jouer());
		System.out.println(joueur1.toString());
		
		
		
		System.out.println(joueur1.toString());
		System.out.println(joueur2.toString());
		joueur1.attaquer(joueur2);
		System.out.println(joueur1.toString());
		System.out.println(joueur2.toString());

	}

}
