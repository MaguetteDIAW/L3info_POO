package Exercice;

public abstract class Personne {
	private String nom;
	private String adress;
	private  Double salaire;
	private static Double masseSalariale=0.0;
	private static int nbPersonne=0;
	
	//Constructeur de la personne
	public Personne(String nom, String adress, double salaire) {
		this.nom=nom;
		this.adress=adress;
		this.salaire=salaire;
		nbPersonne++;
		masseSalariale = masseSalariale+salaire;
		
		// TODO Auto-generated constructor stub
	}
	public void sePresenter() {
		System.out.print(this.nom);
	}
		
	
	public Personne(String n, Double s) {
		nom=n;
		adress="";
		salaire=s;
		nbPersonne++;
		masseSalariale = masseSalariale+salaire;
		
	}
	
	public String toString() {
		return "<<"+this.nom+","+this.adress+","+this.salaire+">>";
	}
	
	public void setnom(String x) {
		nom = x; }
	
	public void setadress(String x) {
		adress = x; }
	
	public void setsalaire(Double x) {
		if(x>=1219.0)
			salaire = x;
		}

	public String getnom() {
		return nom; }
	
	public String getadress() {
		return adress; }
	
	public  Double getsalaire() {
		return salaire; }
	
	public static Double getmasseSalariale() {
		return masseSalariale;}
	
	public static int getndbPersonne() {
		return nbPersonne;}

	
	void afficher() {
		
		System.out.println(nom+" habite  "+adress);
		
	}
	
	void changerAdresse(String nouvelle) {
		adress=nouvelle;
		
	}
	
	double salaireAnnuel() {
		return (salaire*=12);
		
	}
	
	boolean salaireEstSup1000() {
		return(salaire>=1000);
			
		
	}
	
	public static void affichermasseSalariale() {
		
		System.out.println("Masse Salariale Totale: "+masseSalariale +" euros");
		
	}
	
	public static void salaireMoyen() {
		
		System.out.println("Salariale Moyen: "+(masseSalariale/nbPersonne) +" euros");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	


}
