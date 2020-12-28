import java.util.Scanner;

public class ExercicioWhile {
	// imprime um telefone digitado 5 vezes utilizando o while
	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número de telefone");
		String telefone = in.nextLine();
		
		// imprime o telefone 5 vezes
		int i=0;
		while(i<5) {
			System.out.println(telefone); 
			i++;
		}
		in.close();
	}
}
