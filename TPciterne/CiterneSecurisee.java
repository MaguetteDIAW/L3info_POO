package tp2;


import tp2.Citerne.*;

public class CiterneSecurisee extends Citerne {
	protected double capaciteCuveTP; //Cuve trop Plein
	protected double volumeOccuperTP=0;
	protected final int CAPACITEMAX=20000;

	public CiterneSecurisee(int capacite, int temperature) throws IllegalAccessException, TypeNotPresentException {
		super(capacite, temperature);
		capaciteCuveTP=capacite*10/100;
	}
	
	
	public CiterneSecurisee(int capacite, int temperature,int capaciteTP) throws IllegalAccessException, TypeNotPresentException {
		super(capacite, temperature);
		if(capaciteTP>capacite) {
		capaciteCuveTP=capacite*10/100;
		throw new IllegalAccessException();}
		else {capaciteCuveTP=capaciteTP;}
	}
	
	@Override
	public void ajouterLiquide(int quantite,Type typeLiquide) throws RemplissageCuveException,TypeNotPresentException {
		//Remplissage du cuve Version1
		if (this.typeLiquide!=typeLiquide) throw new TypeNotPresentException("La cuve n'est pas distinee a contenir ce type de liquide."+typeLiquide,null);
		double volumDisponible=this.capaciteCuve-this.volumeOccuper;
		double volumDisponibleTP=this.capaciteCuveTP-this.volumeOccuperTP;
		if(quantite>capaciteCuve) {
			volumeOccuper+=volumDisponible;
			double rest = quantite-capaciteCuve;
			if(rest>capaciteCuveTP) {
				volumeOccuperTP+=volumDisponibleTP;
				double restTP = rest-capaciteCuveTP;
				throw new RemplissageCuveException("La cuve principale est plein et la quantite restante a remplir depasse de :"+restTP+"m3 de la capacite initiale de votre cuve trop plein.");
			}else {
				volumeOccuperTP+=rest;
				if(volumeOccuperTP>(capaciteCuveTP/2)) {System.err.println("Alerte!!!Votre cuve trop plein est a moitier rempli");}
			}
				
			}		
	 	else {
			if (quantite>volumDisponible) {
				volumeOccuper+=volumDisponible;
				double rest = quantite-capaciteCuve;
				if(rest>capaciteCuveTP) {
					volumeOccuperTP+=volumDisponibleTP;
					double restTP = rest-capaciteCuveTP;
					throw new RemplissageCuveException("La cuve principale est plein et la quantite restante a remplir depasse de :"+restTP+"m3 de la capacite initiale de votre cuve trop plein.");
				}
				else {
					volumeOccuperTP+=rest;
					if(volumeOccuperTP>(capaciteCuveTP/2))System.err.println("Alerte!!!Votre cuve trop plein est a moitier rempli");
				}
			}
			else{
				this.volumeOccuper+=quantite;
			}
		}
	}
	
	
	@Override
	public void enleverLiquide(int quantite)throws IllegalArgumentException,NullPointerException {
			
			if(quantite<=0 ) throw new NullPointerException("Le quantite a enlevee doit etre superieur strictement a zero.");
				double volumeManquant=quantite-capaciteCuve;
				if(quantite>capaciteCuve) {
					volumeOccuper=0;
					
					if(volumeManquant>capaciteCuveTP){
						volumeOccuperTP=0;
						double volumeManquantTP=volumeManquant-capaciteCuveTP;
					
					throw new IllegalArgumentException("la quantite ne peut etre superieur a la capacite de la cuve,Le volume manquant pour satisfaire votre demane est de : "+volumeManquantTP);}
					
					else {volumeOccuperTP-=volumeManquant;
						}
					}
				else {
					
					if(quantite>volumeOccuper) {
						
						volumeOccuper=0;
						
						if(volumeManquant>capaciteCuveTP){
							volumeOccuperTP=0;
							double volumeManquantTP=volumeManquant-capaciteCuveTP;
						
							throw new IllegalArgumentException("la quantite ne peut etre superieur a la capacite de la cuve,Le volume manquant pour satisfaire votre demane est de : "+volumeManquantTP);}
						
						else {volumeOccuperTP-=volumeManquant;}
						
					}
					else{
					
						volumeOccuper-=quantite;
					}
				}
		}
	
	
	@Override
	public boolean equals(Object o) { 
		boolean result = false;
		if ((o != null) && (o instanceof CiterneSecurisee) ) {
			CiterneSecurisee citerne=((CiterneSecurisee)o);
			result=((this.capaciteCuve+this.capaciteCuveTP==citerne.capaciteCuve+citerne.capaciteCuveTP) && (this.dateMservice==citerne.dateMservice) && (this.typeLiquide==citerne.typeLiquide));
		} 
			
		return result;
		
	 }
	
	
	@Override
	public String toString(){
		return "Citerne n°"+getNumeroCuve()+","+typeLiquide+
		", capacité : "+capaciteCuve +"m3, mise en service : "+dateMservice+" , volume occupé : " +volumeOccuper+".Citerne trop plein : "+", capacité : "+capaciteCuveTP ;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		CiterneSecurisee citerneS=null;
		try {
			citerneS = (CiterneSecurisee)super.clone();
		
		
		} 
		catch (CloneNotSupportedException e) { 
			System.err.println( "L'objet n’est pas clonable");
		}
		return citerneS; }
	
	
	
}
