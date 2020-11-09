package tableaux;

public class TestAgenceT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgenceT Agence1=new AgenceT("Magou","Dakar");
		ClientT client1=new ClientT("Fatou",23);
		Agence1.ajouterUnClient(client1);
		Agence1.afficherClient();
		

	}

}
