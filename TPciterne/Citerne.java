 package tp2;
//import java.sql.Date;
//import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
//import java.text.SimpleDateFormat;
//import java.time.*;




public class Citerne implements EstComparable{
	private int numeroCuve;
	private static int nbCuve=0;
	protected  int capaciteCuve;
	protected final int CAPACITEMAX=20000;
	protected double volumeOccuper=0;
	public enum Type {
		EAU,
		VIN,
		HUILE}
	protected Type typeLiquide;
	protected LocalDate dateMservice;//classe date
	protected boolean nettoyer=false;
	
		
	
	public Citerne (int capacite,int temperature) throws IllegalArgumentException,TypeNotPresentException{
		if(capacite<=0 ) throw new IllegalArgumentException("Une cuve ne doit pas pouvoir être construite sur la base d’une capacité négative ou nulle");//regarder dans les classes filles de RunTimesExcep..
		if(capacite>CAPACITEMAX)throw new IllegalArgumentException("Une cuve ne doit pas pouvoir être construite sur la base d’une capacité superieur a 20000 metres cubes");
		numeroCuve=nbCuve+1;
		nbCuve=nbCuve+1;
		capaciteCuve=capacite;
		dateMservice= LocalDate.now();
		
		switch(temperature) {
		case 15:this.typeLiquide=Type.VIN;
		break;
		case 10:this.typeLiquide=Type.EAU;
		break;
		case 9:this.typeLiquide=Type.HUILE;
		default:
			new TypeNotPresentException("Aucun de nos cuve est destinee a stocker un liquide avec cette temperature", null);
            break;
		
		}

	}


	public   Citerne plusAncient(Citerne c2) throws ParseException {
	
		if (this.dateMservice.compareTo(dateMservice) < 0) {
			return this;
		}else if (dateMservice.compareTo(dateMservice) > 0) {
			return c2;
        
		}else {
			return null;
		}
	}

	
	public Type getTypeLiquide() {
		return this.typeLiquide;
	}
	
	
	public int getCapacite() {
		return this.capaciteCuve;
	}
	
	
	public double getVolumOccuper() {
		return this.volumeOccuper;
	}
	
