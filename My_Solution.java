package misc;

import java.util.ArrayList;
import java.util.Scanner;


public class main_misc {

	public static void main(String[] args) {
	
		String s = "if man was meant to stay on the ground god would have given us roots";
		String s1 = "chillout";
		System.out.println(encrypt(s));
	}
    
	private static String encrypt(String s) {
		//
		
		s = s.replaceAll(" ","");

		
		//finding rows and columns
		double r = Math.sqrt(s.length());
		double c = Math.sqrt(s.length());
		r = Math.floor(r);
		c = Math.ceil(c);
		
		ArrayList<String> l = new ArrayList<>();
		String d  = "";
		int k = 0;
		for(int i = 0;i < s.length();i++) {
			if(k == c){
				d += " ";
				l.add(d);
				d = "";
                k = 0;
			}
			
			if(k < c) {
				d+= s.substring(i,i+1);
				k++;
				if(i == s.length()-1) {
					l.add(d);
				}
			}
		}
		//System.out.println(l);
		
		String encrypted = "";
		
		for(int i = 0;i < c;i++) {
			d = "";
			for(int j = 0;j < l.size();j++) {
				
				if(i < l.get(j).length()) {
					encrypted += l.get(j).substring(i,i+1);
				}
				
				if(j == c-1) {
					encrypted += d;
				}
			}
			if(i != c-1) {
				encrypted += " ";
			}
		}
		
		System.out.println(encrypted);
	
		
		return d;
	}
	
	
	
	}
	
	
	
	

	


	
	

	
		
	
	


	

	
	

