package coinMaster;

public class Carte {
	private String nomCarte;
	private int nbEtoileCarte;
	
	
	public Carte(String nomCarte, int nbEtoileCarte) {
		super();
		this.nomCarte = nomCarte;
		this.nbEtoileCarte = nbEtoileCarte;
	}
	public String getNomCarte() {
		return nomCarte;
	}
	public void setNomCarte(String nomCarte) {
		this.nomCarte = nomCarte;
	}
	public int getNbEtoileCarte() {
		return nbEtoileCarte;
	}
	public void setNbEtoileCarte(int nbEtoileCarte) {
		this.nbEtoileCarte = nbEtoileCarte;
	}
	@Override
	public String toString() {
		return "Carte [nomCarte=" + nomCarte + ", nbEtoileCarte=" + nbEtoileCarte + "]";
	}

}
