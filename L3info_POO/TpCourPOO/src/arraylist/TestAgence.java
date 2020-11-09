package arraylist;

class TestAgence {

	public static void main(String[] args) {
		Agence Agence1=new Agence("Magou","Dakar");
		Client client1=new Client("Fatou",23);
		Client client2=new Client("Moussa",26);
		Agence1.ajouterUnClient(client1);
		Agence1.ajouterUnClient(client2);
		Agence1.afficherClient();
		Agence1.afficheListeNomsClients() ;
		System.out.println("L'age moyen des Clients est : "+Agence1.moyenneAgeClients2()) ;
		

	}

}
