import java.util.Scanner;

public class ProgramaIMC {
	public static void main (String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		IndiceMassaCorporal imc = new IndiceMassaCorporal();
		
		System.out.println("Digite o nome: ");
		imc.nome= in.nextLine();
		
		System.out.println("Digite o peso em kg: ");
		imc.peso= in.nextDouble();
		
		System.out.println("Digite a altura em metros: (Ex: 1,57)");
		imc.altura = in.nextDouble();
		
		
		System.out.printf("Olá, %s \n",imc.nome);
		System.out.println("--------------------------------");
		System.out.printf("O valor do seu IMC é: %.2f\n", imc.calcular(imc.peso,imc.altura));
		System.out.println(imc.interpretaIMC(imc.finalValorIMC));
		
		in.close();
	}
}
