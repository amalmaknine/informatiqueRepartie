package PackageRMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMag3 {

	public static void main(String[] args)throws Exception {
		Registry registry = LocateRegistry.createRegistry(2022);
		registry.bind("mag3", new StoreManager());
		System.out.println("server mag3 est pret....");

	}

}
