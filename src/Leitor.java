 // utilização da classe Scanner
import java.util.Scanner;

public class Leitor {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? "); 
		String nome = in.next();
		System.out.println("Olá " + nome + ".Qual a sua idade? ");
		int idade = in.nextInt();
		System.out.println("Ah! Então você tem " + idade + " anos " + nome);
		
		in.close();
	}

}
