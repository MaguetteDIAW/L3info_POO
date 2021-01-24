package coinMaster;

import java.util.ArrayList;

import java.util.Random;



public class Tour {
	private ArrayList<Joueur> listjoueur;
	private ArrayList<Village> listvillage;
	private ArrayList<Carte> listCates;
	
	
	public ArrayList<Joueur> getListjoueur() {
		return listjoueur;
	}


	public void setListjoueur(ArrayList<Joueur> listjoueur) {
		this.listjoueur = listjoueur;
	}


	public ArrayList<Village> getListvillage() {
		return listvillage;
	}


	public void setListvillage(ArrayList<Village> listvillage) {
		this.listvillage = listvillage;
	}

	
	 
	//Pour implementer la machine a chou avec le quel le joueur joue 
	//pour gagner des pieces
	
	static Object tableau[]={"Marteaux","Bouclier","Pieces","Cochon","Tour"};
	
	public static <T> T tireHasrd (T[] tab) {
		T resultat=null;
		if (tab!=null && tab.length!=0) {
			Random ran =new Random();
			resultat = tab[ ran.nextInt(tab.length)];	
		}
		return resultat;
	}
	
	
	public String jouer() {
		return (String)tireHasrd(tableau);
	}
	
	

	
}
