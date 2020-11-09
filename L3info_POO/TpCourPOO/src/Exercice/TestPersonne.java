package Exercice;


public class TestPersonne {
	
	
	
	public static void main(String[] args) {
		
		Enseignant personne1 =new Enseignant("Titi","Corte",2000.0,23);
		Etudiant Etudiant1 =new Etudiant("Magou","Dakar",2300.0,"20202962");
		
		//Personne personne2 =new Personne("machin",2000.0);//Pour augmenter le nombre de personne
		
		// TODO Auto-generated method stub
		//ersonne1.setnom("Titi");
		//personne1.setadress("Corte");
		//personne1.setsalaire(2000.0);
		
		personne1.afficher();
		//personne2.afficher();
		personne1.changerAdresse("Ajaccio");
		personne1.afficher();
		
		
	
		System.out.println("Salaire annuel de "+personne1.getnom()+": "+personne1.salaireAnnuel()+" euros");	
		
		if(personne1.salaireEstSup1000()==true)
			System.out.println(personne1.getnom() +" a un salaire supérieur à 1000 euros ");
		
		else
			System.out.println(personne1.getnom() +" n'a pas un salaire supérieur à 1000 euros ");
		
		
		Personne.affichermasseSalariale();
		Personne.salaireMoyen();
		System.out.println("Nombre de Personne :"+Personne.getndbPersonne());
		System.out.println(personne1.toString());//test de la methode toString de la classe Personne
		System.out.println(Etudiant1.toString());//test de la methode toString de la classe Etudiant
		personne1.sePresenter();
		Etudiant1.sePresenter();

		//Test des methode de la classe Universite
		Universite U=new Universite("titre");
		U.ajouterPersonne (personne1);
		Enseignant Ens=new Enseignant("NIVET","1 cour paoli",20000.0,34);
		U.ajouterPersonne(Ens);
		U.ajouterPersonne(Etudiant1);
		U.afficherMembre();
		}
	
		

}
