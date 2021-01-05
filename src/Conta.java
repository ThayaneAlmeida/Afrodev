
public class Conta {
	String titular;
	int numeroConta;
	double saldo;
	
	//método void para sacar dinheiro
	public void sacar(double quantidade) {				
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	//método que retorne o novo saldo do tipo double
	
	public double depositar (double deposito) {
		double novoSaldo = this.saldo + deposito;
		this.saldo = novoSaldo;
		return novoSaldo;
	}
}
