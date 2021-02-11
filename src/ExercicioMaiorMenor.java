import java.util.Scanner;

public class ExercicioMaiorMenor {

	//ler 3 números inteiros de entrada e imprimir o maior e o menor utilizando if
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros: ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int minimo;
		int maximo;
		
	 if (n1>n2) {
		 maximo = n1;
	 }
	 else if (n2>n3) {
		 maximo = n2;
	 }
	 else {
		 maximo = n3;
	 }
	 
	 if (n1<n2) {
		minimo = n1;
	 } 
	 else if (n2<n3) {
		 minimo = n2;
	 }
	 else {
		 minimo = n3;
	 }
	 System.out.println("O número maior é: " + maximo);
	 System.out.println("O menor número é: " + minimo);
	 
	}
}
