package corso;

public class ProvaVariabili {
	public static void main(String[] args) {
	//stampa 3 a schermo	
	System.out.println(3);
	//stampa 358 a schermo
	System.out.println(358);
	//stampa 50000 a schermo
	System.out.println(50000);
	//stampa il risultato di 3 + 2 a schermo
	System.out.println(3 + 2);
	//stampa il risultato di 3 * 2
	 System.out.println(3 * 2);
	 
	 /*esempio di:
	  * commento
	  * multi riga
	  */
	 
	 int provaNumero = 123;
	 String provaTesto = "ciao";
	 boolean provaBool = true;
	 
	 System.out.println(provaNumero);
	 System.out.println(provaTesto);
	 System.out.println(provaBool);
	 
	 //si può anche combinare il testo di piu variabili
	 String firstPart = "ciao ";
	 String secondPart = "mondo";
	 String fullPart = firstPart + secondPart;
	 System.out.println (fullPart);
	 
	 //in questo caso il + non si occuperà di concatenare ma di sommare
	 int numeroInteroUno = 5;
	 int numeroInteroDue = 3;
	 System.out.println(numeroInteroUno + numeroInteroDue);
	 
	 /*si possono anche dichiarare piu 
	 variabiliutilizzando un elenco separato da virgole*/
	 int numeroInteroTre = 5 , numeroInteroQuattro = 6, numeroInteroCinque = 50;
	 System.out.println(numeroInteroTre + numeroInteroQuattro + numeroInteroCinque);
	//N.B i nomi delle variabili devono essere parlanti	 
	 
	 //float
	 float myFloat = 5.75f;
	 
	 //double
	 double myDouble = 88.95d;
	 
	 System.out.println(myFloat);
	 System.out.println(myDouble);
	 
	 boolean vero = true;
	 boolean falso = false;
	 
	 System.out.println(vero);
	 System.out.println(falso);
	 
	 
			 
	}
}
