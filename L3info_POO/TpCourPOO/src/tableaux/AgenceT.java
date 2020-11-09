package tableaux;


public class AgenceT {
	private String directeur;
	private String adresse;
	private int nbClients = 0 ;
    ClientT[] lesClients; 
    
	public AgenceT( String directeur, String adresse) { // Constructeur .....
		this.directeur= directeur; 
		this.adresse=adresse;
		lesClients = new ClientT[500];
		
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
	
	void changerDirecteur() {  }
	
	void ajouterUnClient (ClientT unClient) {
		lesClients[nbClients] = unClient; nbClients ++ ;
	}
	
		
	void afficherClient() { 
		
		System.out.println ("Liste des noms de Clients"); 
		for (int i=0; i < nbClients ; i++ )
			System.out.println( lesClients[i].getNom());
	}
	
	
	
	
	
	   
	
	
	public void afficheListeNomsClients(){ 
		System.out.println ("Liste des noms de Clients"); 
	    for (ClientT c:lesClients )
	    System.out.println(c.getNom());

	       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
