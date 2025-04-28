package corso;

import java.util.Scanner;

public class ES_2 {
	public static void main(String []args) {
		//creazione scanner
		Scanner controllo = new Scanner(System.in);
		
		//richiesta numero
		System.out.println("Inserire il primo numero");
		int num1 = controllo.nextInt();
		
		System.out.println("inserire secondo numero");
		int num2 = controllo.nextInt();
		
		System.out.println("inserire terzo numero");
		int num3 = controllo.nextInt();
		
		System.out.println("inserire quarto numero");
		int num4 = controllo.nextInt();
        // Controllo se il primo è maggiore del secondo E il terzo maggiore del quarto
		boolean condizione1 = (num1 > num2) && (num3 > num4);
		System.out.println(condizione1);
        
		// Controllo se il primo è minore del secondo O il terzo è uguale al quarto
		boolean condizione2 = (num1 < num2) || (num3 == num4);
		System.out.println(condizione2);

		// Controllo se il primo numero non è uguale al quarto
		boolean condizione3 = !(num1 == num4);
		System.out.println(condizione3);

		
	}

}
