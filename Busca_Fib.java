package program;

import java.util.Locale;
import java.util.Scanner;

public class Busca_Fib {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int busca = sc.nextInt();
		
		if(fib(busca)) System.out.println("pertence");
		
		else System.out.println("não pertence");
		
		sc.close();
	}
	
	public static boolean fib(int busca) {
		
		int seq = 1, ant = 1, aux;
		if(busca == 0) return true;
		while(true) {
			if(busca == seq) return true;
			aux = seq;
			seq = ant+seq;
			ant = aux;
			if(seq>busca) break;
		}
		return false;
	}

}
