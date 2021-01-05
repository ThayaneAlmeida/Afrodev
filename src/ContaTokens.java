import java.util.Scanner;

public class ContaTokens {
	// criar um método que recebe um texto e imprime 5 vezes utilizando o while
		public void imprimiContaTokens(String texto) {
			Scanner in = new Scanner(System.in);
			texto = in.nextLine();
			int i=0;
				while(i<5) {
					System.out.println("Seu texto digitado: " + texto);
				i++;	
				}
			in.close();	
	}
}
