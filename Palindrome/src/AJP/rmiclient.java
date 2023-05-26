package AJP;

import java.rmi.*; 
public class rmiclient { 
	public static void main(String args[]) { 
	String value="PCCOER"; 
	
	boolean answer; 
	try { 
		// lookup method to find reference of remote object 
		two access = 
		(two)Naming.lookup("rmi://localhost:5600"+"/PALINDROME"); 
		answer = access.palin("PCCOER"); 
		if (answer) 
			System.out.println("String is PALINDROME!!!"); 
		else System.out.println("String is NOT PALINDROME!"); 
		} 
	catch(Exception ae) 
	{ 
		System.out.println(ae); 
	}
}
}
