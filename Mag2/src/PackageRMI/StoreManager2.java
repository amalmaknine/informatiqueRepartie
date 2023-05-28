package PackageRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StoreManager2 extends UnicastRemoteObject implements Store{

	protected StoreManager2() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	Ingrediant  cornichons = new Ingrediant("cornichons",20);
	Ingrediant  safran = new Ingrediant("safran",500);
	Ingrediant  sel = new Ingrediant("sel",3);
	Ingrediant  poivre = new Ingrediant("poivre",200);
	@Override
	public float getPrice(String ingredient) throws RemoteException {
		switch(ingredient) 
		{
		case "cornichons":
			return cornichons.getPrix();
		case "safran":
			return safran.getPrix();
		case "sel":
			return sel.getPrix();
		case "poivre":
			return poivre.getPrix();
		}
		return 0;
	}



}
