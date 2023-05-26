package AJP;

// Java program for server application 
import java.rmi.*; 
import java.rmi.registry.*;
public class rmiserver { 
	public static void main(String args[]) 
	{ 
		try
	{ 
			// Create an object of the interface string_palindrome
// implementation class palin_impl

	two obj1 = new one(); 
	// rmi registry within the server JVM with
	// port number 5600 
	LocateRegistry.createRegistry(5600);
	// Binds the remote object by the name 
	Naming.rebind("rmi://localhost:5600"+"/PALINDROME",obj1);
	/****************************************************************
	void java.rmi.Naming.rebind(String name, Remote obj) throws 
	RemoteException, 
	Rebinds the specified name to a new remote object. 
	Any existingbinding for the name is replaced. 
	Parameters:name a name in URL format
	(without the scheme component)obj new remote object to associate with the name
	*************************************************************/ 
	System.err.println("Server is ready"); }
	catch(Exception ae)
		{ 
		System.out.println(ae); 
		} 
		} 
	
}

