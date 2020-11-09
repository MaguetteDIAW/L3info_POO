package tableaux;

public class ClientT {
	private String nom;
	private int age;
	public ClientT(String nom,int age) {
		this.nom=nom;
		this.age=age;
	}
	
	public void setNom(String n) {
		nom=n;
	}
	public void setAge(int a) {
		age=a;
	}
	
	public String getNom() {
	
		return nom;
	}
	public int getAge() {
		
		return age;
	}



	void vieillir() {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
