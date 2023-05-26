package AJP;
import java.rmi.Remote;

//Step l
//Creating a two interface 
import java.rmi.*;
public interface two extends Remote { 
	// Declaring the method prototype 
	public boolean palin(String str) 
	throws RemoteException;
}