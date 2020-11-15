package exercice1;
import java.util.*;

public class DeMemoire extends De{
	private int []tabmeoir;
	private int dernierChiffre=0;
	
	public DeMemoire() {
        super();
    }
	public DeMemoire(int nbFace, String nom) {
        super(nbFace, nom);
    }
	public DeMemoire(int nbFace) {
        super(nbFace);
    }
	public DeMemoire(String nom) {
        super(nom);
    }
	public void setDernierChiffre(int dernierChiffre){
        this.dernierChiffre = dernierChiffre;
    }

    public int getDernierChiffre() {
        return this.dernierChiffre;
    }
	@Override
    public int lancer(){
        int randInt;
        do {
            randInt = super.lancer();
        } while (randInt == getDernierChiffre());
        setDernierChiffre(randInt);
        return randInt;
    }
	

	

}
