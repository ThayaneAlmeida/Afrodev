
public class ContaProgram {
	public static void main (String args []) {
	
	Conta conta = new Conta(); // instacia o objeto conta
	
	// testar os métodos criados na classe conta
	
	conta.titular = "Thayane";
	conta.numeroConta = 1234;
	conta.saldo = 3550.00;
	
	conta.depositar(200);
	conta.sacar(225.00);
	
	System.out.println("Titular: " + conta.titular);
	System.out.println ("-------------------------");
	System.out.println("Número da conta: " + conta.numeroConta);
	System.out.println ("-------------------------");
	System.out.println ("Saldo atual: " + conta.saldo);
}
}