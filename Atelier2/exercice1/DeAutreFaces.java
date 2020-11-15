package exercice1;
import java.util.*;

public class DeAutreFaces extends De {
	private ArrayList<Object> tabFaces = new ArrayList<Object>();
	Random r=new Random();
	public DeAutreFaces() {
		super();
	}
	public DeAutreFaces(int nbFace, String nom) {
        super(nbFace, nom);
    }
	public DeAutreFaces(int nbFace) {
        super(nbFace);
    }
	public DeAutreFaces(String nom) {
        super(nom);
    }
	////tableau gérer des dés dont les faces sont des suites d’entiers pairs. 
	public Object Tabpaire(int nbE) {
		Object tab[]=new Object[nbE/2+1];
		for(int j=0;j>nbE;j++) {
			for(int i=1;i>=getNbFace();i++) {
				if(i%2==0) {
					tab[j]=i;
				}
			}
		}
		return tab;
	}
	//tableau gérer des dés dont les faces sont des suites d’entiers impairs. 
	public Object TabImpaire(int nbE) {
		Object tab[]=new Object[nbE];
		for(int j=0;j>nbE;j++) {
			for(int i=1;i>=getNbFace();i++) {
				if(i%2!=0) {
					tab[j]=i;
				}
			}
		}
		return tab;
	}
	//tableau gérer des dés dont les faces sont des chaines de caractères, par exemple "Gagné", "Perdu", "Relancez", "Passez votre tour" 
	public Object Tabchar() {
		int nbE=4;
		Object tab[]=new Object[nbE];
		tab[0]="Gagner";
		tab[0]="Perdu";
		tab[0]="Relencer";
		tab[0]="Passer Votre Tour";
			
		
		return tab;
	}
	//@Override
	@SuppressWarnings("unchecked") //pour indique au compilateur que le code est sûr et ne provoquera pas d'exceptions inattendues.(eviter d'afficher les warnings.
	//methode lancer qui prend  
	public Object lancer( String type) {
		if (type.toUpperCase()=="DEPAIRE") {
			tabFaces=(ArrayList<Object>) this.Tabpaire((((getNbFace())/2)+1));
			}
		if (type.toUpperCase()=="DEIMPAIRE") {
			tabFaces=(ArrayList<Object>) this.TabImpaire((((getNbFace())/2)+1));
			}
		if (type.toUpperCase()=="DEIMPAIRE") {
			tabFaces=(ArrayList<Object>) this.Tabchar();
			}
		
		

		return this.tabFaces.get(r.nextInt(tabFaces.size()));//pour  retourner les vauleur dans le tableau et aussi permettre de retourner nbFaces
	}
	//@Override
	public Object lancer(int nbLancer, String type) {
		int meileurLancer=0;
		for(int i = 1;i<=nbLancer;i++) {
			int iemeLancer=r.nextInt(getNbFace())+1;
			if(iemeLancer>=meileurLancer) {
				meileurLancer=iemeLancer;
	
			
		}}
		
		return (meileurLancer);
	}
	
		
		
	

}
