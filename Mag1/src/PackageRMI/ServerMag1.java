package PackageRMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ServerMag1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Registry registry = LocateRegistry.createRegistry(1000);
		registry.bind("mag1", new StoreManager());
		System.out.println("server mag1 est pret....");
	}

}
