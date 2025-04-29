package corso;

public class ProvaStringhe {
	public static void main(String[] args) {
		
		String txt = "ciaociaociao";
		
		System.out.println("the length is: " + txt.length());
		
		String txt2 = "please locate where 'locate' occours!";
		System.out.println(txt.indexOf("where"));
		
		String firstName = "John";
		String lastName = "Doe";
		
		System.out.println(firstName + " " + lastName);
		
		String firstName2 = "John ";
		String lastName2 = "Doe";
		
		System.out.println(firstName2 + lastName2);
		
		String password = "Manuel";
		String verificap = "Manuel";
		//Verifica se le due stringhe sono identiche
		System.out.println(password.equals(verificap));
		//verifica se la stringa è vuota
		System.out.println(verificap.isEmpty());
		
		//stampa true o false se la parola che forniamo viene trovata
		String frase = "ciao, come stai";
		System.out.println(frase.contains("come"));
		
	}

}
