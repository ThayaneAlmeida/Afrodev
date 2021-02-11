
public class IndiceMassaCorporal {
	
	String nome;
	double peso;
	double altura;
	double finalValorIMC;
	
	public double calcular(double peso,double altura) {
		finalValorIMC = peso/(altura * altura);
		return finalValorIMC;
		}
	
	public String interpretaIMC(double finalValorIMC) {
		if (finalValorIMC < 18.5) {
			return ("adulto com baixo peso");
		}
		else if (finalValorIMC >=18.5 && finalValorIMC<25) {
			return ("adulto com peso adequado");
		}
		else if (finalValorIMC >=25 && finalValorIMC<30) {
			return ("adulto com sobrepeso");
		}
		else {
			return ("obesidade");
		}
	}
}
