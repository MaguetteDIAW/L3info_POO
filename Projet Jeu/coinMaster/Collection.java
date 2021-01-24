package coinMaster;

import java.util.ArrayList;

public class Collection {
	
	private String nomSerie;
	private int nbEtoileSerie;
	

	private ArrayList<Carte> cartes;
	
	public Collection(String nomSerie) {
		super();
		this.nomSerie = nomSerie;
		
	}

	public String getNomSerie() {
		return nomSerie;
	}

	public void setNomSerie(String nomSerie) {
		this.nomSerie = nomSerie;
	}

	public int getNbEtoileSerie() {
		return nbEtoileSerie;
	}

	public void setNbEtoileSerie(int nbEtoileSerie) {
		this.nbEtoileSerie = nbEtoileSerie;
	}
	
	@Override
	public String toString() {
		return "Collection [nomSerie=" + nomSerie + ", nbEtoileSerie=" + nbEtoileSerie + ", cartes=" + cartes + "]";
	}
	
	
}