	public void setVolumOccuper(int volume) {
		this.volumeOccuper=volume;
	}
	
	
	public LocalDate getDate() {
		return this.dateMservice;
	}
	
	
	public  int getNumeroCuve() {
		return numeroCuve;
	}

	
	public void ajouterLiquide(int quantite,Type typeLiquide) throws RemplissageCuveException,TypeNotPresentException {
		//Remplissage du cuve Version1
		if (this.typeLiquide!=typeLiquide) throw new TypeNotPresentException("La cuve n'est pas distinee a contenir ce type de liquide."+typeLiquide,null);
		double volumDisponible=this.capaciteCuve-this.volumeOccuper;
		if(quantite>capaciteCuve) {
			volumeOccuper+=volumDisponible;
			double rest = quantite-capaciteCuve;
			throw new RemplissageCuveException("La quantite a remplir depasse de :"+rest+"m3 de la capacite initiale de votre cuve.");}
	 	else {
			if (quantite>volumDisponible) {
				volumeOccuper+=volumDisponible;
				double rest = quantite-volumDisponible;
				new RemplissageCuveException("La quantite a remplir depasse de "+rest+" m3 du volume disponible de votre cuve.");}
			else{
				this.volumeOccuper+=quantite;
			}
		}
	}
	
	
	public void ajouterLiquide(double pourcentage,Type typeLiquide) throws RemplissageCuveException,TypeNotPresentException {
		//Remplissage du cuve Version2
		if (this.typeLiquide!=typeLiquide) throw new TypeNotPresentException("La cuve n'est pas distinee a contenir ce type de liquide. "+typeLiquide,null);
		if(pourcentage<0)throw new IllegalArgumentException("le pourcentage doit etre compris entre 0 et 1 inclus.");
		if(pourcentage>1)throw new RemplissageCuveException("La cuve ne peut pas contenir une quantite qui est superieur a sa capacite,le pourcentage doit etre compris entre 0 et 1 inclu.");
		double volumDisponible=this.capaciteCuve-this.volumeOccuper;		
		if (pourcentage*capaciteCuve>volumDisponible) {
			volumeOccuper+=volumDisponible;
			double rest = pourcentage*capaciteCuve-volumDisponible;
			new RemplissageCuveException("La quantite à remplir depasse de :"+rest+"m3 du volume disponible de votre cuve, soit ");}
		else{
			this.volumeOccuper+=pourcentage*capaciteCuve;
		}
	}
	
	
	public void nettoyageCompleteCuve() {//Nettoyage complete de la cuve:on nettoie la cuve sans changer le  type de liquide qu'elle doit contenir
		typeLiquide=null;
		volumeOccuper=0;
	}
	
	
	public void nettoyageCompleteCuve(Type Typeliquide) {//Nettoyage complete de la cuve:on nettoie la cuve en changeant le  type de liquide qu'elle doit contenir
		typeLiquide=Typeliquide;
		volumeOccuper=0;
		//nettoyer=true;
	}
	
	
	public void enleverLiquide(double pourcentage) throws IllegalArgumentException,NullPointerException  {
		//on considére que le pourcentage est pris parraport au volume occupé et pas parrapor a sa capacité
		if(pourcentage<=0 ) {throw new NullPointerException("Le pourcentage doit etre superieur strictement a zero.");} //lever d'exception si pourcentage est negatif ou null
		//if(capaciteCuve>pourcentage*volumeOccuper/100) {throw new IllegalArgumentException("la=e volume a enlever ne peut pas etre superieur a la capacite de la cuve.");}
		if(pourcentage>100 ) {
			
			volumeOccuper=0; // la cuve est totalement vidée
			
			throw new IllegalArgumentException("Le pourcentage doit etre inferieur ou egale a 100,il depasse de "+(pourcentage-100));}
		else {
			volumeOccuper-=pourcentage*volumeOccuper/100; //on enleve juste le volume équivalent au pourcentatge donné
		}
		
	}
	
	
	public void enleverLiquide(int quantite)throws IllegalArgumentException,NullPointerException {
		
		if(quantite<=0 ) throw new NullPointerException("Le quantite a enlevee doit etre superieur strictement a zero.");
		
		if(quantite>capaciteCuve) throw new IllegalArgumentException("la quantite ne peut etre superieur a la capacite de la cuve");
		
		else {
			
			if(quantite>volumeOccuper) {
				volumeOccuper=0; //la cuve est totalement vidée
				double volunmeManquant=quantite-(capaciteCuve-volumeOccuper);
				throw new IllegalArgumentException("La quante à enlever est superieur au volume dans la cuve,il depasse de :m3"+volunmeManquant);}
			else{
				
				volumeOccuper-=quantite;
			}
		}
	}
	
	
	@Override
	public boolean equals(Object o) { 
		boolean result = false;
		if ((o != null) && (o instanceof Citerne) ) {
			Citerne citerne=((Citerne)o);
			result=((this.capaciteCuve==citerne.capaciteCuve) && (this.dateMservice==citerne.dateMservice) && (this.typeLiquide==citerne.typeLiquide));
		} 
			
		return result;
		
	 }
	
	
	@Override
	public String toString(){
		return "Citerne n°"+numeroCuve+","+typeLiquide+
		", capacité : "+capaciteCuve +"m3, mise en service : "+dateMservice+" , volume occupé : " +volumeOccuper;
	}
	
	
	public int compareA(Object o) throws Exception{
		if(o==null) throw new NullPointerException("L'object n'est pas comparable");
		Citerne citerne=((Citerne)o);
		
		
		if(this.volumeOccuper>citerne.volumeOccuper) {return 1;}
		else if(this.volumeOccuper<citerne.volumeOccuper){return -1;}
		else {
			if(this.capaciteCuve<citerne.capaciteCuve) {return -1;}
			else if(this.capaciteCuve>citerne.capaciteCuve){return 1;}
			else return 0;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
