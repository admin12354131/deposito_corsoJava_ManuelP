package corso;

import java.util.Scanner;

public class ES_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double prezzoBase = 500.00;
		
		//inserire eta conducente
		System.out.println("inserire eta conduecente");
		int eta = scan.nextInt();
		
		if(eta < 18) {
			System.out.println("non hai l'età per l assicurazione");
		}else if(eta >= 18 && eta <= 25) {
			
		}
	}

}
