package PackageRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class StoreManager extends UnicastRemoteObject implements Store{

	protected StoreManager() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	Ingrediant  cornichons = new Ingrediant("cornichons",10);
	Ingrediant  safran = new Ingrediant("safran",1000);
	Ingrediant  sel = new Ingrediant("sel",1);
	Ingrediant  poivre = new Ingrediant("poivre",100);

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
