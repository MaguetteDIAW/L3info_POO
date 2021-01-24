package coinMaster;

import java.util.ArrayList;

public class Village {
	private String theme;
	private int numeroVillage=0;
	private int nbObjet=0;
	private ArrayList<Objet> objet=new ArrayList<Objet>();
	
	public Village(String theme) {
		this.theme=theme;
		numeroVillage++;	
	}
	
	public Village(){
		this.theme="ThemeSuivant";
		numeroVillage++;
		
	}
	
	

	public int getNbObjet() {
		return nbObjet;
	}

	public void setNbObjet(int nbObjet) {
		this.nbObjet = nbObjet;
	}
	
	 
	
	
	public void detuireObjet(Village v,int o) {
		v.objet.set(o,null);
		
		
	}
	
	
	
	
	public ArrayList<Objet> getObjet() {
		return objet;
	}

	public void setObjet(Objet objet) {
		this.objet.add(objet);
		nbObjet++;
	}

	public void ameliorerVillage() {
		
	}
	
	
	public int getNumeroVillage() {
		return numeroVillage;
	}
	
	public String getTheme() {
		return theme;
	}
	
	@Override
	public String toString() {
		return "Village [theme=" + theme + ", numeroVillage=" + numeroVillage + ", nbObjet=" + nbObjet + ", objet="
				+ objet + "]";
	}
}
