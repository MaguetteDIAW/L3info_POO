package testExoClonage;

public class Voiture implements Cloneable {
	String immat;
	public Voiture(String immat) { this.immat=immat;}
	
	public Object clone() {
		Object o = null;
		try { 
			o = super.clone();
		}
		catch (CloneNotSupportedException e) {
		System.out.println("clonage impossible");
		} 
		return o;
		
	
	}

}
