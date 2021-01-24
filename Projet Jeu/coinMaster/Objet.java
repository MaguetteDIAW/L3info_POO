package coinMaster;

public class Objet {
	private String nom;
	//private int nbEtoileObjet=0;
	private int prix=1000;
	private static int nbOjet;
	
	
	public Objet(String nom) {
		this.setNom(nom);
		nbOjet++;
		//nbEtoileObjet++;	
	}



	public int getPrix() {
		return prix;
	}


	



	public String getNom() {
		return nom;
	}
  
	
	public void setNom(String nom) {
		this.nom = nom;
	}


	public static int getNbOjet() {
		return nbOjet;
	}


	public static void setNbOjet(int nbOjet) {
		Objet.nbOjet = nbOjet;
	}


	@Override
	public String toString() {
		return "Objet [nom=" + nom + ", prix=" + prix + "]";
	}
	
	

}
