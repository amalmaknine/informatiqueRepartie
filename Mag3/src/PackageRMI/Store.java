package PackageRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Store extends Remote{
	public float getPrice(String ingredient)throws RemoteException;

}
