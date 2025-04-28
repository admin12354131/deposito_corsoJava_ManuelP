package corso;

import java.util.Scanner;

public class PrimiScanner {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); //crea un oggetto scanner
		System.out.println("Enter username");
		
		String userName = myObj.nextLine(); //legge l'input dell'utente
		System.out.println("Username is: " + userName);
		
		Scanner myObj2 = new Scanner (System.in);
		System.out.println("inserire eta");
		int eta = myObj2.nextInt();
		System.out.println("eta : " + eta);
	}

}
