package program;

import java.util.Locale;
import java.util.Scanner;

public class Invercao_de_palavra {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		for(int i = name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
		sc.close();
	}

}
