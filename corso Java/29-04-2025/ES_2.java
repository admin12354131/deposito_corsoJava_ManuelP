package corso;

import java.util.Scanner;

public class ES_2 {
	public static void main(String[] args) {
		int numeroDaIndovinare = 6;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Benvenuto giocatore, inserisci il tuo numero");
		int numeroInserito = scan.nextInt();
		if(numeroInserito == 6) {
			System.out.println("complimenti! hai indovinato :D ");
		}else if(numeroInserito > numeroDaIndovinare) {
			System.out.println("Il numero da indovinare è più basso");
		 }else if(numeroInserito < numeroDaIndovinare) {
			 System.out.println("Il numero da indovinare è più alto");
		 }
		}
	}


