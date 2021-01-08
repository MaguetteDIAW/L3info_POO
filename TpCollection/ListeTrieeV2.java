package tpCollection_Genericite;

import java.util.*;

import java.util.Random;
import java.util.TreeSet;

public class ListeTrieeV2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		TreeSet<Integer> list =new TreeSet<Integer>();
		int i=0;
		while(i<n) {
			
			Random ran =new Random();
			list.add(1+ran.nextInt(1000));
			i++;
		}
		
		
		System.out.println(list);
		}

	}


