package PackageRMI;

import java.rmi.Naming;
import java.util.Scanner;

public class main {

	public static void getPrice(int numIngrediant) throws Exception {
		Store stubMag1 = (Store) Naming.lookup("rmi://localhost:1000/mag1");
		Store stubMag2 = (Store) Naming.lookup("rmi://localhost:2021/mag2");
		Store stubMag3 = (Store) Naming.lookup("rmi://localhost:2022/mag3");
		float f1 = 0;
		float f2 = 0;
		float f3 = 0;
		switch (numIngrediant) {
		case 1:
			f1 = stubMag1.getPrice("cornichons");
			f2 = stubMag2.getPrice("cornichons");
			f3 = stubMag3.getPrice("cornichons");
			if ((f1 < f2) && (f1 < f3)) {

				System.out.println("Le prix le plus bas de l'ingredient  'cornichons'  est de ' "+ f1 +"DT ' et se trouve chez ' Mag1 '.");
				break;
			} else if ((f2 < f1) && (f2 < f3)) {
				System.out.println("Le prix le plus bas de l'ingredient ' cornichons ' est de ' "+ f2 +"DT ' et se trouve chez ' Mag2 '"); 

				break;
			} else {
				System.out.println("Le prix le plus bas de l'ingredient ' cornichons ' est de ' "+ f3 +"DT ' et se trouve chez '  Mag3 '.");
				
				break;
			}
		case 2:
			f1 = stubMag1.getPrice("safran");
			f2 = stubMag2.getPrice("safran");
			f3 = stubMag3.getPrice("safran");
			if ((f1 < f2) && (f1 < f3)) {
				System.out.println("Le prix le plus bas de l'ingredient ' safran ' est de ' "+ f1 +"DT ' et se trouve chez ' Mag1 '.");
				
				break;
			} else if ((f2 < f1) && (f2 < f3)) {
				System.out.println("Le prix le plus bas de l'ingredient ' safran ' est de ' "+ f2 +"DT ' et se trouve chez ' Mag2 '.");
				
				break;
			} else {
				
				System.out.println("Le prix le plus bas de l'ingredient ' safran ' est de ' "+ f3 +"DT ' et se trouve chez '  Mag3 '.");
				break;
			}
		case 3:
			f1 = stubMag1.getPrice("sel");
			f2 = stubMag2.getPrice("sel");
			f3 = stubMag3.getPrice("sel");
			if ((f1 < f2) && (f1 < f3)) {
				System.out.println("Le prix le plus bas de l'ingredient ' sel ' est de ' "+ f1 +"DT ' et se trouve chez '  Mag1 '.");
				
				break;
			} else if ((f2 < f1) && (f2 < f3)) {

				System.out.println("Le prix le plus bas de l'ingredient ' sel ' est de ' "+ f2 +"DT ' et se trouve chez '  Mag2 '.");
				
				break;
			} else {
				System.out.println("Le prix le plus bas de l'ingredient ' sel ' est de ' "+ f3 +"DT ' et se trouve chez '  Mag3 '.");
				break;
			}
		case 4:
			f1 = stubMag1.getPrice("poivre");
			f2 = stubMag2.getPrice("poivre");
			f3 = stubMag3.getPrice("poivre");
			if ((f1 < f2) && (f1 < f3)) {
				System.out.println("Le prix le plus bas de l'ingredient ' poivre ' est de ' "+ f1 +"DT ' et se trouve chez '  Mag1 '.");

				
				break;
			} else if ((f2 < f1) && (f2 < f3)) {
				System.out.println("Le prix le plus bas de l'ingredient ' poivre ' est de ' "+ f2 +"DT ' et se trouve chez '  Mag2 '.");
				break;
			} else {
				System.out.println("Le prix le plus bas de l'ingredient ' poivre ' est de ' "+ f3 +"DT ' et se trouve chez '  Mag3 '.");
				break;
			}

		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		System.out.println("Selectionnez le numero de l'ingredient :");
		System.out.println("[1] cornichons");
		System.out.println("[2] safran");
		System.out.println("[3] sel");
		System.out.println("[4] poivre");
		int choice = scanner.nextInt();
		
			switch (choice) {
			case 1:
				getPrice(1);
				break;
			case 2:
				getPrice(2);
				break;
			case 3:
				getPrice(3);
				break;
			case 4:
				getPrice(4);
				break;
			default:
				System.out.println("Choix invalide !");
				scanner.close();
				return;
			}
		}


}
