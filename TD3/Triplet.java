package TD3;

public class Triplet<E1,E2,E3> {
	private E1 first;
	private E2 second;
	private E3 third;
	
	public Triplet(E1 o1,E2 o2,E3 o3) {
		this.first=o1;
		this.second=o2;
		this.third=o3;
		
		
		// TODO Auto-generated constructor stub
	}
	
	public E1 getFirst() {
		return first;
	}
	 public E2 getSecond() {
		return second;
	}
	 public E3 getThird() {
		return third;
	}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
