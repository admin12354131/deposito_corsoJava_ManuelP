package corso;

import java.util.Scanner;

public class ES_1 {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); //creo uno scanner
		System.out.println("Inserire int:");
		
		int myInt = myObj.nextInt(); //legge l'input dell utente
		System.out.println("L'int inserito è : " + myInt);
		
		Scanner myObj2 = new Scanner (System.in);
		System.out.println("Inserire stringa");
		
		String myString = myObj2.next();
		System.out.println("la stringa inserita è: " + myString);
		
		Scanner myObj3 = new Scanner(System.in);
		System.out.println("Inserire un float");
		
		float myFloat = myObj3.nextFloat();
		System.out.println("il float inserito è: " + myFloat);
		
		Scanner myObj4 = new Scanner(System.in);
		System.out.println("Inserire un double");
		
		double myDouble = myObj4.nextDouble();
		System.out.println("il double inserito è : " + myDouble);
		
		Scanner myObj5 = new Scanner(System.in);
		System.out.println("true o false? ");
		
		boolean myBoolean = myObj5.nextBoolean();
		System.out.println("boolean inserito : " + myBoolean);
		
	}

}
