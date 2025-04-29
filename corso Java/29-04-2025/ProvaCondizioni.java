package corso;

public class ProvaCondizioni {
	public static void main(String[] args) {
		
		int x = 60;
		int y = 20;
		
		if(x > y) {
			System.out.println("X è Maggiore di Y");
			
		}
		
		int time = 20;
		if(time < 18) {
			System.out.println("Good day.");
		}else {
			System.out.println("Good evening");
		}
		
		int numero = 16;
		
		if (numero < 10) {
			System.out.println("numero minore di 10");
		}else if(numero < 18) {
			System.out.println("numero minore di 18");
		}else {
			System.out.println("numero uguale o maggiore a 20");
		}
		
		int time2 = 22;
		
		String result = (time2 < 18) ? "Good day." : "Good evening";
		System.out.println(result);
	}

}
