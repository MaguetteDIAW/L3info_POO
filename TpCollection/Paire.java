package tpCollection_Genericite;



public class Paire <E1,E2>{
		private E1 first;
		private E2 second;
		
		
		public Paire(E1 element1,E2 element2) {
			this.first=element1;
			this.second=element2;
		}
		

		public E1 getFirst() {
			return first;
		}
		
		
		 public E2 getSecond() {
			return second;
		}
		 
		 
		 @Override
		public java.lang.String toString() {
			// TODO Auto-generated method stub
			return "( "+this.first+", "+this.second+" )";
		 }
		


}
