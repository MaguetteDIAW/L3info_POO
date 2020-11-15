package exercice1;
import java.util.*;

import java.io.IOException;
import java.io.PrintStream;
//Question 1
public class De {
	private int nbFaces;
	private  String nom;
	private static Random r= new Random();
	private static int nbDe=0;
	//Q3
	public  De() {
		nbFaces=6;
		nbDe++;
		nom=String.valueOf(nbDe+1);
	}
	
	public  De(String nom) {
		nbFaces=6;
		nbDe++;
		this.nom=nom;
	}
	
	public De(int i) {
		if(i>=3 && i<=120) {
			nbFaces=i;
			nbDe++;
			nom=String.valueOf(nbDe+1);}
					
		else{System.err.println("erreur!!!!");}		
	}
	
	public De(int i,String nom) {
		if(i>=3 && i<=120) {
			nbFaces=i;
			nbDe++;
			this.nom=nom;}
					
		else{System.err.println("erreur!!!!");}		
	}
	
	//fin Q3
	public int  getNbFace() {
		return nbFaces;
	}
	
	public int  getnbDe() {
		return nbDe;
	}
	//static void setErr(PrintStream err) {
	//	System.out.println("");}
	public void setNbFace(int nb) {
		if(nb>=3 && nb<=120) {
			nbFaces=nb;
		
		}
		else{System.err.println("erreur!!!!");}		
	}
	
	public String getNom() {return nom;}
	
	
    public String toString() {
		
		return "<<Le Des Numero:"+this.nbDe +" est Nomme "+this.nom+" est a "+this.nbFaces+" faces. >>";
				//super.toString();
	}
    public boolean equals(Object o) {
    	boolean result=false;
    	if(o!=null && o instanceof De) {
    		result=((this.nom==((De)o).nom)&& (this.nbFaces==((De)o).nbFaces));
    	}
    	return result;
    }


	public int lancer() {
		return (r.nextInt(nbFaces)+1);//pour eviter de retourner 0 et aussi permettre de retourner nbFaces
	}
	
	public int lancer(int nbLancer) {
		int meileurLancer=0;
		for(int i = 1;i<=nbLancer;i++) {
			int iemeLancer=r.nextInt(nbFaces)+1;
			if(iemeLancer>=meileurLancer) {
				meileurLancer=iemeLancer;
			}
			
		}
		
		return (meileurLancer);//pour eviter de retourner 0 et aussi permettre de retourner nbFaces
	}
	

}
