package corso;

public class OperatoriJava {
	public static void main (String[] args) {
		
		//Operatori di assegnazione 
		int x = 10;
		x += 5;
		
		System.out.println(x);
		
		//Operatori matematici
		int resto = 5%2;
		System.out.println(resto);
		int incremento = 10;
		incremento++;
		System.out.println(incremento);
		int decremento = 10;
		decremento--;
		System.out.println(decremento);
		
		//operatori di confronto
		int e = 5;
		int f = 6;
		System.out.println(e>f);
		
		int n1 = 5;
		int n2 = 6;
		System.out.println(n1 <= n2);
	
		System.out.println(n1 >= n2);
		
		System.out.println(n1 == n2);
		
		//Operatori Logici
		 System.out.println(x < 5 && x > 10); 
		 System.out.println(x > 5 || x < 4);
		 System.out.println (!(x < 5 && x > 10));
		
	}

}
