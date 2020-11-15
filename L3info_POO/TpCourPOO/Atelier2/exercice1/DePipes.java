package exercice1;

import java.util.Random;

public class DePipes extends De {
	private int bornmin;
	private static Random r= new Random();
	
	public  DePipes(int bornmin) {
		super();
		if(bornmin>=1 && bornmin<=super.getNbFace()) {
			this.bornmin=bornmin;}
					
		else{System.err.println("erreur!!!!");}		
	}
	
	public  DePipes(String nom,int bornmin) {
		super(nom);
		if(bornmin>=1 && bornmin<=super.getNbFace()) {
			this.bornmin=bornmin;}
					
		else{System.err.println("erreur!!!!");}		
	}
	
	public  DePipes(int nbface,String nom,int bornmin) {
		super(nbface,nom);
		if(bornmin>=1 && bornmin<=super.getNbFace()) {
			this.bornmin=bornmin;}
					
		else{System.err.println("erreur!!!!");}		
	}
	@Override
	public int lancer() {
		int val=r.nextInt(getNbFace())+1;
		while(val<bornmin) {
			val=r.nextInt(getNbFace())+1;}
		return val;
	
		//pour eviter de retourner 0 et aussi permettre de retourner nbFaces
	}
	@Override
	public int lancer(int nbLancer){
		int meileurLancer=0;
		for(int i = 1;i<=nbLancer;i++) {
			
			int iemeLancer=r.nextInt(getNbFace())+1;
			while(iemeLancer<bornmin) {
				iemeLancer=r.nextInt(getNbFace())+1;}
			
			if(iemeLancer>=meileurLancer) {
				meileurLancer=iemeLancer;
			}
			
		}
		
		return (meileurLancer);//pour eviter de retourner 0 et aussi permettre de retourner nbFaces
	}

	

}
