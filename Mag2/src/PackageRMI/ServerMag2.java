package PackageRMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMag2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Registry registry = LocateRegistry.createRegistry(2021);
		registry.bind("mag2", new StoreManager2());
		System.out.println("server mag2 est pret....");

	}

}
