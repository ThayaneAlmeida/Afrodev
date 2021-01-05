import java.util.Scanner;

public class ExercicioWhile2 {
	public static void main (String args[]) {
		// imprime um texto 5 vezes
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um texto: ");
		String texto = in.nextLine();
		
		int i=0;
		while(i<5) {
			System.out.println("Texto: " + texto);
			i++;
		}
		in.close();
	}
}
