package tpCollection_Genericite;

import java.util.*;



public class ListeTriee {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		ArrayList<Integer> list =new ArrayList<Integer>();
		int i=0;
		while(i<n) {
			
			Random ran =new Random();
			list.add(1+ran.nextInt(1000));
			i++;
		}
		
		Collections.sort(list);
		System.out.println(list);
		

	}
	
	
	}


