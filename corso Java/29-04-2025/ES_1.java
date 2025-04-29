package corso;

import java.util.Scanner;

public class ES_1 {
	public static void main(String [] args) {
		String password = "12345";
		String username = "Manuel";
		Scanner scan = new Scanner(System.in);
		System.out.println("inserire username : ");
		String usernameDaInserire = scan.next();
		if(username.equals(usernameDaInserire)) {
			System.out.println("username corretto");
		}else {
			System.out.println("username errato");
		}
		System.out.println("inserisci password");
		String passwordDaInserire = scan.next();
		if(passwordDaInserire.equals(password)) {
			System.out.println("Password corretta :)");
		}else {
			System.out.println("password errata");
		}
	}

}
