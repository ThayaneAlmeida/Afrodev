import java.util.Scanner;

public class ExercicioSwitch {
	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha uma linguagem: C ou Java");
		String entrada = in.nextLine();
		
		switch(entrada) {
	    case "C":
			System.out.println("Esta linguagem é estruturada");
		break;
		case "Java":
			System.out.println("Melhor escolha! Esta linguagem é Orientada a Objetos!");
		break;
		default:
			System.out.println("Linguagem desconhecida");
		}
		in.close();
	}
}
