package arraylist;


import java.util.ArrayList;

public class Agence {
	private String directeur;
	private String adresse;
	private int nbClients = 0 ;
	ArrayList<Client> lesClients;
    
	public Agence( String directeur, String adresse) { // Constructeur .....
		this.directeur= directeur; 
		this.adresse=adresse;
		lesClients = new ArrayList<Client>(500);
	}
	
	public void setDirecteur(String d) {
		directeur=d;
	}
	
	public void setAge(String a) {
		adresse=a;
	}
	
	public String getDirecteur() {
	
		return directeur;
	}
	
	public String getAdresse() {
		
		return adresse;
	}
	
	//void changerDirecteur() {  }
	
	void ajouterUnClient(Client unClient) { 
		lesClients.add(unClient); 
		nbClients= lesClients.size();
		
	}
	
	void afficherClient() { 
		
		System.out.println ("Liste des noms de Clients"); 
		for (int i=0; i < lesClients.size() ; i++ )
			System.out.println( (lesClients.get(i)).getNom());
	}
	
	
	public double moyenneAgeClients1() {
		double somme=0.0;
		double moyenneAge;
		for(int i=0;i < lesClients.size();i++) {
			somme+=lesClients.get(i).getAge();
		}
		moyenneAge=(somme/nbClients);
		return moyenneAge;}
	
	public double moyenneAgeClients2() {
		double somme=0.0;
		double moyenneAge;
		for( Client l:lesClients) {
			somme+=l.getAge();
		}
		moyenneAge=(somme/nbClients);
		return moyenneAge;}
	   
	
	
	public void afficheListeNomsClients(){ 
		System.out.println ("Liste des noms de Clients"); 
	    for (Client c:lesClients )
	    System.out.println(c.getNom());

	       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
