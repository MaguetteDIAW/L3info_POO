package testExoClonage;

public class TestClone {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Voiture v=new Voiture("CX555XR");
		Personnes p = new Personnes ("Toto",20,v);
		Personnes pclone=(Personnes) p.clone();
		//AFFICHAGE de p et pclone (nom-age-immatriculation-salaire janvier) //MODIFICATIONS DE P: changement nom, immatriculation, salaire janvier p.nom="Titi"; p.age=21;
		System.out.println(p.nom +p.age+p.maVoiture.immat+p.salaires[0]);
		System.out.println(pclone.nom +pclone.age+pclone.maVoiture.immat+pclone.salaires[0]);
		p.nom="Titi"; p.age=21;
		p.maVoiture.immat="CH666TY";
		p.salaires[0]=2000;
		//AFFICHAGE de p et pclone (nom-age-immatriculation-salaire janvier) //MODIFICATIONS DE P: nouvelle voiture, réinitialisation du tableau salaires Voiture nouvVoiture=new Voiture("CH777TY");
		System.out.println(p.nom +p.age+p.maVoiture.immat+p.salaires[0]);
		System.out.println(pclone.nom +pclone.age+pclone.maVoiture.immat+pclone.salaires[0]);
		Voiture nouvVoiture=new Voiture("CH777TY");
		pclone.maVoiture=nouvVoiture;
		p.salaires=new int[12];
		p.salaires[0]=2500;
		//AFFICHAGE de p et pclone (nom-age-immatriculation-salaire janvier)
		System.out.println(p.nom +p.age+p.maVoiture.immat+p.salaires[0]);
		System.out.println(pclone.nom +pclone.age+pclone.maVoiture.immat+pclone.salaires[0]);
	}

}
