
public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	// método ligar
	  void liga() {
		System.out.println("O carro está ligado");
	 }
	 
	 // método para acelerar certa quantidade
	  void acelera(double quantidade) { // recebe o valor que será a velocidade atual
		 double velocidadeNova = velocidadeAtual+ quantidade;
		 this.velocidadeAtual = velocidadeNova;
	 }
	 
	 //retorna a velocidade do carro de acordo com a velocidade
	  int pegaMarcha() {
		 if(velocidadeAtual < 0 ) {
			 return -1;
		 }
		  if (velocidadeAtual >= 0 && velocidadeAtual < 40) {
			  return 1;
		  }
		  
		  if (velocidadeAtual > 40 && velocidadeAtual < 80) {
			  return 2;
		  }
		  
		  else {
			  return 3;
		  }
	 }
	 
}
