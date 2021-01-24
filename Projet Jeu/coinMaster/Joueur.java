package coinMaster;

import java.util.*;

public class Joueur {
	private String nom;
	private int fortune;
    private int nbTour;
    private int nbEtoile;
    private int nbBouclier;
    private Village village;
    private ArrayList<Joueur> listjoueur =new ArrayList<Joueur>();
    private ArrayList<Village> listvillage =new ArrayList<Village>();
	   
	   
	public Joueur(String nom,Village village) {
		//CONSTRUCTEUR
		
		this.nom = nom;
		nbTour = 50;
		fortune = 75000; 
		nbEtoile = 0;
		nbBouclier = 0;
		this.village=village;
		listvillage.add(village);
		listjoueur.add(this);
	
	}
	
	
	//GETEURS ET SETUURS
	
	public ArrayList<Village> getListvillage() {
		return listvillage;
	}


	public void setListvillage(Village village) {
		listvillage.add(village);
		
	}
	
	
	public   void setListjoueur(ArrayList<Joueur> listjoueur1) {
		listjoueur = listjoueur1;
	}


	public String getNom() {
		return nom;
	}
	
	public int getFortune() {
		return fortune;
	}
	
	public int getNbTour() {
		return nbTour;
	}
	
	public int getNbEtoile() {
		return nbEtoile;
	}
	
	public int getNbBouclier() {
		return nbBouclier;
	}
	
	public ArrayList<Joueur> getListjoueur() {
		return listjoueur;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setFortune(int fortune) {
		this.fortune = fortune;
	}
	
	public void setNbTour(int nbTour) {
		this.nbTour = nbTour;
	}
	
	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;
	}
	
	public void setNbBouclier(int nbBouclier) {
		this.nbBouclier = nbBouclier;
	}
	
	
	
	public void attaquer(Joueur j) {
		
		if(j.nbBouclier==0) {
			int gain=(this.village.getNumeroVillage()*25000);
			this.fortune+=gain;
			j.fortune-=gain;
			System.out.println("Attaque Reussie!!!");
		}else {
			j.nbBouclier-=1;
			this.fortune+=25000;
			
			village.setNbObjet(village.getNbObjet()-1);
			System.out.println("Attaque pas Reussie!!!");
			
		}	
	}
	
	
	
    public void attaquer() {
    	
    	Scanner sc =new Scanner(System.in);
    	Joueur joueur=this.joueurAleatoire();// = listjoueur.get( ran.nextInt(listjoueur.size()-1));
    	System.out.print("Choisie un obte parmis: "); //le joeur choisit un objet representer par un numero
    	for(int i=1;i<=joueur.village.getNbObjet();i++) {
    		System.out.print(i);}
    	int choix = sc.nextInt();
    	
    	if(joueur.nbBouclier==0) {
    		
    		joueur.village.detuireObjet(joueur.village,choix); // detruit l'objet choisi par le joueur attaquant
			this.fortune+=(this.village.getNumeroVillage()*25000);
			
		}else {
			this.fortune+=(25000);
			joueur.nbBouclier-=1;
			
		}
    	
	}
    
    
    public void afficherListeVillage() {
    	System.out.println();
    }
    
    
    
    public Joueur joueurAleatoire () {
    	//Metthode permetannt de choisir un joueurs de facons aleatoire parmis les joueurs
		Joueur resultat=null;
		if (listjoueur!=null && listjoueur.size()!=0) {
			Random ran =new Random();
			resultat = listjoueur.get(ran.nextInt(listjoueur.size()-1));
			
		}
		return resultat;
	}
    
    
    
    public void piler() {
    	Random ran =new Random();
		Joueur joueur = listjoueur.get(ran.nextInt(listjoueur.size()));
		int fortuneVolee;
		fortuneVolee=ran.nextInt(joueur.fortune);
		joueur.fortune-=fortuneVolee;
		this.fortune+=fortuneVolee;
		
    }
    
	
    
	public void recompence1(String objet) {
		this.nbTour--;
		 switch(objet) {
		 case "Marteau ":
			 this.attaquer();
			 this.fortune+=2000*this.village.getNumeroVillage();
			 break;
		 case "Bouclier":
			 this.nbBouclier++;
			 break;
		 case "Tour":
			 this.nbTour++;
			 break;
		 case "Pieces":
			 this.fortune+=this.village.getNumeroVillage()*25000;
			 break;
		 case "cochon":
			 this.piler();
			 break;
			 
		 default:
			 this.fortune+=1000*this.village.getNumeroVillage();
			 
		 }
	}
	
	public void acheterUnObjet(Objet o) {
		if(this.fortune<o.getPrix()) {
			System.out.println("Votre fortune ne vous permet pas d'acheter cet objet.Tentez de gagner de gagner de pieces en jouant au niveau de la machine a sou !!! ");
		}
		else{
			this.fortune-=o.getPrix();
			this.village.setObjet(o);
			
			
			
		}
		
	}

	

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Joueur : "+nom+" ; "+
				"fortune: "+fortune+" ; "+
				"Nombre de tour : "+nbTour+" ; "+
			    "Nombre d'ETOILE : "+nbEtoile+" ; "+
			    "Nombre de BOUCLIER : " +nbBouclier; 
			    
	}
	
	  
}
