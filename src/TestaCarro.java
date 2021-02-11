
public class TestaCarro {
	public static void main ( String args []) {
		
		Carro meuCarro = new Carro();
		
		meuCarro.modelo = "Tucson";
		meuCarro.cor = "Preto";
		meuCarro.velocidadeAtual = 60;
		
		meuCarro.liga();
		meuCarro.acelera(20);
		meuCarro.pegaMarcha();
		
		System.out.println("O modelo do carro é: " + meuCarro.modelo);
		System.out.println("----------------------------------------");
		System.out.println("A cor do carro é: " + meuCarro.cor);
		System.out.println("----------------------------------------");
		System.out.println();
		
	}
	
}
