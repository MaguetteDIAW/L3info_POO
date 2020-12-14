package tp2;

import java.text.ParseException;
import java.util.*;

import tp2.Citerne.Type;

public class TestCiterne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Citerne citerne1=new Citerne(200,9);//huile
			Citerne citerne2=new Citerne(200,15);//vin
			Citerne citerne3=new Citerne(200,10);//eau
			Citerne citerne4=null;//eau
			assert citerne1!=null : "Requiert citerne not null";
			assert citerne2!=null : "Requiert citerne not null";
			assert citerne3!=null : "Requiert citerne not null";
			assert citerne4!=null : "Requiert citerne not null";
			System.out.println(citerne1.plusAncient(citerne3));
			System.out.println(citerne3.getDate());
			System.out.println("Citerne1 : TypeLiquide "+citerne1.getTypeLiquide());
			System.out.println(citerne2.getCapacite());
			System.out.println("Citerne1 : Volume occupe "+citerne1.getVolumOccuper());
			System.out.println("Citerne3 : Volume occupe "+citerne3.getVolumOccuper());
			System.out.println(citerne3.getNumeroCuve());
			System.out.println(citerne2.getNumeroCuve());
			System.out.println(citerne1.getNumeroCuve());
			citerne1.ajouterLiquide(100,Type.HUILE);
			System.out.println("Citerne1 : Volume occupe "+citerne1.getVolumOccuper()+"m3");
			citerne1.ajouterLiquide(65,Type.HUILE);
			System.out.println("Citerne1 : Volume occupe "+citerne1.getVolumOccuper()+"m3");
			//citerne1.ajouterLiquide(03.0,Type.EAU);
			citerne3.ajouterLiquide(0.2,Type.EAU);
			System.out.println("Citerne3 : Volume occupe "+citerne3.getVolumOccuper()+"m3");
			citerne2.ajouterLiquide(0.2,Type.VIN);
			System.out.println(citerne2.toString());
			
			citerne2.nettoyageCompleteCuve();//netoyage du cuve du citerne 2
			System.out.println(citerne2.toString()); 
			citerne2.nettoyageCompleteCuve(Type.EAU);//netoyage ENCORE du cuve du citerne 2
			System.out.println(citerne2.toString());
			citerne1.enleverLiquide(120);
			System.out.println(citerne1.toString());
			System.out.println(citerne1.equals(citerne2));
			System.out.println(citerne1.equals(citerne1));
			System.out.println(citerne1.compareA(citerne2));
			System.out.println(citerne1.compareA(citerne1));
			
			
			//TEST CLASS CITERNE SECURISEE
			System.out.println("Les citerne Securises");
			CiterneSecurisee citerneS1=new CiterneSecurisee(200,9,100);//huile
			CiterneSecurisee citerneS2=new CiterneSecurisee(200,15);//vin
			CiterneSecurisee citerneS3=new CiterneSecurisee(200,10);//eau
			System.out.println(citerne1.plusAncient(citerne3));
			System.out.println(citerne3.getDate());
			System.out.println("CiterneS1 : TypeLiquide "+citerneS1.getTypeLiquide());
			System.out.println(citerneS2.getCapacite());
			System.out.println("CiterneS1 : Volume occupe "+citerneS1.getVolumOccuper());
			System.out.println("CiterneS3 : Volume occupe "+citerneS3.getVolumOccuper());
			System.out.println(citerneS3.getNumeroCuve());
			System.out.println(citerneS2.getNumeroCuve());
			System.out.println(citerneS1.getNumeroCuve());
			citerneS1.ajouterLiquide(100,Type.HUILE);
			System.out.println("CiterneS1 : Volume occupe "+citerneS1.getVolumOccuper()+"m3");
			citerneS1.ajouterLiquide(65,Type.HUILE);
			System.out.println("CiterneS1 : Volume occupe "+citerneS1.getVolumOccuper()+"m3");
			//citerneS1.ajouterLiquide(03.0,Type.EAU);
			citerneS3.ajouterLiquide(0.2,Type.EAU);
			System.out.println("CiterneS3 : Volume occupe "+citerne3.getVolumOccuper()+"m3");
			citerneS2.ajouterLiquide(0.2,Type.VIN);
			System.out.println(citerneS2.toString());
			
			citerneS2.nettoyageCompleteCuve();//netoyage du cuve du citerne 2
			System.out.println(citerneS2.toString()); 
			citerne2.nettoyageCompleteCuve(Type.EAU);//netoyage ENCORE du cuve du citerne 2
			System.out.println(citerneS2.toString());
			citerneS1.enleverLiquide(120);
			System.out.println(citerneS1.toString());
			System.out.println(citerneS1.equals(citerneS2));
			System.out.println(citerneS1.equals(citerneS1));
			System.out.println(citerneS1.compareA(citerneS2));
			System.out.println(citerneS1.compareA(citerneS1));
			
			
			
			
			
			
			
			
			
			
		}
		catch(IllegalArgumentException e){e.printStackTrace();} //Traitement de tout ce qui est IllegalArgumentException 
		catch(TypeNotPresentException e){e.printStackTrace();}//Traitement de tout ce qui est TypeNotPresentException
		catch(ParseException e){e.printStackTrace();}//Traitement de tout ce qui est ParseException
		catch (RemplissageCuveException e) {e.printStackTrace();}//Traitement de tout ce qui est RemplissageCuveException
		//catch (RemplissageCuveException e) {e.printStackTrace();}  :"+rest+"
		//catch(TypeNotPresentException e){e.getMessage();}
		//catch(Exception e){e.getMessage();}
		//catch(Exception e){e.getMessage();}
		
		//catch(Exception e){e.getMessage();}
		//catch(Exception e){e.getMessage();}
		catch(Exception e){e.printStackTrace();}

	}
	
	

}
